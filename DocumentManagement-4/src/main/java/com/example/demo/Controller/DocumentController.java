package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Factory.DocumentFactory;
import com.example.demo.Service.DocumentServiceInterface;

@RestController
public class DocumentController {
	
	@GetMapping("print/{type}")
	public String printInvoiice(@PathVariable String type) {
		
		DocumentServiceInterface ds=DocumentFactory.getObject(type);
		
		return ds.printFile();
	}

}
