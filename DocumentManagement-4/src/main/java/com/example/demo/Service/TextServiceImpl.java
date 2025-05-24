package com.example.demo.Service;

public class TextServiceImpl extends DocumentAbstract {

	@Override
	public void processData() {
		System.out.println("Process Data for Text");
		
	}

	@Override
	public String printData() {
		System.out.println("Printing Text");
		return "Print Text";
	}

	
}
