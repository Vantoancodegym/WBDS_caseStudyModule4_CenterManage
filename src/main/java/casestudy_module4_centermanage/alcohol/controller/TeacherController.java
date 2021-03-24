package casestudy_module4_centermanage.alcohol.controller;

import casestudy_module4_centermanage.alcohol.model.AppUser;
import casestudy_module4_centermanage.alcohol.model.Classes;
import casestudy_module4_centermanage.alcohol.model.Diary;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.service.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("classes")
    public ResponseEntity<List<Classes>>showAllClasses(){
       List<Classes> classList = teacherService.showAllClass();
        return new  ResponseEntity<>(classList, HttpStatus.OK);
    }
    @GetMapping("diary")
    public ResponseEntity<List<Diary>>showAllDiary(){
        List<Diary>diaryList = teacherService.findAll();
        return new ResponseEntity<>(diaryList,HttpStatus.OK);
    }
    @GetMapping("student")
    public ResponseEntity<List<AppUser>>ShowAllStudent(){
        return new ResponseEntity<>(teacherService.showAllStudentByClass(),HttpStatus.OK);
    }
    @DeleteMapping("diary/delete/{id}")
    public ResponseEntity<Diary>deleteDiary(@PathVariable Long id){
        teacherService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PostMapping("diary/create")
    public ResponseEntity<Diary> createDiary(@RequestBody Diary diary){

        return new ResponseEntity<>(teacherService.create(diary),HttpStatus.OK);
    }
    @PutMapping("diary/edit/{id}")
    public ResponseEntity<Diary> editDiary(@PathVariable Long id,@RequestBody Diary diary){
        diary.setId(id);
        return new ResponseEntity<>(teacherService.edit(diary),HttpStatus.OK);
    }

}
