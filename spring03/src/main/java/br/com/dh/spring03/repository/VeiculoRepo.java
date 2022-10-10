package br.com.dh.spring03.repository;

import br.com.dh.spring03.model.Veiculo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Repository
public class VeiculoRepo {

    private final String linkFile = "src/main/resources/veiculos.json";
    ObjectMapper mapper = new ObjectMapper();

    public Veiculo getVeiculo(String placa){
        List<Veiculo> veiculos = null; //nesse momento só estou alocando a memoria para a lista que vamos receber
        try{
            veiculos = Arrays.asList(mapper.readValue(new File(linkFile), Veiculo[].class)); //aqui estou transformando
            // em lista vindo do json atraves do mapper
        }catch (Exception ex){

        }
        for(Veiculo v: veiculos){
            if (v.getPlaca().equalsIgnoreCase(placa)){
                return v;
            }
        }
        return null;
    }

}
