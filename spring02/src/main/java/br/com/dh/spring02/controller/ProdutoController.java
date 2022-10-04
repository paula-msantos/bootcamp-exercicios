package br.com.dh.spring02.controller;

import br.com.dh.spring02.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    // lista que vai receber Produto (os parametros sao os que estao lá), chamada produtos.
    List<Produto> produtos = new ArrayList<>();

    public ProdutoController(){
        produtos.add(new Produto(1, "Produto 1", 10));
        produtos.add(new Produto(2, "Produto 2", 20));
        produtos.add(new Produto(3, "Produto 3", 30));

    }

    @GetMapping("/{id}")
    public Produto getProduto(@PathVariable int id) {
        Produto p = produtos.get(id-1);
        return p;
    }

}
