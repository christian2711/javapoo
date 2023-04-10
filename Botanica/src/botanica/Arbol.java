
package botanica;


public class Arbol extends Planta {
    
    protected String variedad;
    protected String tipoDeTronco;
    protected Double radioTronco;
    protected String color;
    protected String tipoDeHojas;

    public Arbol() {
    }

    public Arbol(String variedad, String tipoDeTronco, Double radioTronco, String color, String tipoDeHojas) {
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.radioTronco = radioTronco;
        this.color = color;
        this.tipoDeHojas = tipoDeHojas;
    }

    @Override
    public String toString() {
        return "Arbol{" + "variedad=" + variedad + ", tipoDeTronco=" + tipoDeTronco + ", radioTronco=" + radioTronco + ", color=" + color + ", tipoDeHojas=" + tipoDeHojas + '}';
    }

  

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoDeTronco() {
        return tipoDeTronco;
    }

    public void setTipoDeTronco(String tipoDeTronco) {
        this.tipoDeTronco = tipoDeTronco;
    }

    public Double getRadioTronco() {
        return radioTronco;
    }

    public void setRadioTronco(Double radioTronco) {
        this.radioTronco = radioTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeHojas() {
        return tipoDeHojas;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
    }

    
    
    @Override
    public void decirLoQueSoy() {
        System.out.println("hola soy un arbol");
    }

 
    
    
    
    
    
}
