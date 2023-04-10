
package botanica;


public abstract class Planta {
    
    protected String nombre;
    protected String altoDelTallo;
    protected Boolean tieneHojas;
    protected String climaIdeal;

    public Planta() {
    }

    public Planta(String nombre, String altoDelTallo, Boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altoDelTallo = altoDelTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    @Override
    public String toString() {
        return "Planta{" + "nombre=" + nombre + ", altoDelTallo=" + altoDelTallo + ", tieneHojas=" + tieneHojas + ", climaIdeal=" + climaIdeal + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAltoDelTallo() {
        return altoDelTallo;
    }

    public void setAltoDelTallo(String altoDelTallo) {
        this.altoDelTallo = altoDelTallo;
    }

    public Boolean getTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(Boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
    
    
    public abstract void decirLoQueSoy();
    
    
    
    
    
}
