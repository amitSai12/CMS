/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.42
 * Generated at: 2023-10-04 16:29:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.java.complaint.Resolve;
import java.util.List;
import com.java.complaint.ComplaintDAOImpl;
import com.java.complaint.ComplaintDAO;

public final class ResolveShow_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.java.complaint.ComplaintDAO");
    _jspx_imports_classes.add("com.java.complaint.Resolve");
    _jspx_imports_classes.add("com.java.complaint.ComplaintDAOImpl");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Complaint Resolutions</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

    ComplaintDAO dao = new ComplaintDAOImpl();
    List<Resolve> resolveList = dao.showResolve();

      out.write("\r\n");
      out.write("<table border=\"3\" align=\"center\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <th>Resolve Id</th>\r\n");
      out.write("        <th>Complaint Id</th>\r\n");
      out.write("        <th>Complaint Date</th>\r\n");
      out.write("        <th>Resolve Date</th>\r\n");
      out.write("        <th>Resolved By</th>\r\n");
      out.write("        <th>Comments</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");

    for (Resolve resolve : resolveList) {
        java.util.Date complaintDate = resolve.getComplaintDate();
        java.util.Date resolveDate = resolve.getResolveDate();
        long diffInMilliseconds = resolveDate.getTime() - complaintDate.getTime();
        long diffInDays = diffInMilliseconds / (1000 * 60 * 60 * 24);
        
        // Define default row style
        String rowStyle = "";

        // Check the date difference and set row style accordingly
        if (diffInDays >= 7 && diffInDays < 10) {
            rowStyle = "background-color: pink;";
        } else if (diffInDays >= 10) {
            rowStyle = "background-color: red;";
        }
    
      out.write("\r\n");
      out.write("    <tr style=\"");
      out.print(rowStyle);
      out.write("\">\r\n");
      out.write("        <td>");
      out.print(resolve.getResolveID());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(resolve.getComplaintID());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(resolve.getComplaintDate());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(resolve.getResolveDate());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(resolve.getResolveBy());
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print(resolve.getComments());
      out.write("</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");

    }
    
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<a href = \"ComplaintApply.jsp\">Complaint Apply</a>\r\n");
      out.write("<a href = \"ComplaintShow.jsp\">Complaint Show</a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
