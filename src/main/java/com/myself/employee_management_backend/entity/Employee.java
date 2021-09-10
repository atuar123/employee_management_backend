package com.myself.employee_management_backend.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Employee extends BaseEntity{

    private String name;
    private String designation;
    private String email;
    private String contactNo;

}
