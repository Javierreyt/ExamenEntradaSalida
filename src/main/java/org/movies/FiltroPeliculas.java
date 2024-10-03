package org.movies;

import java.io.*;
import java.util.ArrayList;

public class FiltroPeliculas {
    private ArrayList<Movie> movies;
    //Aqui una vez leidas las peliculas filtramos por el año pasado por parametro
    public void filtrarPorAño(Integer año) {
        try (BufferedWriter bfw = new BufferedWriter(new FileWriter("/Users/javierreyt/Desktop/DEV/SCV/CESUR/ProgramacionServiciosProcesos/ExamenEntradaSalida/PeliculasPosterioresA" + año + ".csv"))) {
            for (Movie m : movies) {
                if (año < m.getYear()) {
                    bfw.write(m.toString());
                    bfw.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //Con este metodo leemos las peliculas y la almacenamos en el atributo movies.
    public void readMovies() {
        File moviesFiles = new File("/Users/javierreyt/Desktop/DEV/SCV/CESUR/ProgramacionServiciosProcesos/ExamenEntradaSalida/peliculas.csv");
        movies = new ArrayList<>();
        try (BufferedReader bfr = new BufferedReader(new FileReader(moviesFiles))) {
            String line;
            while ((line = bfr.readLine()) != null) {
                String[] split = line.split(",");
                movies.add(new Movie(
                        split[0],
                        split[1],
                        Integer.parseInt(split[2]),
                        split[3],
                        split[4]
                ));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
