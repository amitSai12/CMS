package com.java.emp;

public class FilterEx2 {
	
	package com.java.emp;

	import java.util.ArrayList;
	import java.util.List;

	public class FilterEx1 {
		
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
			
			employList.stream().filter((e)->e.getBasic() >=50000).forEach(x->{System.out.println(x);
			});
			
			System.out.println("NAME STARTS WITH A ");
			employList.stream()
		}

	}


}
