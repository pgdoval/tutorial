package tutorial

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(PersonaService)
class PersonaServiceSpec extends Specification {


	def "Hay 2 españoles"() {
        setup:
            mockDomain(PersonaService)
        
        when:
        def lista = PersonaService.getPersonasByPais("ESP")
        
        then:
        lista.size() == 2
        
        where:
        name = "Pepe"
        apellidos = "Perez Perez"
        pais = new Pais(nombre : "España", codigo : "ESP")
        persona =new Persona(name:name,apellidos:apellidos, pais:[pais])
        
	}
}
