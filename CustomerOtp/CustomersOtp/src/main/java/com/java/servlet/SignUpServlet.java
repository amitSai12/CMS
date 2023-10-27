package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pwd, reType;
        PrintWriter out = response.getWriter();
        pwd = request.getParameter("passWord");
        reType = request.getParameter("retypePassword");

        if (pwd.equals(reType)) {
            String userName = request.getParameter("userName");
            CustomerDAO dao = new CustomerDAOImpl();

            try {
                Customer customer = dao.searchByUserName(userName);

                if (customer == null) {
                    Customer customerNew = new Customer();
                    customerNew.setFirstName(request.getParameter("firstName"));
                    customerNew.setLastName(request.getParameter("lastName"));
                    customerNew.setUserName(userName); // Use the userName obtained from the request
                    String encr = EncryptPassword.getCode(pwd); // Encrypt the password directly
                    customerNew.setPassword(encr);
                    customerNew.setEmail(request.getParameter("email"));
                    customerNew.setPhoneNo(request.getParameter("phoneNo"));
                    
                    // Assuming the addCustomer method returns a message
                    String message = dao.addCustomer(customerNew);
                    out.println(message);
                } else {
                    out.println("UserName Already Exists...");
                }
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                out.println("Error occurred during registration.");
            }
        } else {
            out.println("Password and Retype Password Must be Same...");
        }
    }
}
