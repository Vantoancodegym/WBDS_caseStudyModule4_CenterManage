package casestudy_module4_centermanage.alcohol.controller;


import casestudy_module4_centermanage.alcohol.model.Score;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.virtual.AvgScoreLabAndScoreTheoryOfClass;
import casestudy_module4_centermanage.alcohol.service.wardenService.WardenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/warden")
public class WardenController {
    @Autowired
    private WardenService wardenService;
<<<<<<< HEAD

    @PutMapping("editStatusForStudent/{id}")
    public ResponseEntity<Student> editStatusForStudent(@RequestBody Student student, @PathVariable Long id) {
        student.setId(id);
=======
    @PutMapping("editStatusForStudent")

    public ResponseEntity<Student>editStatusForStudent(@RequestBody Student student,@PathVariable Long id){
>>>>>>> c5e21f5cbd388ee6c91bd93f5d501e8ad6d76ef5
        return new ResponseEntity<>(wardenService.editStatusForStudent(student), HttpStatus.OK);
    }

    @GetMapping("getAvgScore")
<<<<<<< HEAD
    public ResponseEntity<List<AvgScoreLabAndScoreTheoryOfClass>> getAvgScore_labAndAvgScore_theoryByClass() {
        return new ResponseEntity<>(wardenService.getAvgScore_labAndAvgScore_theoryByClass(), HttpStatus.OK);
    }

    @GetMapping("findAllScore")
    public ResponseEntity<List<Score>> find() {
        return new ResponseEntity<>(wardenService.findAll(), HttpStatus.OK);
    }

    @GetMapping("findAllStudent")
    public ResponseEntity<List<Student>> findStudent(){
        return new ResponseEntity<>(wardenService.findAllStudent(),HttpStatus.OK);
    }

    @PutMapping("editScore")
    public ResponseEntity<?>editScoreForStudentBySubject(@RequestBody Score score){
        System.out.println(score.getCcore_attitude());
        System.out.println(score.getScore_lab());
        System.out.println(score.getScore_theory());
        System.out.println(score.getId());
        System.out.println(score.getStudent().getId());
        System.out.println(score.getSubject().getId());
//        wardenService.editScoreForStudentBySubject(score.getCcore_attitude(),score.getScore_lab(),score.getScore_theory(),score.getStudent().getId(), score.getSubject().getId());
        wardenService.editScoreForStudentBySubject(7,7,7,1L,2L);
        return new ResponseEntity<>(HttpStatus.OK);
    }
=======
    public ResponseEntity<List<AvgScoreLabAndScoreTheoryOfClass>>getAvgScore_labAndAvgScore_theoryByClass(){
        return new ResponseEntity<>(wardenService.getAvgScore_labAndAvgScore_theoryByClass(),HttpStatus.OK);
    }
    @PutMapping("editScoreForStudent/{id}")
    public ResponseEntity<Boolean>editScoreForStudent(@RequestBody Score score,@PathVariable Long id) {
        return new ResponseEntity<>(wardenService.editScoreForStudentBySubject(score.getCcore_attitude(), score.getScore_lab(), score.getScore_theory(), score.getSubject().getId(), score.getStudent().getId()), HttpStatus.OK);
    }
>>>>>>> c5e21f5cbd388ee6c91bd93f5d501e8ad6d76ef5
}
