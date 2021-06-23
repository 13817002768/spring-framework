package com.gqzdev.service;


import org.springframework.stereotype.Service;

@Service
public class TestService implements Service1 {

	@Override
	public void add(){
		System.out.println("执行了add方法");
	}
}
