package tutorial

class HelloWorldController {

    def saludar () {
        render(view: "helloWorld")
    }
    
    def saludarPepe (){
        def pepe = Persona.findByName("Pepe")
        render "Hello ${pepe.name} ${pepe.apellidos} !"
    }
}
