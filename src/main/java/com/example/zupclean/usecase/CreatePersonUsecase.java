package com.example.zupclean.usecase;

import com.example.zupclean.domain.PersonDomain;
import com.example.zupclean.gateway.h2database.CreatePersonGatewayImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreatePersonUsecase {

    @Autowired
    private CreatePersonGatewayImpl createPersonGateway;

    public PersonDomain createPerson(PersonDomain personDomain) {
        return createPersonGateway.createPerson(personDomain);
    }
}
