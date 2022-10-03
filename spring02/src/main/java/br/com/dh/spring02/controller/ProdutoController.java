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

    List<Produto> produtos = new ArrayList<>();

    public ProdutoController() {
        produtos.add(new Produto(1, "Produto 01", 10));
        produtos.add(new Produto(2, "Produto 02", 20));
        produtos.add(new Produto(3, "Produto 03", 30));
    }

}
