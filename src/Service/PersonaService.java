
package Service;

import Entidad.Persona;
import java.util.Scanner;


public class PersonaService {
   /* Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje*/
    
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        Persona persona1 = new Persona();
        //System.out.println("Ingresa el nombre de la persona");
        //persona1.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad de la persona");
        persona1.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo de la persona");
        persona1.setSexo(leer.nextLine());
        leer.nextLine();
        System.out.println("Ingrese el peso de la persona");
        persona1.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura de la persona");
        persona1.setAltura(leer.nextDouble());
        
        return persona1;
    }
    
    /*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.*/
    
    public double calcularIMC(Persona persona1){
        double pesoIdeal;
        pesoIdeal = persona1.getAltura()*persona1.getAltura();
        
        if(pesoIdeal<20){
            System.out.println("La persona esta por debajo de su peso ideal");
            return -1;
            }else if (pesoIdeal>25){
            System.out.println("La persona tiene sobrepeso");
            return 1;
            }else{
              if(pesoIdeal>=20 && pesoIdeal<=25){
                System.out.println("La persona esta en su peso ideal");
                return 0;
              }
            } 
        return 000;
    }

    
    /*Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.*/
    
    public boolean esMayorDeEdad(Persona persona1){
        boolean esMayor;
        esMayor=persona1.getEdad()>18;
        System.out.println("La persona es mayor de edad? " + esMayor);
        return esMayor;
        
    }
    
}
