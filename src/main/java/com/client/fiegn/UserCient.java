package com.client.fiegn;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(url="http://user-DB-Server/user/db/api/users",name="USER-CIENT")
@FeignClient("user-DB-Server")
public interface UserCient {
	
	@GetMapping("/user/db/api/users")
	public String getUser();

}
