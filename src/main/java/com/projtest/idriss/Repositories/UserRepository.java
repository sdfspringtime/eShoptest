package com.projtest.idriss.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projtest.idriss.Entities.Users;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

}
