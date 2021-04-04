package com.lounes.bean;

public class Bean {
	private String lastName;
	private String firstName;
	private boolean genius;

	public String getLastName() {
		return this.lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public boolean isGenius() {
		return this.genius;
	}

	public void setLastName( String lastName ) {
		this.lastName = lastName;
	}

	public void setFirstName( String firstName ) {
		this.firstName = firstName;
	}
	public void setGenius( boolean genius ) {
		this.genius = genius;
	}
}
