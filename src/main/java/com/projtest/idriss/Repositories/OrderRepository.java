package com.projtest.idriss.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projtest.idriss.Entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
