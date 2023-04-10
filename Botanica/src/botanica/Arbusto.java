
package botanica;


public class Arbusto extends Planta {

    protected Double anchoArbusto;
    protected Boolean esDomestico;
    protected String variedad;
    protected String colorHojas;
    protected Boolean SePodaoNo;

    public Arbusto() {
    }

    public Arbusto(Double anchoArbusto, Boolean esDomestico, String variedad, String colorHojas, Boolean SePodaoNo) {
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedad = variedad;
        this.colorHojas = colorHojas;
        this.SePodaoNo = SePodaoNo;
    }

    @Override
    public String toString() {
        return "Arbusto{" + "anchoArbusto=" + anchoArbusto + ", esDomestico=" + esDomestico + ", variedad=" + variedad + ", colorHojas=" + colorHojas + ", SePodaoNo=" + SePodaoNo + '}';
    }

    public Double getAnchoArbusto() {
        return anchoArbusto;
    }

    public void setAnchoArbusto(Double anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public Boolean getEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(Boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public Boolean getSePodaoNo() {
        return SePodaoNo;
    }

    public void setSePodaoNo(Boolean SePodaoNo) {
        this.SePodaoNo = SePodaoNo;
    }
    
    
    
    @Override
    public void decirLoQueSoy() {
        System.out.println("hola soy un arbusto");
    }
    
    
    
    
}
