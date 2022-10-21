package br.com.dh.AsPerolas.controller;

import br.com.dh.AsPerolas.model.Joia;
import br.com.dh.AsPerolas.service.JoiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/joia")
public class Controller {
    // ligando com o service
    @Autowired
    private JoiaService service;

    @PostMapping
    public ResponseEntity<Joia> novaJoia(@RequestBody Joia joia){
        Joia newJoia = service.inserir(joia);
        return new ResponseEntity<>(newJoia, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Joia> findJoia(@PathVariable long id){
        Optional<Joia> optionalJoia = service.find(id);

        if(optionalJoia.isPresent()){
            return new ResponseEntity<>(optionalJoia.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping
    public ResponseEntity<Joia> updateJoia(@RequestBody Joia joia){
        Joia joiaUpdate = service.update(joia);
        return new ResponseEntity<>(joia, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJoia(@PathVariable long id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
