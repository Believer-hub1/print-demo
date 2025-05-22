package com.example.demo.Service;

public class wordServiceImpl extends DocumentAbstract{

	

	@Override
	public void processData() {
		System.out.println("Process Data For Word");
		
	}

	@Override
	public String printData() {
		System.out.println("Word Printed");
		return "PRINTING WORD";
	}

}
