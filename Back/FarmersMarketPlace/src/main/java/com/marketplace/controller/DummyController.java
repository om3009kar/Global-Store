package com.marketplace.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/dummy")
public class DummyController {

	
	
	public DummyController() {
		System.out.println("in ctor of " + getClass());
	}
	
	@GetMapping
	public List<Integer> getNumberList()
	{
		System.out.println("in get num list");
		//return (10, 20, 30, 40, 50);
		
		return getNumberList();
	}

//	private List<Integer> List(int i, int j, int k, int l, int m) {
//		// TODO Auto-generated method stub
//		return List(i,j,k,l,m);
//	}
}
