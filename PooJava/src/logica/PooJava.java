package logica;

public class PooJava {

    public static void main(String[] args) {

        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(35, "chris", "tato");
        Alumno alu3 = new Alumno(12, "tato", "tutu");

        System.out.println("la id del alumno 2 es: " + alu2.getId());
        System.out.println("el nombre es: " + alu2.getNombre());
        System.out.println("el apellido es: " + alu2.getApellido());

        alu1.setId(10);
        alu1.setNombre("mile");
        alu1.setApellido("tutu");

        System.out.println("-------------");

        System.out.println("la id del alumno 1 es: " + alu1.getId());
        System.out.println("el nombre es: " + alu1.getNombre());
        System.out.println("el apellido es: " + alu1.getApellido());
        System.out.println("------------");

        alu2.setId(48);

        System.out.println("la id del alumno 2 es: " + alu2.getId());
        System.out.println("el nombre es: " + alu2.getNombre());
        System.out.println("el apellido es: " + alu2.getApellido());
        System.out.println("-----------------");

        System.out.println("la id del alumno 3 es: " + alu3.getId());
        System.out.println("el nombre es: " + alu3.getNombre());
        System.out.println("el apellido es: " + alu3.getApellido());

    }

}
