package com.example.zupclean.gateway.h2database.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity(name = "vaccine")
public class VaccineDatabase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private PersonDatabase personDatabase;

    @JsonFormat(pattern = "dd/MM/yyyy", timezone = "GMT-3")
    private Date date;

    public VaccineDatabase() {
    }

    public VaccineDatabase(Integer id, String name, PersonDatabase personDatabase, Date date) {
        this.id = id;
        this.name = name;
        this.personDatabase = personDatabase;
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

    public PersonDatabase getPersonDatabase() {
        return personDatabase;
    }

    public void setPersonDatabase(PersonDatabase personDatabase) {
        this.personDatabase = personDatabase;
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
        VaccineDatabase that = (VaccineDatabase) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
