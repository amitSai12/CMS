package com.java.agent;

import java.sql.SQLException;
import java.util.Scanner;

public class AgentInsertMain {
	
	public static void main(String[] args) {
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
		
		AgentDAO dao = new AgentDaoImpl();
		try {
			System.out.println(dao.addAgentDao(agent));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
