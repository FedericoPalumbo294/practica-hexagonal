package ar.edu.um.prog2.practicahexagonal.service;

import ar.edu.um.prog2.practicahexagonal.domain.Persona;
import ar.edu.um.prog2.practicahexagonal.repository.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonaService {

    private final PersonaRepository personaRepository;

    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }
}