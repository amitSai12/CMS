package com.java.cols;

public class ConRef {
	
	public static void main(String[] args) {
		ITest obj = Emp::new;
		Emp e = obj.showEmploy(1, "AmitSai" , 32423);
		System.out.println(e);
	}

}
