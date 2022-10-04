package br.com.dh.springPratica01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/numero")
public class RomanosController {

    @GetMapping("/decimais/{inteiro}")
    public String getDecimais(@PathVariable int inteiro){
        StringBuilder romano = new StringBuilder();
        
        int quantidadeM = inteiro/1000;
        for (int m =0; m < quantidadeM;m++){
            romano.append("M");
            inteiro-=1000;
        }


        //return ""+quantidadeM;
        return romano.toString();
    }

}
