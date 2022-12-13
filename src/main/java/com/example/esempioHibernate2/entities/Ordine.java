package com.example.esempioHibernate2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Ordine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Utente utente;
    @ManyToOne
    private Prodotto prodotto;

    @Column(nullable = false)
    private LocalDateTime dataAcquisto;


}
