package casestudy_module4_centermanage.alcohol.controller;


import casestudy_module4_centermanage.alcohol.model.Score;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.service.wardenService.IWardenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("wardens")
public class WardenController {

    @Autowired
    private IWardenService wardenService;


   @PutMapping("student/edit/{id}")
    public ResponseEntity<Student> editStatus(@PathVariable Long id, @RequestBody Student student  ){
       student.setId(id);
       wardenService.editStatusOfStudent(student);
      return new ResponseEntity<>(HttpStatus.OK);
   }

   @PutMapping("score/edit/{id}")
    public ResponseEntity<Score> editScoreStudent (@PathVariable Long id, @RequestBody Score score){
       score.setId(id);
       wardenService.save(score);
       return new ResponseEntity<>(HttpStatus.OK);
   }

   @PostMapping("score/create")
    public ResponseEntity<Score> creatScoreStudent (@RequestBody Score score){
       wardenService.save(score);
       return new ResponseEntity<>(HttpStatus.OK);
   }

   @DeleteMapping ("score/delete/{id}")
    public ResponseEntity<Score> deleteScoreStudent (@RequestBody Score score, @PathVariable Long id){
       score.setId(id);
       wardenService.delete(id);
       return new ResponseEntity<>(HttpStatus.OK);
   }




}
