package casestudy_module4_centermanage.alcohol.controller;


import casestudy_module4_centermanage.alcohol.model.Score;
import casestudy_module4_centermanage.alcohol.model.Status;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.virtual.AvgScoreLabAndScoreTheoryOfClass;
import casestudy_module4_centermanage.alcohol.model.virtual.FindStudentBySubjectAndClass;
import casestudy_module4_centermanage.alcohol.service.StatusService;
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
    @Autowired
    private StatusService statusService;

    @PutMapping("editStatusForStudent/{id}")
    public ResponseEntity<Student> editStatusForStudent(@RequestBody Student student, @PathVariable Long id) {
        student.setId(id);
        return new ResponseEntity<>(wardenService.editStatusForStudent(student), HttpStatus.OK);
    }

    @GetMapping("getAvgScore")
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


    @GetMapping("findOneStudent")
    public ResponseEntity<List<FindStudentBySubjectAndClass>> findOneStudentBySubjectAndClass(@RequestParam Long std, Long sd,Long cd){
        return new ResponseEntity<>(wardenService.findStudentBySubAndClasses(std,sd, cd),HttpStatus.OK);
    }

    @PutMapping("editScoreStudent")
    public ResponseEntity<Score> editScore(@RequestBody Score score){
        return new ResponseEntity<>(wardenService.editScoreByStudent(score),HttpStatus.OK);
    }
    @GetMapping("findAllStatus")
    public ResponseEntity<List<Status>> findALlStatus(){
        return new ResponseEntity<>(statusService.findAll(),HttpStatus.OK);
    }
}
