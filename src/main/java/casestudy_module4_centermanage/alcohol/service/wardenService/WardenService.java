package casestudy_module4_centermanage.alcohol.service.wardenService;

import casestudy_module4_centermanage.alcohol.model.Classes;
import casestudy_module4_centermanage.alcohol.model.Score;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.Warden;
import casestudy_module4_centermanage.alcohol.model.Score;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.virtual.AvgScoreLabAndScoreTheoryOfClass;
import casestudy_module4_centermanage.alcohol.model.virtual.FindStudentBySubjectAndClass;
import casestudy_module4_centermanage.alcohol.model.virtual.TeacherTop;
import casestudy_module4_centermanage.alcohol.repository.ScoreRepo;
import casestudy_module4_centermanage.alcohol.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class WardenService implements IWardenService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
     private ScoreRepo scoreRepo;


    @Override
    public Student editStatusForStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<AvgScoreLabAndScoreTheoryOfClass> getAvgScore_labAndAvgScore_theoryByClass() {
        return scoreRepo.getAvgScore_labAndAvgScore_theoryByClass();
    }

    @Override
    public int editScoreForStudentBySubject(double attitude, double lab, double theory, Long student_id, Long subject_id) {
        return scoreRepo.editScoreForStudentBySubject(attitude,lab,theory,student_id,subject_id);
    }

    @Override
    public List<Score> findAll() {
        return scoreRepo.findAll();
    }

    @Override
    public List<Student> findAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public List<FindStudentBySubjectAndClass> findStudentBySubAndClasses(Long s2_id,Long c_id) {
        return scoreRepo.findStudentBySubAndClass( s2_id, c_id);
    }

}


