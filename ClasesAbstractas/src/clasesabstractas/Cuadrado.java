
package clasesabstractas;


public class Cuadrado implements Figura,Dibujable{

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    
    public double calculoArea() {
        double resultado = lado * lado;
        return resultado;
                
    }

    @Override
    public void dibujar() {
        System.out.println("estoy dibujando un cuadrado");
    }
    
    
    
}
