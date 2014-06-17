package tutorial

class Libro {
    
    Long id
    String titulo
    String descripcion
    String editorial

    static constraints = {
        descripcion nullable:true
    }
}
