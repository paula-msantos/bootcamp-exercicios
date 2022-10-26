package br.com.dh.storage02.repository;

import br.com.dh.storage02.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Long> {
}
