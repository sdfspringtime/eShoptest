package com.projtest.idriss.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projtest.idriss.Entities.Tshirts;

import org.springframework.stereotype.Repository;

@Repository
public interface TshirtRepository extends JpaRepository<Tshirts, Long>{

}
