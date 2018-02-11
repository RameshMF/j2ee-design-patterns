package com.ramesh.j2ee.intercepting.filter.secondexample;

public class Target {
	public void execute(String request) {
		System.out.println("Executing request: " + request);
	}
}
