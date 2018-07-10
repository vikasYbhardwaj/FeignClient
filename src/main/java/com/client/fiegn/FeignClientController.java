package com.client.fiegn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignClientController {
	@Autowired
	UserCient userCient;

	@GetMapping("/findAll")
	public String getAllUser(){
		return userCient.getUser() +" using feign client";
	}
	

}
