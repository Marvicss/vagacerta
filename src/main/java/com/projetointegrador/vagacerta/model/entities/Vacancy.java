package com.projetointegrador.vagacerta.model.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Entity()
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Vacancy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "titulo", nullable = false, length = 50)
    private String titulo;

    @Column(name = "description", nullable = false, length = 200)
    private String description;

    @Column(name = "requirements", nullable = false, length = 200)
    private String requirements;

    @Column(name = "localization", nullable = false, length = 200)
    private String localization;

    @Column(name= "workload", nullable = false)
    private int workload;

    @Column(name = "salary", nullable = false)
    private double salary;

    @Column(name = "status", nullable = false)
    private Boolean status;

    @Column(name = "company", nullable = false)
    private String company;

    @ManyToOne
    @JoinColumn(name= "recruiter_id", nullable = false)
    private Recruiter recruiter;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;






}
