package com.sduran.api.repository;

import com.sduran.model.Museum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface MuseumRepository extends JpaRepository<Museum, Long> {

    Museum findById(int id);

    @Query(value = "select DISTINCT police_district from museum;", nativeQuery = true)
    List<String> findDistinctByPoliceDistrict();

    @Query(value = "select COUNT(DISTINCT police_district) from museum;", nativeQuery = true)
    Long countDistinctByPoliceDistrict();

    @Query(value = "select DISTINCT zip_code from museum;", nativeQuery = true)
    List<String> findDistinctZipCodes();

    @Query(value = "select COUNT(*) from museum where zip_code = ?1 ;", nativeQuery = true)
    Long countByZipCode(String zipCode);

    @Query(value = "select DISTINCT council_district from museum;", nativeQuery = true)
    List<Integer> findDistinctCouncilDistrict();

    @Query(value = "select COUNT(*) from museum where council_district = ?1 ;", nativeQuery = true)
    Long countByCouncilDistrict(Integer councilDistrict);
}
