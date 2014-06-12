package tutorial

class Libro {
    
    Long id
    String titulo
    String descripcion

    static constraints = {
        descripcion nullable:true
    }
}
