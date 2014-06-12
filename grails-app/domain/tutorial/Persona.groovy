package tutorial

class Persona {

    Long id
    String name
    String apellidos
    Date fechaNacimiento
    
    Libro libroFavorito
    
    static hasMany = [librosEscritos:Libro]
    
    static transients = ['edad']
    
    static constraints = {
        
        
    }
    
    Integer getEdad(){
        return (Date.now() - fechaNacimiento).years
    }
    
    
    
}
