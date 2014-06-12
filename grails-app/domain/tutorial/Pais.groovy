package tutorial

class Pais {

    String nombre
    String codigo
    
    static constraints = {
        codigo size: 3..3 //ESP, USA
    }
}
