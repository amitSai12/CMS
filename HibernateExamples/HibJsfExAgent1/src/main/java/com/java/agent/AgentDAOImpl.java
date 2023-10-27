package com.java.agent;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;



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
		public String addAgentDao(Agent agent) {
			sf = SessionHelper.getConnection();
			session = sf.openSession();
			Transaction trans = session.beginTransaction();
			session.save(agent);
			trans.commit();
			return "AgentShow.xhtml?faces-redirect=true";
	}

	@Override
	public String searchAgentDao(int agentId) throws ClassNotFoundException, SQLException {
		Map<String,Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sf = SessionHelper.getConnection();
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Query query = session.createQuery("from Agent where agentId="+agentId);
		List<Agent> agentList = query.list();
		Agent agent = agentList.get(0);
		sessionMap.put("editAgent", agent);
		return "UpdateAgent.xhtml?faces-redirect=true";
	}
	@Override
	public String deleteAgentDao(int agentId) throws ClassNotFoundException, SQLException {
		Agent agentFound = searchAgentCr(agentId);
		
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.delete(agentFound);
		trans.commit();
		return "AgentShow.xhtml?faces-redirect=true";
	}
	
	

	@Override
	public String updateAgentDao(Agent agentUpdated) throws ClassNotFoundException, SQLException {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.update(agentUpdated);
		trans.commit();
		return "AgentShow.xhtml?faces-redirect=true";
	}
	
	public Agent searchAgentCr(int agentId) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Agent.class);
		cr.add(Restrictions.eq("agentId", agentId));
		 Agent agent = (Agent)cr.uniqueResult();
		return agent;
	}
}
