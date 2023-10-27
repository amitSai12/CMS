package com.java.hib3;

import java.sql.SQLException;
import java.util.Scanner;

import com.java.hib3.Agent;
import com.java.hib3.AgentDAO;
import com.java.hib3.AgentDAOImpl;

public class AgentSearchMain{
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Agent Id");
		int agentId = sc.nextInt();
		
		AgentDAO dao = new AgentDAOImpl();
		Agent agent  = dao.searchAgentDao(agentId);
		
		if(agent!=null) {
			System.out.println(agent);
			
	}
	}
}
