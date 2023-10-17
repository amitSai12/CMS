package com.java.jsf;

import java.util.Date;

public class Greeting {

		public String Company() {
			return "Company is Infinite";
		}
		
		public String Salutation(){
			Date obj = new Date();
			int hr = obj.getHours();
			if(hr <=12) {
				return "Good Morning";
			}else if(hr > 12 && hr < 16) {
				return "Good Afternoon";
			}else {
				return "Good Evening";
			}
		}
}