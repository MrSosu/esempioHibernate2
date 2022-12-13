package com.example.esempioHibernate2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String cognome;
    private LocalDate dataNascita;
    @Column(nullable = false, unique = true)
    private String email;

}
