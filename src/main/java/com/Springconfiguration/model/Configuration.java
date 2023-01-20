package com.Springconfiguration.model;

public class Configuration {
	private String name;
	private String email;
	private String address;
	private long pin;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPin() {
		return pin;
	}
	public void setPin(long pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Configuration [name=" + name + ", email=" + email + ", address=" + address + ", pin=" + pin + "]";
	}
}
	
	