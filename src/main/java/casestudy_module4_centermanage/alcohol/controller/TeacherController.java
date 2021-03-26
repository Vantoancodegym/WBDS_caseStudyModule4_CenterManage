package casestudy_module4_centermanage.alcohol.controller;


import casestudy_module4_centermanage.alcohol.model.Diary;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.virtual.FindAllClassByTeacher;
import casestudy_module4_centermanage.alcohol.model.virtual.FindByStudentByClass;
import casestudy_module4_centermanage.alcohol.service.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("classes/{id}")
    public ResponseEntity<List<FindAllClassByTeacher>>showAllClassesByTeacher(@PathVariable Long id){
       List<FindAllClassByTeacher> list = teacherService.showAllClassByTeacher(id);
        return new  ResponseEntity<>(list, HttpStatus.OK);
    }
    @GetMapping("diary")
    public ResponseEntity<List<Diary>>showAllDiary(){
        List<Diary>diaryList = teacherService.findAll();
        return new ResponseEntity<>(diaryList,HttpStatus.OK);
    }
    @GetMapping("student")
    public ResponseEntity<List<FindByStudentByClass>>ShowAllStudentByClassAndTeacher(@RequestParam Long id,Long cd){
        List<FindByStudentByClass> list=teacherService.showAllStudentByClass(id,cd);
//        System.out.println(cd);
//        System.out.println(id);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @PostMapping("diary/create")
    public ResponseEntity<Diary> createDiary(@RequestBody Diary diary){
        return new ResponseEntity<>(teacherService.addDiaryByClass(diary),HttpStatus.OK);
    }

}
