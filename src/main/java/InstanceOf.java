
class Animal{}

class Mamifero extends Animal{}

class Reptil extends Animal{}

class Perro extends Mamifero{}


public class InstanceOf {
    public static void main(String[] args) {
        /* El operador instanceOf devuelve un boolean true o false dependiendo si el objeto es instancia de la clase */
        
        Animal animal = new Animal(); //--Objeto de tipo Animal
        Mamifero mamifero = new Mamifero(); //--Objeto de tipo Mamifero
        Perro perro = new Perro(); //--Objeto de tipo Perro
        
        System.out.println("El animal es instancia de perro ?  "+(animal instanceof Perro));
        System.out.println("Perro es instancia de Reptil ?  "+(perro instanceof Animal));
        System.out.println("Mamifero es instancia de Mamifero: "+(mamifero instanceof Mamifero));
          
    }
}