package egovframework.example.test.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.test.dao.HseDao;
import egovframework.example.test.service.HseService;

@Service
public class HseServiceImpl implements HseService{
	
	@Autowired HseDao hseDao;
	
	@Override
	public List<HashMap<String, Object>> getEmcitt01() throws Exception {
		
		return hseDao.getEmcitt01();
	}

}
