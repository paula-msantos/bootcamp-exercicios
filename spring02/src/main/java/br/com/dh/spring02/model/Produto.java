package br.com.dh.spring02.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//anotaçao do Spring para gerar todos os getters/setters
@Getter
@Setter
//anotaçao para fazer os contrutores
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    // normalmente se coloca tudo em privado
    private int id;
    private String nome;
    private double valor;

}
