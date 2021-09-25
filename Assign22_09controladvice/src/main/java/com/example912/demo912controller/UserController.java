package com.example912.demo912controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example912.demo912model.User;
import com.example912.demo912service.IUserService;

@RestController
@RequestMapping("/user")

public class UserController {

	@Autowired
	private IUserService uservice;

	@PostMapping("/create")
	public User met1(@RequestBody User user) {
		return uservice.createUser(user);

	}

	@GetMapping("/getall")
	public List<User> met2() {
		return uservice.getAllUsers();
	}

	@GetMapping("/get")
	public User met3(@RequestParam(name="uid", required=true, defaultValue="1") int uid, 
			@RequestHeader Map<String, String> headers)
	
	{
	headers.forEach((hname,hvalue)->{System.out.println(hname+"->"+hvalue);});
		return uservice.getUser(uid);
		
	}

@DeleteMapping("/{uid}")
public ResponseEntity met4(@PathVariable("uid") int uid)
{
	
	if(uservice.deleteUser(uid)==0)
	{
	return new ResponseEntity(HttpStatus.NOT_FOUND);
	
	//if user doesn't exist,give http staus code 404
	//
	}
	else
	{
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
	
}
	
}