package br.com.dh.CRUDcomJPA.repository;

import br.com.dh.CRUDcomJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
