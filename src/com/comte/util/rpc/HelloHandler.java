package com.comte.util.rpc;

public class HelloHandler implements ServicesHandler {

	@Override
	public String execute(String str) {
		// TODO Auto-generated method stub
		//return null;
		return "hello "+str+"!";
	}

}
