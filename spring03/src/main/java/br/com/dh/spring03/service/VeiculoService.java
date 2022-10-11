package br.com.dh.spring03.service;

import br.com.dh.spring03.exception.NotFoundException;
import br.com.dh.spring03.model.Veiculo;
import br.com.dh.spring03.repository.VeiculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VeiculoService implements IVeiculo{

    @Autowired
    private VeiculoRepo repo;

    @Override
    public Veiculo getVeiculo(String placa) throws NotFoundException {
        Optional<Veiculo> veiculo = repo.getVeiculo(placa);

        if(veiculo.isEmpty()) {
            throw new NotFoundException("Veiculo não encontrado.");
        }
        return veiculo.get();
    }

    @Override
    public List<Veiculo> getAllVeiculo() {
        return repo.getAllVeiculo();
    }

    //como estou usando novamente  getAll, nao preciso criar nada no repo.
    public List<Veiculo> getAllOrderByValue() {
        List<Veiculo> veiculos = repo.getAllVeiculo();

        return veiculos.stream().sorted().collect(Collectors.toList());
    }

    @Override
    public void save(Veiculo veiculo) {
        repo.saveVeiculo(veiculo);
    }
}
