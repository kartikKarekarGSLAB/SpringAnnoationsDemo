package com.gslab.annotations.model;

public class Sender {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Sender [name=" + name + "]";
	}

	public Sender(String name) {
		super();
		this.name = name;
	}
	public Sender() {
		// TODO Auto-generated constructor stub
	}
}
