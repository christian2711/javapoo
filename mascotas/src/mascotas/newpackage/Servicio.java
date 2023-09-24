/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotas.newpackage;

import java.util.Scanner;
import mascotas.Mascota1;

public class Servicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Mascota1 crearmascota() {

        System.out.println("ingrese nombre");
        String nombre = leer.nextLine();
        System.out.println("ingrese color");
        String color = leer.nextLine();
        System.out.println("ingrese edad");
        int edad = leer.nextInt();
        
        Mascota1 m1 = new Mascota1();

        return m1;

    }
          
    }
