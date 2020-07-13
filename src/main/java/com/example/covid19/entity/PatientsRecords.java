package com.example.covid19.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class PatientsRecords {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int patientId;
    private String district;
    private int age;
    private String travelHistory;
    private String countriesTravelled;
}
