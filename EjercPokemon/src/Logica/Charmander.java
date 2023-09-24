
package Logica;


public class Charmander extends Poke implements Ifuego{

    public Charmander() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("hola soy charmander y este es mi placaje");
    }

    @Override
    protected void atacarAraniazo() {
         System.out.println("hola soy charmander y este es mi araniazo");
    }

    @Override
    protected void atacarMordisco() {
        
      System.out.println("hola soy charmander y este es mi mordisco");
}

    @Override
    public void atacarPuniofuego() {
        System.out.println("hola soy charmander y este es mi punio fuego");
    }

    @Override
    public void atacarLanzaLLama() {
        
    System.out.println("hola soy charmander y este es mi lanza llama");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("hola soy charmander y este es mi ataque ascuas");
    }
}