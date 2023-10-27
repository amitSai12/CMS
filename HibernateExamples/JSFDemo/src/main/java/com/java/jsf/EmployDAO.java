package com.java.jsf;

import java.util.ArrayList;
import java.util.List;

public class EmployDAO {

	public List<String> getNames(){

			List<String> names=new ArrayList<String>();
			names.add("Amit");
			names.add("Ariz");
			names.add("Subudhi");
			names.add("Satya");
			names.add("Rohan");
			return names;
		
	}
	
		public List<Employ> showEmploy(){
			
			List<Employ> employList = new ArrayList<Employ>();
			employList.add(new Employ(1,"Gaurav", "Java", "Developer", 12344.44));
			employList.add(new Employ(2,"Amit", "CSS", "Designer", 13344.44));
			employList.add(new Employ(3,"Ariz", "DSA", "Teacher", 14344.44));
			employList.add(new Employ(4,"Subudhi", "HTML", "Trainer", 15344.44));
			employList.add(new Employ(5,"Satya", "C", "Beginner", 16344.44));
			return employList;
			
		}
}
