package com.example.zupclean.usecase;

import com.example.zupclean.domain.VaccineDomain;
import com.example.zupclean.gateway.h2database.GetVaccineByIdGatewayImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetVaccineByIdUsecase {

    @Autowired
    private GetVaccineByIdGatewayImpl getVaccineById;

    public VaccineDomain getById(Integer id) {
        return getVaccineById.getVaccineById(id).orElseThrow();
    }
}
