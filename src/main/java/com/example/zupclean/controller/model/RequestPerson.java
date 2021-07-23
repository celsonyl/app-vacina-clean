package com.example.zupclean.controller.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class RequestPerson implements Serializable {

    private Integer id;

    @NotBlank(message = "Field not be null or blank")
    private String name;
    @NotBlank(message = "Field not be null or blank")
    private String email;

    @NotNull(message = "Field not be null")
    @JsonFormat(pattern = "dd/MM/yyyy",timezone = "GMT-3")
    private Date date;

    public RequestPerson() {
    }

    public RequestPerson(Integer id, String name, String email, Date date) {
        this.id = id;
        this.name = name;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        RequestPerson that = (RequestPerson) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
