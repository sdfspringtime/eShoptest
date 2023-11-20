package com.projtest.idriss.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projtest.idriss.Entities.Users;


public interface UserRepository extends JpaRepository<Users, Long>{

}
