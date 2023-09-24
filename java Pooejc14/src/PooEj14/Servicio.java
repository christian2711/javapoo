
package PooEj14;

import java.util.Scanner;

/**Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 *
 * 
 */
public class Servicio {
    
   Scanner sc = new Scanner(System.in);
   
   
    public void cargarCelular(){
        
        Movil movil1 = new Movil();
        
        System.out.println("ingrese la marca del movil");
        movil1.setMarca(sc.nextLine());
        System.out.println("ingrese el precio del movil");
        movil1.setPrecio(sc.nextInt());
        System.out.println("ingrese el modelo del movil");
        movil1.setModelo(sc.next());
        System.out.println("ingrese la memoria ram del movil");
        movil1.setMemoriaRam(sc.nextInt());
        System.out.println("ingrese el almacenamiento del movil");
        movil1.setAlmacanamiento(sc.nextInt());
        System.out.println("ingrese el codigo del movil numero por numero");
       
        int [] codi = new int [7];
        for (int i = 0; i < 7; i++) {
           System.out.println("ingrese el codigo del movil numero por numero");
            System.out.println("posision numero: "+ (i+1));
           codi[i]= sc.nextInt();
        }
        
    }
            
            
            
}
