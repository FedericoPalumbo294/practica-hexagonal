package ar.edu.um.prog2.practicahexagonal.controller;

import ar.edu.um.prog2.practicahexagonal.domain.Persona;
import ar.edu.um.prog2.practicahexagonal.service.PersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nucleo/persona")
@RequiredArgsConstructor
public class PersonaController {

    private final PersonaService personaService;

    @GetMapping
    public ResponseEntity<List<Persona>> findAll() {
        return ResponseEntity.ok(personaService.findAll());
    }

    @PostMapping
    public ResponseEntity<Persona> save(@RequestBody Persona persona) {
        return ResponseEntity.ok(personaService.save(persona));
    }
}