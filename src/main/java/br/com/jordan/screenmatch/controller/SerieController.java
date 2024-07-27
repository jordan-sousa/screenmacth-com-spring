package br.com.jordan.screenmatch.controller;

import br.com.jordan.screenmatch.dto.EpisodioDTO;
import br.com.jordan.screenmatch.dto.SerieDTO;
import br.com.jordan.screenmatch.service.SerieSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieController {
    @Autowired
    private SerieSevice sevice;

    @GetMapping("/series")
    public List<SerieDTO> obterSeries(){
        return sevice.obterTodasAsSeries();
    }

    @GetMapping("/series/top5")
    public List<SerieDTO> obterTop5Series() {
        return sevice.obterTop5Series();
    }

    @GetMapping("/series/lancamentos")
    public List<SerieDTO> obterLancamentos() {
        return sevice.obterLancamento();
    }

    @GetMapping("/series/{id}")
    public SerieDTO obterPorId(@PathVariable Long id) {
        return sevice.obterPorId(id);
    }

    @GetMapping("/series/{id}/temporadas/todas")
    public List<EpisodioDTO> obterTodasTemporadas(@PathVariable Long id) {
        return sevice.obterTodasTemporadas(id);
    }

    @GetMapping("/series/{id}/temporadas/{numero}")
    public List<EpisodioDTO> obterTemporadaPorNumero(@PathVariable Long id, @PathVariable Long numero) {
        return sevice.obterTemporadaPorNumero(id, numero);
    }
}
