package egovframework.example.test.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.test.dao.TestDao;
import egovframework.example.test.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	private TestDao testDao; 
	@Override
	public List<HashMap<String, Object>> testGetUserList() throws Exception {
		System.out.println("서비스단");
		return testDao.testGetUserList();
	}

}
