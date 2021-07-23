package com.example.zupclean.gateway;

import com.example.zupclean.domain.PersonDomain;

public interface CreatePersonGateway {

    PersonDomain createPerson(PersonDomain personDomain);
}
