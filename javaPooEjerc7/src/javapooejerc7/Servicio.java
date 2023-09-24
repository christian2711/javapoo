package javapooejerc7;

import java.util.Scanner;

/**
 * Realizar una clase llamada Persona que tenga los siguientes atributos:
 * nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el
 * alumno desea añadir algún otro atributo, puede hacerlo. Los métodos que se
 * implementarán son:  Un constructor por defecto.  Un constructor con todos
 * los atributos como parámetro.  Métodos getters y setters de cada atributo. 
 * Metodo crearPersona(): el método crear persona, le pide los valores de los
 * atributos al usuario y después se le asignan a sus respectivos atributos para
 * llenar el objeto Persona. Además, comprueba que el sexo introducido sea
 * correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 *  Método calcularIMC(): calculara si la persona está en su peso ideal (peso
 * en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
 * 20, significa que la persona está por debajo de su peso ideal y la función
 * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que la persona está en su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
 * que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 *  Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano. A continuación, en la clase main hacer lo siguiente:
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación,
 * llamaremos todos los métodos para cada objeto, deberá comprobar si la persona
 * está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e
 * indicar para cada objeto si la persona es mayor de edad. Por último,
 * guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
 * distintas variables, para después en el main, calcular un porcentaje de esas
 * 4 personas
 *
 * cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
 * encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
 * cuantos menores
 *
 *
 */
public class Servicio {

    public Persona crearPersona() {
        Persona p1 = new Persona();
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese el nombre");
        p1.setNombre(leer.next());
        System.out.println("ingrese la edad");
        p1.setEdad(leer.nextInt());
        String sexo;
        do {
            System.out.println("ingrese el sexo *f/m/o* ");
            sexo = leer.nextLine();
            if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("o")) {
                p1.setSexo(sexo);
                break;
            } else {
                System.out.println("ingreso erroneo, intente otra vez");

            }
        } while (!sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("o"));

        System.out.println("ingrese el peso");
        p1.setPeso(leer.nextDouble());
        System.out.println("ingrese la estatura");
        p1.setAltura(leer.nextDouble());
        return p1;
    }

    public Double calcularImc(Persona p1) {

        double kg = p1.getPeso();
        double alt = p1.getAltura();

        double imc = kg / (alt * alt);

        if (imc < 20) {
            System.out.println("debajo del peso ideal");
            imc = -1.0;
        } else if (imc > 20 || imc < 26) {
            System.out.println("peso ideal");
            imc = 0.0;
        } else if (imc > 25) {
            System.out.println("persona con sobre peso");
            imc = 1.0;
        }
        return imc;

    }

    public boolean esMayorDeEdad(Persona p1) {

        if (p1.getEdad() > 18) {
            return true;
        }
        return false;

    }

}
