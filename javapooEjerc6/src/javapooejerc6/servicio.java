
package javapooejerc6;

import java.util.Scanner;

/**Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 *
 * 
 */
public class servicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Cafetera crearCafatera(){
        Cafetera cafe = new Cafetera();
        
        System.out.println("ingrese la capacidad maxima de la cafetera");
        cafe.setCapMax(leer.nextInt());
        System.out.println("ingrese la cantidad actual de cafe en la cafetera");
        cafe.setCantAct(leer.nextInt());
        
        return cafe;
        
    }
    public void llenarCafetera(Cafetera cafe){
        
        cafe.setCantAct(cafe.getCapMax());
        System.out.println("se completo la capacidad maxima de la cafetera");
    }
    
    public void servirTaza(Cafetera cafe){
        
        System.out.println("digite la capacidad de su taza");
        int taza = leer.nextInt();
        
        if(taza>cafe.getCantAct()){
            System.out.println("no alcanza, se cargo lo que quedaba de cafe, la cant que le faltara a la taza es: " + (taza - cafe.getCantAct()));
            System.out.println("la cafetera quedo vacia");
            cafe.setCantAct(0);
        }else{
            cafe.setCantAct(cafe.getCantAct() - taza);
            System.out.println("se lleno la taza, la cantidad de cafe en la cafetera es: " + cafe.getCantAct());
        }
        
        
    }
    public void vaciarCafetera(Cafetera cafe){
        cafe.setCantAct(0);
        System.out.println("se vacio por completo la cafetera");
        
    }
    public void agregarCafe(Cafetera cafe){
        System.out.println("ingrese la cantidad de cafe a agregar");
        int carga = leer.nextInt();
        cafe.setCantAct(cafe.getCantAct() + carga);
        if(cafe.getCapMax()<cafe.getCantAct() + carga){
            System.out.println("se sobrepasa la capacidad de la cafetera");
        }else{
            System.out.println("la cafetera quedo con " + cafe.getCantAct() + " cm3-cantidad actual de cafe"); 
        }
       
    }
}
