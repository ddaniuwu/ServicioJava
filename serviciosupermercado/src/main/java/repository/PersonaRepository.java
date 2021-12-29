package repository;
import org.springframework.data.jpa.repository.JpaRepository;

import entitie.Persona;

public class PersonaRepository extends JpaRepository<Persona>{
	void save(Optional<Persona>);
}
