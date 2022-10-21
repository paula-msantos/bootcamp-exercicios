package controller;

import br.com.dh.CRUDcomJPA.model.Student;
import br.com.dh.CRUDcomJPA.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class Controller {

    @Autowired
    private IStudentService stuService;

    @PostMapping("/create")
    public String createStudent(@RequestBody Student student){
        stuService.saveStudent(student);
        return "O aluno foi adicionado com sucesso";
    }
    @GetMapping("/getStudent")
    public List<Student> getStudents(){
        List<Student> studentList = stuService.getStudents();
        return studentList;
    }
    @PostMapping("edit/{id}")
    public Student editStudent (@PathVariable long id, @RequestParam ("name") String newName,
                                @RequestParam("lastName") String newLastName){
        Student stu = stuService.findStudent(id);
        stu.setName(newName);
        stu.setLastName(newLastName);
        stuService.saveStudent(stu);
        return stu;
    }

    @PostMapping("delete/{id}")
    public String deleteStudent(@PathVariable long id){
        stuService.deleteStudent(id);
        return "O aluno foi excluido com sucesso";
    }







}
