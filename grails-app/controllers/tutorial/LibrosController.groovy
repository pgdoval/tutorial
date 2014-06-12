package tutorial

class LibrosController {

    def libroFavorito()
    {
        Persona p = Persona.findById(params.id)
        println p.name
        render(view: "libroFavorito", model: [persona: p])
    }
    
    def librosEscritos(){
        Persona p = Persona.findById(params.id)
        println p.name
        render(view: "librosEscritos", model: [persona: p])
    }
    
}
