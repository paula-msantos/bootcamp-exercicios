package br.com.dh.spring03.controller;

import br.com.dh.spring03.exception.NotFoundException;
import br.com.dh.spring03.model.Veiculo;
import br.com.dh.spring03.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired //injeçao de dependencia (o framework gera o objeto)
    private VeiculoService service;

    @GetMapping("/{placa}")
    public ResponseEntity<Veiculo> getVeiculo(@PathVariable String placa){

            Veiculo veiculo = service.getVeiculo(placa);
            return new ResponseEntity<>(veiculo, HttpStatus.OK);

    }

    public ResponseEntity<List<Veiculo>> getAll(){
        return new ResponseEntity<>(service.getAllVeiculo(), HttpStatus.OK);
    }

}
