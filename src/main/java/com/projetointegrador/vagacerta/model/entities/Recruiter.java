package com.projetointegrador.vagacerta.model.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity()
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Recruiter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "phone", nullable = false, length = 11)
    private String phone;

    @OneToMany
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @Column(name = "position", nullable = false, length = 50)
    private String position;

    @Column(name = "department ", nullable = false, length = 50)
    private String department;

    @Column(name = "linkedin", nullable = false, length = 50);
    private String linkedin;

}
