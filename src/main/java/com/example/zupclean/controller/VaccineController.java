package com.example.zupclean.controller;

import com.example.zupclean.controller.model.RequestVaccine;
import com.example.zupclean.controller.model.ResponseVaccine;
import com.example.zupclean.translator.VaccineMapperImpl;
import com.example.zupclean.usecase.CreateVaccineUsecase;
import com.example.zupclean.usecase.GetVaccineByIdUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/vaccine")
@Component
public class VaccineController {

    @Autowired
    private CreateVaccineUsecase createVaccineUsecase;
    @Autowired
    private GetVaccineByIdUsecase getVaccineByIdUsecase;

    @PostMapping
    public ResponseEntity<Void> saveVaccine(@RequestBody RequestVaccine requestVaccine) {
        var vaccineDomain = new VaccineMapperImpl().vaccineRequestToDomain(requestVaccine);
        var createVaccine = createVaccineUsecase.saveVaccine(vaccineDomain);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createVaccine.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ResponseVaccine> getById(@PathVariable Integer id) {
        var vaccine = getVaccineByIdUsecase.getById(id);

        return ResponseEntity.ok().body(new VaccineMapperImpl().vaccineDomainToResponse(vaccine));
    }
}
