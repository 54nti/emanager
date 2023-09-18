package com.training.emanager.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Employee  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String imgUrl;
    private String phone;
    private String employeeCode;
}
