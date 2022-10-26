package br.com.dh.storage02.service;

import br.com.dh.storage02.model.Author;
import br.com.dh.storage02.repository.AuthorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepo repo;

    public Author insert(Author author) {
        return repo.save(author);
    }

}
