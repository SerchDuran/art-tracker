package com.sduran.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@SuppressWarnings("serial")
@Entity
@Table(name = "museum")

public class Museum implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, name = "zip_code")
    private String zipCode;

    private String neighborhood;

    @Column(name = "council_district")
    private Integer councilDistrict;

    @Column(name = "police_district")
    private String policeDistrict;

    private String address;

    public Museum() {

    }

    public Museum(String name, String address, String neighborhood, Integer councilDistrict, String policeDistrict, String zipCode) {
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
        this.councilDistrict = councilDistrict;
        this.policeDistrict = policeDistrict;
        this.zipCode = zipCode;
    }


}
