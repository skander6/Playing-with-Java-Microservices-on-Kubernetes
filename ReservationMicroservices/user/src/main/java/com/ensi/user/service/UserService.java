package com.ensi.user.service;
import com.ensi.user.model.User;
import com.ensi.user.persistance.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reservation.ensi.DTO.UserDTO;


import java.math.BigDecimal;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> findAll(){
        return this.userRepository.findAll();
     }
    public User create(UserDTO userdto){

        return this.userRepository.save(new User(userdto.getNom(),userdto.getPrenom(),userdto.getMail(),userdto.getCarte_bancaire(),userdto.getNumero()));
        		
        	  }
    public void deleteById(Long id){
        this.userRepository.deleteById(id);
    }
    
    public void save(User user) {
    	
        userRepository.save(user);
    }
    
}
