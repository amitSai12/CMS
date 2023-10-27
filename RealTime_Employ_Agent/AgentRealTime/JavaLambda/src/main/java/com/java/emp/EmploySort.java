package com.java.emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmploySort {
	
	public static void main(String[] args) {
		
		List<Employ> employList = new ArrayList<Employ>();
		
		employList.add(new Employ(1,"Amit",48224));
		employList.add(new Employ(2,"Sai",12324));
		employList.add(new Employ(3,"Varun",48236));
		employList.add(new Employ(4,"Karna",48224));
		employList.add(new Employ(5,"Surya",98624));
		employList.add(new Employ(6,"Dhriti",58224));
		employList.add(new Employ(7,"Rajan",88256));
		employList.add(new Employ(8,"Bayu",98224));
		
		System.out.println("SORT BY NAME WISE");
		System.out.println("------------------");
		
		Collections.sort(employList,(e1, e2) ->{
		return e1.getName().compareTo(e2.getName());		
	});
		employList.forEach(System.out::println);
		
		Collections.sort(employList,(e1,e2)->{
			return (int) (e1.getBasic() - e2.getBasic());
		});
		
		System.out.println("\nSORT BY BASIC");
		System.out.println("--------------");
		employList.forEach(System.out::println);
		
		
	}
}
