package com.ramesh.j2ee.intercepting.filter.secondexample;

public class DebugFilter implements Filter {
	public void execute(String request) {
		System.out.println("request log: " + request);
	}
}