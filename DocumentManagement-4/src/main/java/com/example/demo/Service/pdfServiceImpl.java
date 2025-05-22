package com.example.demo.Service;

public class pdfServiceImpl extends DocumentAbstract{

	

	@Override
	public void processData() {
		System.out.println("Process Data For PDF");
		
	}

	@Override
	public String printData() {
		System.out.println("Pdf Printed");
		return "PRINTING PDF";
	}

}
