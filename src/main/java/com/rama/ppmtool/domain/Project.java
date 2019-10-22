package com.rama.ppmtool.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(includeFieldNames=true)
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectName;
    private String projectIdentifier;
    private String description;
    private Date startDate;
    private Date endDate;
    private Date createdDate;
    private Date modifedDate;

    @PrePersist
    protected void onCreate(){
        this.createdDate = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.modifedDate = new Date();
    }

}
