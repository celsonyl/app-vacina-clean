package com.example.zupclean.usecase;

import com.example.zupclean.domain.VaccineDomain;
import com.example.zupclean.gateway.h2database.CreateVaccineGatewayImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateVaccineUsecase {

    @Autowired
    private CreateVaccineGatewayImpl createVaccineGateway;

    public VaccineDomain saveVaccine(VaccineDomain vaccineDomain) {
        return createVaccineGateway.saveVaccine(vaccineDomain);
    }
}
