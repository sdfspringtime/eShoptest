package com.projtest.idriss.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projtest.idriss.DTO.UserDTO;
import com.projtest.idriss.DTO.UserMapper;
import com.projtest.idriss.DTO.UserMapperImpl;
import com.projtest.idriss.Entities.Users;
import com.projtest.idriss.Services.UserService;
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
public ResponseEntity<UserDTO> finduserbyId(@PathVariable long id){
	return ResponseEntity.ok(userv.getUserbyId(id));

}
@PutMapping("/user/{id}")
public ResponseEntity<Users> updateUser(@PathVariable(value = "id") long id,@RequestBody UserDTO usrdto){
	return ResponseEntity.ok(userv.editUser(id,usrdto));

}
@DeleteMapping("/user/{id}")
public  void deleteUser(@PathVariable(value = "id") long id){
	userv.deleteUser(id);

}
}