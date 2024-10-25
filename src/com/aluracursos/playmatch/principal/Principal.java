import com.aluracursos.playmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.playmatch.calculos.FiltroRecomendacion;
import com.aluracursos.playmatch.modelos.Episodio;
import com.aluracursos.playmatch.modelos.Pelicula;
import com.aluracursos.playmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setDuracionEnMinutos(120);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.3);
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeLasEvaluaciones());
        System.out.println("Media de evaluaciones de la pelicula " + miPelicula.calculaMedia());

        System.out.println("***********************************************");

        Pelicula otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.setDuracionEnMinutos(200);

        otraPelicula.muestraFichaTecnica();

        System.out.println("***********************************************");

        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.setDuracionEnMinutos(180);
        peliculaDeBruno.muestraFichaTecnica();

        System.out.println("***********************************************");

        Serie casaDragon = new Serie("La Casa del Dragon", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();

        System.out.println("***********************************************");

        var lost = new Serie("Lost", 2000);
        lost.muestraFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duracion de la serie"  + lost.getDuracionEnMinutos());


        System.out.println("***********************************************");

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(otraPelicula);
        calculadora.incluye(lost);
        System.out.println(calculadora.getTiempoTotal());

        System.out.println("***********************************************");

        FiltroRecomendacion filtro = new FiltroRecomendacion();
        filtro.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizaciones(300);
        filtro.filtra(episodio);



        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeBruno);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas.toString());

        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());


    }
}
