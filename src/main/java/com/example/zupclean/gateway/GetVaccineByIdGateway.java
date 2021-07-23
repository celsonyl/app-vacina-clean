package com.example.zupclean.gateway;

import com.example.zupclean.domain.VaccineDomain;

import java.util.Optional;

public interface GetVaccineByIdGateway {

    Optional<VaccineDomain> getVaccineById(Integer id);
}
