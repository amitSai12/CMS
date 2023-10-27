package com.java.op;

import java.util.Optional;

public class DataDao {

	static Data data;
	
	public void showDao() {
		Optional<Data> result = Optional.ofNullable(data);
		if (result.isPresent()) {
			data.show();
		} else {
			System.out.println("Object Memory Not Happend...");
		}
	}
}
