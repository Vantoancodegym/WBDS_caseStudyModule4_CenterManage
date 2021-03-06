package casestudy_module4_centermanage.alcohol.service.wardenService;

import casestudy_module4_centermanage.alcohol.model.Classes;
import casestudy_module4_centermanage.alcohol.model.Score;
import casestudy_module4_centermanage.alcohol.model.Status;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.virtual.AvgScoreLabAndScoreTheoryOfClass;
import casestudy_module4_centermanage.alcohol.model.virtual.FindStudentBySubjectAndClass;
import casestudy_module4_centermanage.alcohol.model.virtual.TeacherTop;
import casestudy_module4_centermanage.alcohol.repository.ScoreRepo;
import casestudy_module4_centermanage.alcohol.repository.StatusRepo;
import casestudy_module4_centermanage.alcohol.repository.StudentRepo;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public class WardenService implements IWardenService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
     private ScoreRepo scoreRepo;
    @Autowired
    private StatusRepo statusRepo;


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
    public List<FindStudentBySubjectAndClass> findStudentBySubAndClasses(Long s_id, Long s2_id,Long c_id) {
        List<FindStudentBySubjectAndClass> list = scoreRepo.findStudentBySubAndClass(s_id,s2_id,c_id);
        return list;
    }

    @Override
    public Score editScoreByStudent(Score score) {
        return scoreRepo.save(score);
    }

    @Override
    public void editStudentStatus(Long status_id, Long student_id) {
        Student student=studentRepo.findById(student_id).get();
        Status status=statusRepo.findById(status_id).get();
        student.setStatus(status);
        studentRepo.save(student);
    }

    @Override
    public List<Score> findScoreByStudent(Long student_id) {
        return scoreRepo.findScoreByStudent_Id(student_id);
    }

    @Override
    public void editScoreByIdAndScore(Long id, double score_theory, double score_lab, double ccore_attide) {
        Score score=scoreRepo.findById(id).get();
        score.setScore_lab(score_lab);
        score.setScore_theory(score_theory);
        score.setCcore_attitude(ccore_attide);
        scoreRepo.save(score);
    }

    @Override
    public List<Student> findStudentLikeAppUserName(String name) {
        name="%"+name+"%";
        return studentRepo.findStudentLikeAppUserName(name);
    }
}


