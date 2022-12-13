package com.example.esempioHibernate2.controllers;

import com.example.esempioHibernate2.entities.Utente;
import com.example.esempioHibernate2.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/utente")
public class UtenteController {

    @Autowired
    private UtenteRepository utenteRepository;

    // CREATE
    @PostMapping
    public Utente create(@RequestBody Utente utente) {
        Utente newUtente = utenteRepository.saveAndFlush(utente);
        return newUtente;
    }

    // READ
    @GetMapping({"/{id}"})
    public Utente getUserById(@PathVariable int id) {
        Optional<Utente> u = utenteRepository.findById(id);
        if (u.isPresent()) {
            return u.get();
        }
        else {
                // lancio eccezione
        }
        return null;
    }

    @GetMapping
    public List<Utente> getAllUsers() {
        return utenteRepository.findAll();
    }

    @PutMapping
    public Utente updateUser(@RequestBody Utente utente) {
        Utente newUtente = utenteRepository.saveAndFlush(utente);
        return newUtente;
    }


    // DELETE
    @DeleteMapping({"/{id}"})
    public void deleteUserById(@PathVariable int id) {
        utenteRepository.deleteById(id);
    }






}
