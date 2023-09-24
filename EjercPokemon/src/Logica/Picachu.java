
package Logica;


public class Picachu extends Poke implements Ielectrico{

    public Picachu() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
         System.out.println("hola soy picachu y este es mi placaje");
    }

    @Override
    protected void atacarAraniazo() {
       System.out.println("hola soy picachu y este es mi araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("hola soy picachu y este es mi mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("hola soy picachu y este es mi impactrueno");
    }

    @Override
    public void punioTrueno() {
        System.out.println("hola soy picachu y este es mi punio trueno");
    }
    
    
}
