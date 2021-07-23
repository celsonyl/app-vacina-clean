package com.example.zupclean.gateway.h2database;

import com.example.zupclean.domain.VaccineDomain;
import com.example.zupclean.gateway.GetVaccineByIdGateway;
import com.example.zupclean.translator.PersonMapperImpl;
import com.example.zupclean.translator.VaccineMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GetVaccineByIdGatewayImpl implements GetVaccineByIdGateway {

    @Autowired
    private VaccineRepository vaccineRepository;

    @Override
    public Optional<VaccineDomain> getVaccineById(Integer id) {
        var findVaccine = vaccineRepository.findById(id);
        if (findVaccine.isEmpty()) {
            return Optional.empty();
        }
        var person = findVaccine.get().getPersonDatabase();
        var vaccine = new VaccineMapperImpl().vaccineDatabaseToDomain(findVaccine.get());
        vaccine.setPerson(new PersonMapperImpl().personDatabaseToDomain(person));
        return Optional.of(vaccine);
    }
}
