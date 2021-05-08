package casestudy_module4_centermanage.alcohol.service.wardenService;


import casestudy_module4_centermanage.alcohol.model.Score;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.virtual.AvgScoreLabAndScoreTheoryOfClass;
import casestudy_module4_centermanage.alcohol.model.virtual.FindStudentBySubjectAndClass;

import java.util.List;


public interface IWardenService {
    Student editStatusForStudent(Student student);
    List<AvgScoreLabAndScoreTheoryOfClass> getAvgScore_labAndAvgScore_theoryByClass();
    int editScoreForStudentBySubject(double attitude, double lab, double theory, Long student_id, Long subject_id);
    List<Score> findAll();
    List<Student> findAllStudent();
    List<FindStudentBySubjectAndClass> findStudentBySubAndClasses(Long s_id,Long s2_id,Long c_id);
    Score editScoreByStudent (Score score);
    void editStudentStatus(Long status_id, Long student_id);
    List<Score> findScoreByStudent(Long student_id);
    void editScoreByIdAndScore(Long id, double score_theory, double score_lab, double ccore_attide);
    List<Student> findStudentLikeAppUserName(String name);
}

