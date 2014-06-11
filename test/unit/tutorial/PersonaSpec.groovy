package tutorial


import spock.lang.Specification
import grails.test.mixin.*


/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Persona)
class PersonaSpec extends Specification {

    def "Buscar por nonbre"(){
        setup:
        mockDomain(Persona)
        
        when:
        new Persona(name:name,apellidos:apellidos).save()
        
        then:
        Persona.findByName(name) !=null
        
        where:
        name = "Pepe"
        apellidos = "Perez Perez"
        
    }
}
