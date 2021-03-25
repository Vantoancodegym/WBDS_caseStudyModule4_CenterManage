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
    @PutMapping("editStatusForStudent")
    public ResponseEntity<Student>editStatusForStudent(@RequestBody Student student){
        return new ResponseEntity<>(wardenService.editStatusForStudent(student), HttpStatus.OK);
    }
    @GetMapping("getAvgScore")
    public ResponseEntity<List<AvgScoreLabAndScoreTheoryOfClass>>getAvgScore_labAndAvgScore_theoryByClass(){
        return new ResponseEntity<>(wardenService.getAvgScore_labAndAvgScore_theoryByClass(),HttpStatus.OK);
    }
    @PutMapping("editScoreForStudent/{student_id}/{subject_id}")
    public ResponseEntity<Boolean>editScoreForStudent(@RequestBody Score score, @PathVariable Long student_id, @PathVariable Long subject_id){
        return new ResponseEntity<>(wardenService.editScoreForStudentBySubject(score.getCcore_attitude(),score.getScore_lab(),score.getScore_theory(),student_id,subject_id),HttpStatus.OK);
    }
    @GetMapping("findAllScore")
    public ResponseEntity<List<Score>> find(){
        return new ResponseEntity<>(wardenService.findAll(),HttpStatus.OK);
    }

}
