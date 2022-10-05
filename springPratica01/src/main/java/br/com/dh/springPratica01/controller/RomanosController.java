package br.com.dh.springPratica01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/numero")
public class RomanosController {
    private final Map<Integer,String> dicionarioRomano = new TreeMap<>(Collections.reverseOrder()) {{
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
        put(40, "XL");
        put(50, "L");
        put(90, "XC");
        put(100, "C");
        put(400, "CD");
        put(500, "D");
        put(900, "CM");
        put(1000, "M");
    }};

    @GetMapping("/decimais/{inteiro}")
    public String getDecimais(@PathVariable int inteiro){
        StringBuilder romano = new StringBuilder();

        for(var romano2 : dicionarioRomano.entrySet())
        {
            int valor = romano2.getKey();
            String caractere = romano2.getValue();

            int quantidade = inteiro/valor;
            for (int i =0; i < quantidade;i++){
                romano.append(caractere);
                inteiro-=valor;
            }
        }

        return romano.toString();
    }
}
