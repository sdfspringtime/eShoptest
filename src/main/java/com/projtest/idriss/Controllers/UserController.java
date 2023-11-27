package com.projtest.idriss.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projtest.idriss.Entities.Users;
import com.projtest.idriss.Services.UserService;

import DTO.UserDTO;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {
@Autowired
UserService userv;
@PostMapping("/user")
public ResponseEntity<Users> savUser(@RequestBody UserDTO usr){
	
	return ResponseEntity.ok(userv.saveUser(usr));
	
}

@GetMapping("/user/{id}")
public ResponseEntity<UserDTO> finduserbyId(@PathVariable int id){
	return ResponseEntity.ok(userv.getUserbyId(id));

}
}