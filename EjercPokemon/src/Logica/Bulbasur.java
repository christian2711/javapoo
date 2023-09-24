
package Logica;


public class Bulbasur extends Poke implements Iplanta{

    public Bulbasur() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("hola soy bulbasur este es mi placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("hola soy bulbasur este es mi araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("hola soy bulbasur este es mi mordisco");
    }

    @Override
    public void atacarDrenaje() {
       System.out.println("hola soy bulbasur y este es mi drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("hola soy bulbasur y este es mi paralizar");
    }
    
    
    
}
