package casestudy_module4_centermanage.alcohol.repository;

import casestudy_module4_centermanage.alcohol.model.Score;
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
}
