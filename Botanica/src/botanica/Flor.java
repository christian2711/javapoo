
package botanica;


public class Flor extends Planta{
    
    protected String colorDePetalos;
    protected String cantPromPetalos;
    protected String colorPistilo;
    protected String colorPetalos;
    protected String variedadFlor;
    protected String estacionQFlorece;

    public Flor() {
    }

    public Flor(String colorDePetalos, String cantPromPetalos, String colorPistilo, String colorPetalos, String variedadFlor, String estacionQFlorece) {
        this.colorDePetalos = colorDePetalos;
        this.cantPromPetalos = cantPromPetalos;
        this.colorPistilo = colorPistilo;
        this.colorPetalos = colorPetalos;
        this.variedadFlor = variedadFlor;
        this.estacionQFlorece = estacionQFlorece;
    }

    @Override
    public String toString() {
        return "Flor{" + "colorDePetalos=" + colorDePetalos + ", cantPromPetalos=" + cantPromPetalos + ", colorPistilo=" + colorPistilo + ", colorPetalos=" + colorPetalos + ", variedadFlor=" + variedadFlor + ", estacionQFlorece=" + estacionQFlorece + '}';
    }

    public String getColorDePetalos() {
        return colorDePetalos;
    }

    public void setColorDePetalos(String colorDePetalos) {
        this.colorDePetalos = colorDePetalos;
    }

    public String getCantPromPetalos() {
        return cantPromPetalos;
    }

    public void setCantPromPetalos(String cantPromPetalos) {
        this.cantPromPetalos = cantPromPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacionQFlorece() {
        return estacionQFlorece;
    }

    public void setEstacionQFlorece(String estacionQFlorece) {
        this.estacionQFlorece = estacionQFlorece;
    }

    
    
    @Override
    public void decirLoQueSoy() {
        System.out.println("hola soy una flor");
    }
    
    
}
