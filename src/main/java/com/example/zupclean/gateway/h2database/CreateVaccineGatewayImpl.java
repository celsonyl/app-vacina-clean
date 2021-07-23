package com.example.zupclean.gateway.h2database;

import com.example.zupclean.domain.VaccineDomain;
import com.example.zupclean.gateway.CreateVaccineGateway;
import com.example.zupclean.translator.PersonMapperImpl;
import com.example.zupclean.translator.VaccineMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateVaccineGatewayImpl implements CreateVaccineGateway {

    @Autowired
    private VaccineRepository vaccineRepository;

    @Override
    public VaccineDomain saveVaccine(VaccineDomain vaccineDomain) {
        var person = vaccineDomain.getPerson();
        var vaccineDatabase = new VaccineMapperImpl().vaccineDomainToDatabase(vaccineDomain);
        vaccineDatabase.setPersonDatabase(new PersonMapperImpl().personDomainToDatabase(person));

        return new VaccineMapperImpl().vaccineDatabaseToDomain(vaccineRepository.save(vaccineDatabase));
    }
}
