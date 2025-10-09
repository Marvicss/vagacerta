package com.projetointegrador.vagacerta.model.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Apprentice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "phone", nullable = false, length = 11)
    private String phone;

    @Column(name = "cep", nullable = false, length = 8)
    private String cep;

    @Column(name = "age", nullable = false, length = 2)
    private String age;

    @Column(name = "gender", nullable = false, length = 10)
    private String gender;

    @Column(name = "linkedin", nullable = false, length = 50)
    private String linkedin;

    @Column(name = "course", nullable = false, length = 30)
    private String course;
}
