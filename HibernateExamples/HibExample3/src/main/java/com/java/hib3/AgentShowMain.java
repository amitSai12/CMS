package com.java.hib3;

import java.sql.SQLException;
import java.util.List;

import com.java.hib3.Agent;
import com.java.hib3.AgentDAO;
import com.java.hib3.AgentDAOImpl;

public class AgentShowMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		AgentDAO dao = new AgentDAOImpl();
		List<Agent> agentList = dao.showAgentDao();
		for(Agent agent:agentList) {
			System.out.println(agent);
		
	}
	}
}
