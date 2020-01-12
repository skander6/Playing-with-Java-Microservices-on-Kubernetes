package com.ensi.user.persistance;

import java.util.List;

import com.ensi.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository

public interface UserRepository extends JpaRepository<User,Long> {


}