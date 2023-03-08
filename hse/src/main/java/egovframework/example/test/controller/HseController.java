package egovframework.example.test.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import egovframework.example.test.service.HseService;

@Controller
public class HseController {
	
	@Autowired
	private HseService hseService ; 
	
	@RequestMapping("/getEmcitt01")
	@ResponseBody
	public ModelAndView getEmcitt01() throws Exception{
		List<HashMap<String, Object>> temp = hseService.getEmcitt01();
		System.out.println("temp : "  + temp);
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", temp);
		mv.setViewName("jsonView");
		System.out.println("데이터 가져온거 : " + temp);
		return mv;
	}

}
