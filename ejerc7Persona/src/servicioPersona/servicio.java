package servicioPersona;

import ejerc7persona.Persona;
import java.util.Scanner;

/**
 *
 * @author tante
 */
public class servicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona;

    public Persona crearPersona() {
        System.out.println("ingrese nombre");
        String nombre = (leer.next());
        System.out.println("ingrese edad");
        int edad = leer.nextInt();
        System.out.println("ingrese sexo");
        String sexo = leer.next();
        while (!sexo.equalsIgnoreCase("h") || sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("o")){
            System.out.println("ingreso invalido intente nuevamente");
            System.out.println("ingrese sexo");
           String sexo = leer.next()
              
        }
        System.out.println("ingrese peso");
        double peso = leer.nextDouble();
        System.out.println("ingrese altura");
        double altura = leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);

    }

}
