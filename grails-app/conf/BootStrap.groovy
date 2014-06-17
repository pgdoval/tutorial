import tutorial.*

class BootStrap {

    def init = { servletContext ->
//        Pais esp = new Pais(nombre:"España", codigo: "ESP")
//        Pais usa = new Pais(nombre:"Estados Unidos", codigo: "USA")
        Libro libro1= new Libro (titulo: "Los pilares de la tierra", editorial : "aaa").save()
        Libro libro2= new Libro (titulo: "Africanus", descripcion: "Escrito por Manuel Perez Perez. Epoca romanos", editorial : "aaa").save()
        Libro libro3= new Libro (titulo: "Jane Eyre", descripcion: "Escrito por Manuel Perez Perez. Epoca siglo XIX", editorial : "bbb").save()
        
        
        def p1 = new Persona(name:"Manuel", apellidos : "Perez Perez", libroFavorito:libro2, fechaNacimiento:new Date().parse('dd/MM/yyyy','01/01/1987'))
        def p2 = new Persona(name:"Pepe", apellidos : "Perez Perez", libroFavorito:libro3, fechaNacimiento:new Date().parse('dd/MM/yyyy','01/11/1987')).save()
        p1.save()
        
        p1.addToLibrosEscritos(libro2).addToLibrosEscritos(libro3)
        
        if (!p1.save()) {
            p1.errors.each {
                println it
            }
        }
        
        p2.addToLibrosEscritos(libro1)
        
        if (!p2.save()) {
            p2.errors.each {
                println it
            }
        }
    }
    def destroy = {
    }
}
