package com.example.demo.Service;

public abstract class DocumentAbstract implements DocumentServiceInterface {

	@Override
	public void readData() {
		System.out.println("Read Data From DB");

	}

	public String printFile() {
		readData();
		processData();
		return printData();
	}

}
