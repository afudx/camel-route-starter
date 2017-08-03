package id.nullpointr.camelroute.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
	
	@RequestMapping(method=RequestMethod.GET)
	Map<String, String> defaultController(){
		
		Map<String, String> param = new HashMap<>();
		param.put("status", "OK");
		
		return param;
		
	}
	
}
