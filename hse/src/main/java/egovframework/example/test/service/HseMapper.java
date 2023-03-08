package egovframework.example.test.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HseMapper {
	public List<HashMap<String, Object>> getEmcitt01() throws Exception;

}
