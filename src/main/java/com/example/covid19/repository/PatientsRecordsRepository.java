package com.example.covid19.repository;

import com.example.covid19.entity.PatientsRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientsRecordsRepository extends JpaRepository<PatientsRecords, String> {

    /**
     * get total count of patients by district
     * @param
     * @param district
     * @return total patients by district
     */
    @Query(value = "SELECT COUNT(patient_id) FROM patients_records WHERE district = ?1", nativeQuery=true)
    public int findByDistrict(String district);

    /**
     * get total count of patients by district and gender
     * @param district
     * @param gender
     * @return patients count by gender
     */
    @Query(value = "SELECT COUNT(patient_id) FROM patients_records WHERE district = ?1 AND gender = ?2", nativeQuery=true)
    public int findByDistrictAndGender(String district, String gender);


    @Query(value = "SELECT COUNT(patient_id) FROM patients_records", nativeQuery=true)
    public int getCountFromSrilanka();

    /**
     * find all patients by gender
     * @param gender
     * @return
     */
    @Query(value = "SELECT COUNT(patient_id) FROM patients_records WHERE gender = ?1", nativeQuery=true)
    public int findByGender(String gender);

    /**
     * get patients count by status
     * @param status { RECOVERED.UNDETERMINE, DEAD}
     * @return patients count
     */

    @Query(value = "SELECT COUNT(patient_id) FROM patients_records WHERE status = ?1", nativeQuery=true)
    public int getCountByStatus(String status);

    /**
     * get patients count by status and district
     * @param status
     * @param district
     * @return patients count
     */
    @Query(value = "SELECT COUNT(patient_id) FROM patients_records WHERE status = ?1", nativeQuery=true)
    public int getCountByStatusAndDistrict(String district, String status);
}
