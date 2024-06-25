package com.hari.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private int phonenumber;
    private Date dob;
    private Gender gender ;
    private String nationality;
    private String maritalstatus;
}
