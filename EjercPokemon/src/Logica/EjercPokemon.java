
package Logica;


public class EjercPokemon {
    
    public static void main(String[] args) {
        
        Scuartl scuartl = new Scuartl ();
        Charmander charmander = new Charmander();
        Bulbasur bulbasur = new Bulbasur();
        Picachu picachu = new Picachu();
        
        scuartl.atacarAraniazo();
        scuartl.atacarHidrobomba();
        charmander.atacarLanzaLLama();
        charmander.atacarAraniazo();
        bulbasur.atacarAraniazo();
        bulbasur.atacarDrenaje();
        picachu.atacarAraniazo();
        picachu.atacarImpactrueno();
        
        
    }
    
}
