package ejerciciovideojuego;

import java.util.ArrayList;
import java.util.List;

public class EjercicioVideoJuego {

    public static void main(String[] args) {
        List<VideoJuego> lista1 = new ArrayList<VideoJuego>();

        VideoJuego video1 = new VideoJuego("12", "super mario", "nintendo 64", 2, "carreras");
        VideoJuego video2 = new VideoJuego("13", "street fighter", "pc", 2, "shooter");
        VideoJuego video3 = new VideoJuego("14", "pac man", "nintendo 64", 4, "plataforma");
        VideoJuego video4 = new VideoJuego("15", "pusle", "pc", 2, "plataforma");
        VideoJuego video5 = new VideoJuego("16", "fifa 2021", "play 2", 3, "deporte");

        lista1.add(video1);
        lista1.add(video2);
        lista1.add(video3);
        lista1.add(video4);
        lista1.add(video5);
        
        video2.setCantJugadores(3);
        

      //  for (int i = 0; i < lista1.size(); i++) {

          //  System.out.println(lista1.toString());
          
          for (VideoJuego video : lista1){
              System.out.println("consola " + video.getConsola());
              System.out.println("cantidad de jugadores: " + video.getCantJugadores());
          }
        
        System.out.println("todo " + lista1.toString());
    }

}
