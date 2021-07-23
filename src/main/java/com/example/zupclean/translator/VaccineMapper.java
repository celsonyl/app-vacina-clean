package com.example.zupclean.translator;

import com.example.zupclean.controller.model.RequestVaccine;
import com.example.zupclean.controller.model.ResponseVaccine;
import com.example.zupclean.domain.VaccineDomain;
import com.example.zupclean.gateway.h2database.model.VaccineDatabase;
import org.mapstruct.Mapper;

@Mapper
public interface VaccineMapper {

    VaccineDatabase vaccineDomainToDatabase(VaccineDomain vaccineDomain);

    VaccineDomain vaccineDatabaseToDomain(VaccineDatabase vaccineDatabase);

    VaccineDomain vaccineRequestToDomain(RequestVaccine requestVaccine);

    VaccineDatabase vaccineRequestToDatabase(RequestVaccine requestVaccine);

    ResponseVaccine vaccineDomainToResponse(VaccineDomain vaccineDomain);
}
