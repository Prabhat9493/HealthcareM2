package com.medanta.healthcare.repository;

import com.medanta.healthcare.model.Pharma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthRepo extends JpaRepository<Pharma,Integer> {


}
