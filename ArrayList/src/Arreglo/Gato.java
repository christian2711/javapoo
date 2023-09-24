
package Arreglo;


public class Gato {
     protected int edad;
     protected String nombre;
     protected String color;

    public Gato() {
    }

    public Gato(int edad, String nombre, String color) {
        this.edad = edad;
        this.nombre = nombre;
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Gato{" + "edad=" + edad + ", nombre=" + nombre + ", color=" + color + '}';
    }
     
     
    
    
    
    
}
