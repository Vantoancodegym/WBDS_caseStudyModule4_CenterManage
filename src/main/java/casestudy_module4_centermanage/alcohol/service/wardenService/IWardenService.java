package casestudy_module4_centermanage.alcohol.service.wardenService;
<<<<<<< HEAD


import casestudy_module4_centermanage.alcohol.model.Score;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.virtual.AvgScoreLabAndScoreTheoryOfClass;


=======
import casestudy_module4_centermanage.alcohol.model.Score;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.virtual.AvgScoreLabAndScoreTheoryOfClass;
>>>>>>> c5e21f5cbd388ee6c91bd93f5d501e8ad6d76ef5
import java.util.List;


public interface IWardenService {
    Student editStatusForStudent(Student student);
    List<AvgScoreLabAndScoreTheoryOfClass> getAvgScore_labAndAvgScore_theoryByClass();
    int editScoreForStudentBySubject(double attitude, double lab, double theory, Long student_id, Long subject_id);
    List<Score> findAll();
<<<<<<< HEAD
    List<Student> findAllStudent();
=======

>>>>>>> c5e21f5cbd388ee6c91bd93f5d501e8ad6d76ef5
}

