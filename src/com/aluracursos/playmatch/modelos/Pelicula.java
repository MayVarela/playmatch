
public class Pelicula {

    String nombre;

    int fechaDeLanzamiento;

    int duracionEnMinutos;

    boolean incluidoEnElPlan;

    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    void muestraFichaTecnica(){
        System.out.println("La pelicula es: " + nombre);
        System.out.println("Fue lanza en: " + fechaDeLanzamiento);
        System.out.println("su duracion es: " + duracionEnMinutos);
    }

    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}

