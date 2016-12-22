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
@Table(name = "organization")

public class Organization implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private int id;

    private String organization;

    private String address;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "city_State")
    private String cityState;

    private String url;

    private Double latitude;

    private Double longitude;

    public Organization() {
    }

    public Organization(String organization, String address, String cityState, String url, double latitude, double longitude, String zipCode) {

        this.organization = organization;
        this.address = address;
        this.cityState = cityState;
        this.url = url;
        this.latitude = latitude;
        this.longitude = longitude;
        this.zipCode = zipCode;
    }


}
