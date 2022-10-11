package br.com.dh.spring03.controller;

import br.com.dh.spring03.exception.NotFoundException;
import br.com.dh.spring03.model.Veiculo;
import br.com.dh.spring03.service.VeiculoService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping
    public ResponseEntity<List<Veiculo>> getAll(){
        return new ResponseEntity<>(service.getAllVeiculo(), HttpStatus.OK);
    }

    @GetMapping("/byValue")
    public ResponseEntity<List<Veiculo>> getAllOrderByValue(){
        return new ResponseEntity<>(service.getAllOrderByValue(), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Veiculo veiculo){
        service.save(veiculo);
    }

}
