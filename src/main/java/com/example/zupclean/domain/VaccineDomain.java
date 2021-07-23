package com.example.zupclean.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class VaccineDomain implements Serializable {

    private Integer id;
    private String name;
    private PersonDomain person;
    private Date date;

    public VaccineDomain(){}

    public VaccineDomain(Integer id, String name, PersonDomain person, Date date) {
        this.id = id;
        this.name = name;
        this.person = person;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonDomain getPerson() {
        return person;
    }

    public void setPerson(PersonDomain person) {
        this.person = person;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VaccineDomain that = (VaccineDomain) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
