package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.TestEntity;
import com.example.demo.TestRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServices {
	@Autowired
	TestRepository repository;
	public List<TestEntity> getAllItems() {
		var list = repository.findAll();
		return list;
		
//		public TestEntity insertItem() {
//		var instance = new TestEntity();
//		instance.id = 10;
//		instance.name = "test";
//		return repository.save(instance);
//	}
	}
}

