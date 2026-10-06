package ar.edu.um.prog2.practicahexagonal.repository;

import ar.edu.um.prog2.practicahexagonal.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}