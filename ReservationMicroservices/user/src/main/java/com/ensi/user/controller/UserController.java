package com.ensi.user.controller;

import java.util.List;

import com.ensi.user.model.User;
import com.ensi.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.reservation.ensi.DTO.UserDTO;




@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
    private UserService userService;
	
	
	@PostMapping("/create")
    public User create(@RequestBody UserDTO userdto){
        return this.userService.create(userdto);
    }
	
	@GetMapping("/all")
    public List<User> findAll(){
        return this.userService.findAll();
    }
	 @DeleteMapping("/{id}")
	    public void deleteProduct(@PathVariable String id){
	        this.userService.deleteById(Long.valueOf(id));
	    }
	 
	@PutMapping("/update")
	    public void updateClient(@RequestBody User user) {

	        this.userService.save(user);
	 
	
}
}
