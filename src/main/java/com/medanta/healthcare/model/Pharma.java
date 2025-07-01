package com.medanta.healthcare.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import javax.naming.Name;

@Entity
@Data
@Table(name = "Pharma")
public class Pharma {

    @Id
    int id;
    @Column(name = "NAME")
    String name ;
    @Column(name = "DISEASE")
    String disease;
    @Column(name = "ADDRESS")
    String address;
    @Column(name = "EMAIL")
    String email;
    @Column(name = "PHONE")
    String phone;
    @Column(name = "BILL")
    String bill;
}
