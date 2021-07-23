package com.example.zupclean.controller;

import com.example.zupclean.controller.model.RequestPerson;
import com.example.zupclean.translator.PersonMapperImpl;
import com.example.zupclean.usecase.CreatePersonUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/person")
@Component
public class PersonController {

    @Autowired
    private CreatePersonUsecase createPersonUsecase;

    @PostMapping
    public ResponseEntity<Void> createPerson(@RequestBody RequestPerson requestPerson) {
        var personDomain = new PersonMapperImpl().personRequestToDomain(requestPerson);
        var savePerson = createPersonUsecase.createPerson(personDomain);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savePerson.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }
}
