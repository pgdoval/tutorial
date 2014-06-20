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
    
    def escritoresDeEditorialCriteria(){
        //vamos a obtener las personas que han trabajado con una editorial
        // usando para ello Criteria
        
        //En este método obtenemos personas mediante Criteria
        //Le pasamos una closure en la que vamos aplicando filtros
        List<Persona> personas = Persona.withCriteria {
            //Para hacer el join de personas con libros a través de librosFavoritos
            //hay que crear un alias para (persona.) librosEscritos
            //Se le podría pasar como tercer parámetro CriteriaSpecification.LEFT_JOIN
            createAlias('librosEscritos', 'le')
            //Este método filtra las editoriales iguales al valor que se recibe como parámetro
            eq('le.editorial',params.editorial)                
        }    
            
        personas.each(){
            render(it)
        }

    }
    
       def escritoresDeEditorialCriteria2(){
        //vamos a obtener las personas que han trabajado con una editorial
        // usando para ello el método createCriteria
        
        //creamos el Criteria
        def c = Persona.createCriteria()
        
        //usamos el método list, aunque realmente hay otros métodos que se pueden usar
        def personas = c.list{
            librosEscritos{
                eq('editorial', params.editorial)
            }
        }
        
        personas.each(){
            render(it)
        }

    } 
    
    
}
