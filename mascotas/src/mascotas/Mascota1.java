package mascotas;

public class Mascota1 {

    public String nombre;
    public String color;
    public int edad;
    
  
    public Mascota1() {
        
    }

    public Mascota1(String nombre, String color, int edad,int energia) {
        this.nombre = nombre;
        this.color = color;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mascota1{" + "nombre=" + nombre + ", color=" + color + ", edad=" + edad + '}';
    }

   

   

}
