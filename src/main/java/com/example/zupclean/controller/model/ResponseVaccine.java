package com.example.zupclean.controller.model;

import java.io.Serializable;
import java.util.Date;

public class ResponseVaccine implements Serializable {

    private String name;
    private ResponsePerson person;
    private Date date;

    public ResponseVaccine(){}

    public ResponseVaccine(String name, ResponsePerson person, Date date) {
        this.name = name;
        this.person = person;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResponsePerson getPerson() {
        return person;
    }

    public void setPerson(ResponsePerson person) {
        this.person = person;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
