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
    
    def escritoresDeEditorial(){
        //vamos a obtener las personas que han trabajado con una editorial
        // usando para ello HQL
        
        List<Persona> personas = Persona.executeQuery("select p from Persona p inner join p.librosEscritos as e where e.editorial = :editorial", [editorial: params.editorial]);
        personas.each(){
            render(it)
        }
        
    }
    
}
