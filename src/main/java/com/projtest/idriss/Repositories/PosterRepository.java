package com.projtest.idriss.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projtest.idriss.Entities.Posters;

import org.springframework.stereotype.Repository;

@Repository
public interface PosterRepository extends JpaRepository<Posters, Long>{

}
