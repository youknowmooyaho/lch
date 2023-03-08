package egovframework.example.test.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.example.test.dao.TestDao;
import egovframework.example.test.service.TestMapper;

@Repository
public class TestDaoImpl implements TestDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<HashMap<String, Object>> testGetUserList() throws Exception {
		System.out.println("mapper 단");
		TestMapper mapper = sqlSession.getMapper(TestMapper.class);
		return mapper.testGetUserList();
	}

}
