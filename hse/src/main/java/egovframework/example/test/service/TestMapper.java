package egovframework.example.test.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
	
	List<HashMap<String, Object>> testGetUserList() throws Exception;
}
