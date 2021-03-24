package casestudy_module4_centermanage.alcohol.controller;

import casestudy_module4_centermanage.alcohol.model.Classes;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.service.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("teacher")
public class TeacherController {
//    @Autowired
//    private TeacherService teacherService;
//
//    @GetMapping
//    public ResponseEntity<List<Classes>>showAllClasses(){
//       List<Classes> classList = teacherService.showAllClass();
//        return new  ResponseEntity<>(classList, HttpStatus.OK);
//    }
//    @GetMapping
//    public ResponseEntity<List<Student>>ShowAllStudent(){
//        return new ResponseEntity<>(teacherService.showAllStudentByClass(),HttpStatus.OK);
//    }
}
