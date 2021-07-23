package com.example.zupclean.gateway.h2database;

import com.example.zupclean.domain.PersonDomain;
import com.example.zupclean.gateway.CreatePersonGateway;
import com.example.zupclean.translator.PersonMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreatePersonGatewayImpl implements CreatePersonGateway {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public PersonDomain createPerson(PersonDomain personDomain) {
        var personDatabase = new PersonMapperImpl().personDomainToDatabase(personDomain);

        return new PersonMapperImpl().personDatabaseToDomain(personRepository.save(personDatabase));
    }
}
