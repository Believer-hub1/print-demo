package com.example.demo.Service;

public class PaintServicesImpl extends DocumentAbstract {

	@Override
	public void processData() {
		System.out.println("Process the Data for Paint");
		
	}

	@Override
	public String printData() {
		System.out.println("Printing the Paint");
		return "Printing the paint";
	}

}
