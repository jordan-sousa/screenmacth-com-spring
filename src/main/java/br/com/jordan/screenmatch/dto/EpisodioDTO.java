package br.com.jordan.screenmatch.dto;

import java.time.LocalDate;

public record EpisodioDTO(   Integer temporada,
                             String titulo,
                             Integer numeroEpisodio) {
}
