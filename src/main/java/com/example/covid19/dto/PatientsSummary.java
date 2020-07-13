package com.example.covid19.dto;

import lombok.Data;

@Data
public class PatientsSummary {
    private int totalNoOfPatients;
    private int femalePatients;
    private int malePatients;
    private int recovered;
    private int death;
}
