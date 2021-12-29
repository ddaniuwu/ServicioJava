package serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import service.PersonaService;

public class PersonaImpl implements PersonaService {
	@Autowired
	PersonaRepositor PersonaRepository;

	@Override
	public List<Persona> findAllPersons() {
		return personRepository.findAll();
	}

	@Override
	public Persona savePerson(Persona newPerson) {
		if (newPerson != null) {
			return personaRepository.save(newPerson);
		}
		return new Persona();
	}

	@Override
	public String updatePersona(Persona personUpdated) {
		Long num = personUpdated.getId();
		if (personaRepository.findById(num).isPresent()) {
			Persona personUpdate = new Persona();
			personToUpdate.setName(personaUpdated.getName());
			personToUpdate.setApellido1(personaUpdated.getApellido1());
			personToUpdate.setApellido1(personaUpdated.getApellido2());
			personToUpdate.setEdad(personapdated.getEdad());
			personToUpdate.setEstatura(personaUpdated.getEstatura());
			personToUpdate.setPeso(personaUpdated.getPeso());
			personToUpdate.setEstado(personaUpdated.getEstado());
			personRepository.save(personaoUpdate);
			return "Customer modificado";
		}
		return "Error al modificar el Customer";
	}
}
