package com.myproject.gestionclient.model;

public class HelloWorld {
	
	private String value = "Hello hasalp";

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
	

}
