
package Arreglo;



import java.util.ArrayList;
import java.util.List;

public class ListaDeGatos {

   
    public static void main(String[] args) {
        Gato cat = new Gato(1,"tete","bco");
        Gato cat1 = new Gato(2,"pal","ngo");
        Gato cat2 = new Gato(3,"ti","azul");
                
        
        List<Gato> lista = new ArrayList<>();
       lista.add(cat);
       lista.add(cat1);
       lista.add(cat2);
       
       
        System.out.println(" ------------for--------");
        for (Gato lista1 : lista) {
            System.out.println("prueba; " + lista1.getNombre());
        }
        System.out.println("-foreach----");
        lista.stream().forEach((gat) -> {
            System.out.println("prueba. " + gat.getColor());
            });
        System.out.println(" ");
        for (Gato lista1 : lista){
            System.out.println("prueba " + lista1.edad);
        }
        System.out.println(" ");
         for ( Gato lista1 : lista){
             System.out.println("pueba " +  lista1.toString());
         }
        
        
    }

    
    
}
