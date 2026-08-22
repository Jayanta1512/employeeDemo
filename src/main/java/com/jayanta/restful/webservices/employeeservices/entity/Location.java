package com.jayanta.restful.webservices.employeeservices.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(force = true)
@AllArgsConstructor
@ToString
@Entity
@Table(name = "LOCATION")
public class Location {

    @Id
    @Column(name = "LOCATION_ID")
    private int locationId;

    @Column(name = "LOCATION_NAME")
    private String locationName;
}
