package com.example.covid19.service;

import com.example.covid19.dto.PatientsSummary;

public interface CovidPatientManageService {

    /**
     * get Patients Summary of sri lanka
     **/
    PatientsSummary getPatientsRecords();


    /**
     * get total patients by district
     * @param district
     * @return
     */
    PatientsSummary getCountByDistrict(String district);
}
