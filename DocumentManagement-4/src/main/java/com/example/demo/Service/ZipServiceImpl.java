package com.example.demo.Service;

public class ZipServiceImpl extends DocumentAbstract {

	@Override
	public void processData() {
		System.out.println("Process Data for Zip");
		
	}

	@Override
	public String printData() {
		System.out.println("Printing Zip");
		return "Printing Zip on Server";
	}

}
