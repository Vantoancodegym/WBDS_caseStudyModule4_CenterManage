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

@RestController
@RequestMapping("/warden")
public class WardenController {
    @Autowired
    private WardenService wardenService;

    @PutMapping("editStatusForStudent/{id}")
    public ResponseEntity<Student> editStatusForStudent(@RequestBody Student student, @PathVariable Long id) {
        student.setId(id);
        return new ResponseEntity<>(wardenService.editStatusForStudent(student), HttpStatus.OK);
    }

    @GetMapping("getAvgScore")
    public ResponseEntity<List<AvgScoreLabAndScoreTheoryOfClass>> getAvgScore_labAndAvgScore_theoryByClass() {
        return new ResponseEntity<>(wardenService.getAvgScore_labAndAvgScore_theoryByClass(), HttpStatus.OK);
    }

    @PutMapping("editScoreForStudent")
    public ResponseEntity<Boolean> editScoreForStudent(@RequestBody Score score) {
        return new ResponseEntity<>(wardenService.editScoreForStudentBySubject(score.getCcore_attitude(), score.getScore_lab(), score.getScore_theory(), score.getStudent().getId(), score.getSubject().getId()), HttpStatus.OK);
    }

    @GetMapping("findAllScore")
    public ResponseEntity<List<Score>> find() {
        return new ResponseEntity<>(wardenService.findAll(), HttpStatus.OK);
    }

    @GetMapping("findAllStudent")
    public ResponseEntity<List<Student>> findStudent(){
        return new ResponseEntity<>(wardenService.findAllStudent(),HttpStatus.OK);
    }
}
