package br.com.dh.AsPerolas.service;

import br.com.dh.AsPerolas.model.Joia;
import br.com.dh.AsPerolas.repository.JoiaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class JoiaService {

    //ligando ao repositorio
    @Autowired
    private JoiaRepo repo;

    //metodos
    // inserindo uma nova joia no BD
    public Joia inserir(Joia joia){
        Joia newJoia = repo.save(joia);
        return newJoia;
    }
    //procurando uma joia pelo id
    public Optional<Joia> find(long id){
        return repo.findById(id);
    }
    // atualizando uma joia que já existe no BD
    public Joia update(Joia joia){
        return repo.save(joia);
    }
    // deletando uma joia do BD
    public void delete(long id){
        repo.deleteById(id);
    }
}
