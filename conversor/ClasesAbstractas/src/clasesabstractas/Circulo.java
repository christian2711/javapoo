
package clasesabstractas;

public class Circulo implements Figura,Dibujable,rotable {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

  

    public double calculoArea() {
        double pi = 3.14;
     double resultado = pi * radio * radio;
     return resultado;
    }

    @Override
    public void rotar() {
        System.out.println("estoy rotando un circulo");
    }

    @Override
    public void dibujar() {
        System.out.println("estoy dibujando un circulo");
    }
    
    
    
}
