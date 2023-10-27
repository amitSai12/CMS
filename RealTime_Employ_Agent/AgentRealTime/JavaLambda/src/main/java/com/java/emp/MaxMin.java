package com.java.emp;

import java.util.ArrayList;
import java.util.List;

public class MaxMin {
	
public static void main(String[] args) {
	
	List<Employ> employList = new ArrayList<Employ>();
	
	employList.add(new Employ(1,"Amit",48224));
	employList.add(new Employ(2,"Sai",12324));
	employList.add(new Employ(3,"Varun",48236));
	employList.add(new Employ(no4,"Karna",48224));
	employList.add(new Employ(5,"Surya",98624));
	employList.add(new Employ(6,"Dhriti",58224));
	employList.add(new Employ(7,"Rajan",88256));
	employList.add(new Employ(8,"Bayu",98224));
	
	Employ emoployMax =  employList.stream().max(m1, m2);
	m1.getBasic() > m2.getBasic()? 
			
	System.out.println();
}