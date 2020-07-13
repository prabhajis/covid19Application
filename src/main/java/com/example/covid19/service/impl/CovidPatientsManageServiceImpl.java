package com.example.covid19.service.impl;

import com.example.covid19.dto.PatientsSummary;
import com.example.covid19.repository.PatientsRecordsRepository;
import com.example.covid19.service.CovidPatientManageService;
import com.example.covid19.utils.PatientsStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CovidPatientsManageServiceImpl implements CovidPatientManageService {


    @Autowired
    PatientsRecordsRepository patientsRecordRepository;

    public PatientsSummary getPatientsRecords() {

        PatientsSummary patientsSummary = new PatientsSummary();
        int totalPatients = patientsRecordRepository.getCountFromSrilanka();
        int totalfemalePatients = patientsRecordRepository.findByGender("F");
        int totalMalePatients = patientsRecordRepository.findByGender("M");
        int recoveredCount = patientsRecordRepository.getCountByStatus(PatientsStatus.RECOVERED.toString());
        int deathCount = patientsRecordRepository.getCountByStatus(PatientsStatus.DEAD.toString());

        patientsSummary.setTotalNoOfPatients(totalPatients);
        patientsSummary.setFemalePatients(totalfemalePatients);
        patientsSummary.setMalePatients(totalMalePatients);
        patientsSummary.setRecovered(recoveredCount);
        patientsSummary.setDeath(deathCount);
        return patientsSummary;
    }

    public PatientsSummary getCountByDistrict(String district) {

        PatientsSummary patientsSummary = new PatientsSummary();
        int totalPatients = patientsRecordRepository.findByDistrict(district);
        patientsSummary.setTotalNoOfPatients(totalPatients);
        return patientsSummary;
    }
}





