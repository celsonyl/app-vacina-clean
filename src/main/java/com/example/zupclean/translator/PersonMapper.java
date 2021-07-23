package com.example.zupclean.translator;

import com.example.zupclean.controller.model.RequestPerson;
import com.example.zupclean.domain.PersonDomain;
import com.example.zupclean.gateway.h2database.model.PersonDatabase;
import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {

    PersonDatabase personDomainToDatabase(PersonDomain personDomain);

    PersonDomain personDatabaseToDomain(PersonDatabase personDatabase);

    PersonDomain personRequestToDomain(RequestPerson requestPerson);

    PersonDatabase personRequestToDatabase(RequestPerson requestPerson);
}
