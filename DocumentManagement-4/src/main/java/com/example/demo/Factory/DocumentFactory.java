package com.example.demo.Factory;

import com.example.demo.Service.DocumentServiceInterface;
import com.example.demo.Service.excelServiceImpl;
import com.example.demo.Service.pdfServiceImpl;
import com.example.demo.Service.wordServiceImpl;

public class DocumentFactory {
	
	
	public static  DocumentServiceInterface getObject(String type) {
		
		if("pdfService".equals(type))
			return new pdfServiceImpl();
		
		if("excelService".equals(type))
			return new excelServiceImpl();
		
		if("wordService".equals(type))
			return new wordServiceImpl();
		
		return null;
		
	}
	

}
