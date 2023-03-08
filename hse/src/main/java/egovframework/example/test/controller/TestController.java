package egovframework.example.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import egovframework.example.test.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/testList")
	public String testList() {
		System.out.println("test list go ");
		return "test/testList";
	}
	
	
	@RequestMapping("/testGetUserList")
	@ResponseBody
	public ModelAndView testGetUserList() throws Exception {
		System.out.println("get user list");
		List<HashMap<String, Object>> list = testService.testGetUserList();
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("list", list);
		System.out.println("aaaaaaaaaaaaaaaa");
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("jsonView");
		
		return mv;
	}

} 
