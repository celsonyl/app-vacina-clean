package com.example.zupclean.gateway.h2database;

import com.example.zupclean.gateway.h2database.model.VaccineDatabase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRepository extends JpaRepository<VaccineDatabase,Integer> {
}
