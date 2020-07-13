package com.example.covid19.controller;

import com.example.covid19.dto.PatientsSummary;
import com.example.covid19.service.CovidPatientManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/covid19/records")
public class RequestController {

    @Autowired
    CovidPatientManageService covidPatientManageService;

    @GetMapping(value = "/count", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getPatientsSummary(){
        PatientsSummary patientsSummary = covidPatientManageService.getPatientsRecords();
        return ResponseEntity.ok().body(patientsSummary);
    }

    @GetMapping(value = "/count/{district}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getPatientsSummaryFromDistrict(@PathVariable String district){
        PatientsSummary patientsSummary = covidPatientManageService.getCountByDistrict(district);
        return ResponseEntity.ok().body(patientsSummary);
    }
}

