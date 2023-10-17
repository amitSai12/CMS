package com.java.hib3;

import java.sql.SQLException;
import java.util.Scanner;

public class AgentAddMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		Agent agent= new Agent();
		
		System.out.println("Enter Agent Name: ");
		agent.setName(sc.next());
		System.out.println("Enter City");
		agent.setCity(sc.next());
		System.out.println("Enter gender MALE/FEMALE");
		agent.setGender(Gender.valueOf(sc.next()));		
		System.out.println("Enter MaritalStatus ");
		agent.setMaritalStatus(sc.nextInt());
		System.out.println("Enter your basic premium");
		agent.setPremium(sc.nextDouble());
		
		AgentDAO dao = new AgentDAOImpl();
		System.out.println(dao.addAgentDao(agent));
	}
}
