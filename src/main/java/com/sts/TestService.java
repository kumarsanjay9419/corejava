package com.sts;

import org.springframework.web.bind.annotation.GetMapping;

public class TestService {
	
	@GetMapping("/hello")
	public String getService()
	{
		return "hello ";
	}

}
