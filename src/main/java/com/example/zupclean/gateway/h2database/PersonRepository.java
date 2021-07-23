package com.example.zupclean.gateway.h2database;

import com.example.zupclean.gateway.h2database.model.PersonDatabase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonDatabase, Integer> {
}
