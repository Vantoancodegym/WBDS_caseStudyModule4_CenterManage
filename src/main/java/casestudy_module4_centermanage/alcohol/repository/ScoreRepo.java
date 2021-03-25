package casestudy_module4_centermanage.alcohol.repository;

import casestudy_module4_centermanage.alcohol.model.Score;
import casestudy_module4_centermanage.alcohol.model.virtual.AvgScoreLabAndScoreTheoryOfClass;
import casestudy_module4_centermanage.alcohol.model.virtual.ClassesVirtual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreRepo extends JpaRepository<Score,Long> {
    @Query(value = "select c.name,(avg(score_theory)+avg(score_lab)+avg(ccore_attitude))/3 as avgScore \n" +
            "from score join student s on score.student_id = s.id join classes c on s.classes_id = c.id group by classes_id",nativeQuery = true)
    List<ClassesVirtual> getAvgScoreByClasses();

    @Query(value = "select c.name,avg(score_theory) as avgScoreTheory,avg(score_lab) as avgScoreLab\n" +
            "            from score join student s on score.student_id = s.id join classes c on s.classes_id = c.id group by classes_id",nativeQuery = true)
    List<AvgScoreLabAndScoreTheoryOfClass> getAvgScore_labAndAvgScore_theoryByClass();

    @Query(value = "update score set ccore_attitude = ?1, score_lab =?2, score_theory =?3 " +
            "where student_id = ?4 and subject_id = ?5",nativeQuery = true)
    boolean editScoreForStudentBySubject(double attitude, double lab, double theory, Long student_id, Long subject_id);

}
