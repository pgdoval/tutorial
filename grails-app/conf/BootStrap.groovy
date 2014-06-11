import tutorial.*

class BootStrap {

    def init = { servletContext ->
        def p1 = new Persona(name:"Manuel", apellidos : "Perez Perez")
        def p2 = new Persona(name:"Pepe", apellidos : "Perez Perez").save()
        p1.save()
    }
    def destroy = {
    }
}
