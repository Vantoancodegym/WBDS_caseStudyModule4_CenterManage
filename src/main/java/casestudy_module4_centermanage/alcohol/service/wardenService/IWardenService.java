package casestudy_module4_centermanage.alcohol.service.wardenService;
import casestudy_module4_centermanage.alcohol.model.Score;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.virtual.AvgScoreLabAndScoreTheoryOfClass;
import java.util.List;


public interface IWardenService {
    Student editStatusForStudent(Student student);
    List<AvgScoreLabAndScoreTheoryOfClass> getAvgScore_labAndAvgScore_theoryByClass();
    boolean editScoreForStudentBySubject(double attitude, double lab, double theory, Long student_id, Long subject_id);
    List<Score> findAll();

}

