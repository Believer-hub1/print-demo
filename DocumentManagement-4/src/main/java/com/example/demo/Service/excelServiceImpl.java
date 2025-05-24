package com.example.demo.Service;

public class excelServiceImpl extends DocumentAbstract{

	

	@Override
	public void processData() {
		System.out.println("Process Data for Excel");
		
	}

	@Override
	public String printData() {
		System.out.println("Excel Printed ");
		return "PRINTING EXCEL FOR SERVER";
	}

}
