/*Esta clase la he creado con el objetivo de separar las peliculas de la clase "FiltroPeliculas" que la
uso como Utils.
 */

package org.movies;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Movie{
    private String id;
    private String title;
    private Integer year;
    private String director;
    private String genre;
}

