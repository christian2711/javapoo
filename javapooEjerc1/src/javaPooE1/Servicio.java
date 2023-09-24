package javaPooE1;

import java.util.Scanner;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el numero de páginas.
 *
 *
 */
public class Servicio {

    Scanner leer = new Scanner(System.in);

    public void cargar() {
        Libro libro = new Libro();

        System.out.println("ingrese el isbn del libro");
        libro.setIsbn(leer.nextInt());
        System.out.println("ingrese el titulo del libro");
        libro.setTitulo(leer.next());
        System.out.println("ingrese el autor del libro");
        libro.setAutor(leer.next());
        System.out.println("ingrese el numero de pagina");
        libro.setNumPaginas(leer.nextInt());
    }

    public void mostrar(Libro libro) {
        System.out.println("el isbn del libro es " + libro.getIsbn());
        System.out.println("el titulo del libro es " + libro.getTitulo());
        System.out.println("el autor del libro es " + libro.getAutor());
        System.out.println("el numero de paginas del libro es " + libro.getNumPaginas());
    }

}
