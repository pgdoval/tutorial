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
        
    def escritoresDeEditorialConFind(){
        //vamos a obtener las personas que han trabajado con una editorial
        // usando para ello HQL con una find -> esto sólo nos mostrará el primero
        //al usar un método tipo find, al hacer el join contra librosEscritos, también se trae el libro
        
        List<Persona> personas = Persona.find("from Persona p inner join p.librosEscritos as e where e.editorial = :editorial",
            [editorial: params.editorial]);
        personas.each(){
            render(it)
        }
        
    }
            
    def escritoresDeEditorialConFindAll(){
        //vamos a obtener las personas que han trabajado con una editorial
        // usando para ello HQL con una findAll, que nos trae todos
        //al usar un método tipo find, al hacer el join contra librosEscritos, también se trae el libro
        
        List<Persona> personas = Persona.findAll("from Persona p inner join p.librosEscritos as e where e.editorial = :editorial",
            [editorial: params.editorial]);
        personas.each(){
            render(it)
        }
        
    }            
    
    def escritoresDeEditorialConFindWhere(){
        //esto no se puede hacer así porque no se puede
        //acceder con un findWhere a las propiedades de una propiedad que no es
        //de la clase sino que se tendría que acceder directamente a las de la clase
//        List<Persona> personas = Persona.findWhere(
//            librosEscritos.editorial : params.editorial
//        )

//            personas.each(){
//            render(it)
//        }
        
    }

    
    
    
}
