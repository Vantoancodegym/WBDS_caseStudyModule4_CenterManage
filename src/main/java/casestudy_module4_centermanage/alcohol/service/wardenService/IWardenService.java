package casestudy_module4_centermanage.alcohol.service.wardenService;


import casestudy_module4_centermanage.alcohol.model.Classes;
import casestudy_module4_centermanage.alcohol.model.Score;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.Warden;
import casestudy_module4_centermanage.alcohol.model.virtual.AvgScoreLabAndScoreTheoryOfClass;
<<<<<<< HEAD
import casestudy_module4_centermanage.alcohol.model.virtual.TeacherTop;
=======
import casestudy_module4_centermanage.alcohol.service.IService;
import org.aspectj.weaver.patterns.IScope;
>>>>>>> 1d6725b0c0b45b27bbf1a8ceeb6fbf858b7c1387

import java.util.List;


public interface IWardenService {
    Student editStatusForStudent(Student student);
    List<AvgScoreLabAndScoreTheoryOfClass> getAvgScore_labAndAvgScore_theoryByClass();
    boolean editScoreForStudentBySubject(double attitude, double lab, double theory, Long student_id, Long subject_id);
    List<Score> findAll();

}

