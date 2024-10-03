package org.main;

import org.movies.FiltroPeliculas;
import org.movies.Movie;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FiltroPeliculas fp = new FiltroPeliculas();
        fp.readMovies();
        fp.filtrarPorAño(1995);
    }
}