package com.robotics.core;

public class Robot {
	private String id;
	private String type;

	public Robot(String id, String type) {
		this.id = id;
		this.type = type;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public void performTask() {
		System.out.println("Performing a generic task.");
	}
}
