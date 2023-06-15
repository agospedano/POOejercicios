
package ejercicio7;
import Entidad.Persona;
import Service.PersonaService;

public class Ejercicio7 {

    
    public static void main(String[] args) {
       PersonaService ps = new PersonaService();
       Persona persona1 = ps.crearPersona();
       ps.calcularIMC(persona1);
       ps.esMayorDeEdad(persona1);
        System.out.println(" ");

    }
    
}
