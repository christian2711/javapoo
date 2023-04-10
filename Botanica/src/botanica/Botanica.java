
package botanica;


public class Botanica {

    
    public static void main(String[] args) {
        Arbol arbol1 = new Arbol("pino", "tronco grueso", 2.12, "verde", "hojas rugosas");
        Flor flor1 = new Flor("rosa", "4", "verde", "verde claro", "flor tulipa", "primavera");
        Arbusto arbusto1 = new Arbusto(3.45,false,"de piedras","gris",true);

        arbol1.decirLoQueSoy();
         System.out.println(arbol1.toString());
        flor1.decirLoQueSoy();
        System.out.println(flor1.toString());
        arbusto1.decirLoQueSoy();
        System.out.println(arbusto1.toString());
       

    }

}
