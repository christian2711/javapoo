package conversor;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a convertir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void). El cambio de divisas es: 0.86
 * libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es un 1 €
 *
 *
 *
 */
public class Conversor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese la cantidad de dinero a cambiar");
        double plata = sc.nextDouble();

        conversor(plata);

    }

    public static void conversor(double plata) {
        String dolares = null;
        String yenes = null;
        String libras = null;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese al cambio que desea convertir -libras/dolares/yenes-");
        String conver = leer.nextLine();

        if (conver.equalsIgnoreCase(libras)) {
            double total = (int) (plata * 0.86);
            System.out.println("la cantidad que ingreso convertida a libras es: " + total);
        } else {
            if (conver.equalsIgnoreCase(dolares)) {
                double total = plata * 1.28611;
                System.out.println("la cantidad que ingreso convertida a dolares es: " + total);

            } else {
                if (conver.equalsIgnoreCase(yenes)) {
                    double total = plata * 129.852;
                    System.out.println("la cantidad que ingreso convertida a dolares es: " + total);
                    
                        
                    }
                }
            }
        }
    }

  

