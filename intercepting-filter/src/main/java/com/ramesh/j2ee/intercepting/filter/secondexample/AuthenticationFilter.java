package com.ramesh.j2ee.intercepting.filter.secondexample;

public class AuthenticationFilter implements Filter {
	public void execute(String request) {
		System.out.println("Authenticating request: " + request);
	}
}
