package com.example.zupclean.gateway;

import com.example.zupclean.domain.VaccineDomain;

public interface CreateVaccineGateway {

    VaccineDomain saveVaccine(VaccineDomain vaccineDomain);
}
