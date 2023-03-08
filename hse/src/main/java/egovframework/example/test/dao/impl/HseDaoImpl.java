package egovframework.example.test.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.example.test.dao.HseDao;
import egovframework.example.test.service.HseMapper;
import egovframework.example.test.service.TestMapper;

@Repository
public class HseDaoImpl implements HseDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<HashMap<String, Object>> getEmcitt01() throws Exception {
		 HseMapper mapper = sqlSession.getMapper(HseMapper.class);
		return mapper.getEmcitt01();
	}

}
