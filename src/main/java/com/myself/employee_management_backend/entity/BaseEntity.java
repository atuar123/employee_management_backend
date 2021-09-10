package com.myself.employee_management_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(updatable = false)
    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)
    private Date createdAt;

    private String updatedBy;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    private Boolean isActive;

    @PrePersist
    public void setInsertData(){
        this.createdAt = new Date();
        this.isActive = true;
    }

    @PreUpdate
    public void setUpdateData(){
        this.updatedAt = new Date();
    }

}
