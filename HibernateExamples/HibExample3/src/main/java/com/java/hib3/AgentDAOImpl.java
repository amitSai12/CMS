package com.java.hib3;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.hib3.Agent;
import com.java.hib3.SessionHelper;

public class AgentDAOImpl implements AgentDAO{

SessionFactory sf;
Session session;

	@Override
	public List<Agent> showAgentDao() throws ClassNotFoundException, SQLException {
		sf= SessionHelper.getConnection();
		session = sf.openSession();
		Query query = session.createQuery("from Agent");
		List<Agent> agentList = query.list();
		return agentList;
	}

	@Override
	public String addAgentDao(Agent agent) throws ClassNotFoundException, SQLException {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans =session.beginTransaction();
		session.save(agent);
		trans.commit();
		
		return "Agent Record Inserted...";
	}

	@Override
	public Agent searchAgentDao(int agentId) throws ClassNotFoundException, SQLException {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Query query = session.createQuery("from Agent where agentId="+agentId);
		List<Agent> agentList = query.list();
		if(agentList.size()>0) {
			return agentList.get(0);
		}
		session.close();
		return null;
	}

	@Override
	public String deleteAgentDao(int agentId) throws ClassNotFoundException, SQLException {
		Agent agentFound = searchAgentDao(agentId);
		System.out.println(agentFound);
		sf = SessionHelper.getConnection();
		if(agentFound!=null) {
		session = sf.openSession();
		Transaction trans =session.beginTransaction();
		session.delete(agentFound);
		trans.commit();
		return "Agent Record Deleted ...";
		}
		return "Record not Found...";
	}
	
	

	@Override
	public String updateAgentDao(Agent agentNew) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
