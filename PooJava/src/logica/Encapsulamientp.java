package logica;

public class Encapsulamientp {

    public static void main(String[] args) {
        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(15, "juan", "pedro");
        Alumno alu3 = new Alumno(12, "tato", "tutu");

        System.out.println("id: " + alu2.getId());
        System.out.println("nombre: " + alu2.getNombre());
        System.out.println("apellido: " + alu2.getApellido());

        System.out.println("id: " + alu3.getId());
        System.out.println("nombre: " + alu3.getNombre());
        System.out.println("apellido: " + alu3.getApellido());
    }

}
