package a.b.c.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import a.b.c.service.ItestService;

@Controller
public class TestController {
	
	@Autowired
	public ItestService iTestService;

	@RequestMapping(value="/")
	public ModelAndView test(@RequestParam HashMap <String, String> params,
							 ModelAndView mav) {
		HashMap<String,String> data = iTestService.testGetData(); 
		
		mav.setViewName("index");
		return mav;
	}
	
}
