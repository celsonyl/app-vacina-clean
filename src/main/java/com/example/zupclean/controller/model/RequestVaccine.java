package com.example.zupclean.controller.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class RequestVaccine implements Serializable {

    private Integer id;

    @NotBlank(message = "Field not be null or blank")
    private String name;

    @NotNull(message = "Field not be null")
    private RequestPerson person;

    @JsonFormat(pattern = "dd/MM/yyyy", timezone = "GMT-3")
    private Date date;

    public RequestVaccine() {
    }

    public RequestVaccine(Integer id, String name, RequestPerson person, Date date) {
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

    public RequestPerson getPerson() {
        return person;
    }

    public void setPerson(RequestPerson person) {
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
        RequestVaccine that = (RequestVaccine) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
