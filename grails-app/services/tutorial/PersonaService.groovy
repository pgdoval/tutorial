package tutorial

class PersonaService {

    Persona[] getPersonasByName(String name) {
        Persona.findAllByName(name)
    }
    
    static Persona[] getPersonasByPais(String codigo) {
        Persona.findAll("from Persona as p inner join fetch p.nacionalidades as c where c.codigo = :codigo")

    }
    
    
}
