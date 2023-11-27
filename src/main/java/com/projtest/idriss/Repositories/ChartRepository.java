package com.projtest.idriss.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projtest.idriss.Entities.Chart;
import org.springframework.stereotype.Repository;

@Repository
public interface ChartRepository extends JpaRepository<Chart, Long>{

}
