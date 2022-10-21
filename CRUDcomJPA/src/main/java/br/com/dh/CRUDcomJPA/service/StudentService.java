package br.com.dh.CRUDcomJPA.service;

import br.com.dh.CRUDcomJPA.model.Student;
import br.com.dh.CRUDcomJPA.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    // aqui ligamos o service ao repository
    private final StudentRepo stuRepo;

    // construtor
    public StudentService (StudentRepo stuRepo){
        this.stuRepo = stuRepo;
    }

    //metodos que queremos chamar:
    @Override
    public List<Student> getStudents (){
        List<Student> studentList = stuRepo.findAll();
        return studentList;
    }

    public Student findStudent(long id){
        Student stu=stuRepo.findById(id).orElse(null);
        return stu;
    }

    public void saveStudent (Student stu){
        stuRepo.save(stu);
    }

    public void deleteStudent(long id){
        stuRepo.deleteById(id);
    }

}
