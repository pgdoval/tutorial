package tutorial

class PersonaController {

    def index(){
        def gente = PersonaService.findPersonasByPais("ESP")
        personas.each(){
            render(it)
        }
    }
}
