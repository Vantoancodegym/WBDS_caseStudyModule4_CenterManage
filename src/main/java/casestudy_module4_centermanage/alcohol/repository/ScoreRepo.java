package casestudy_module4_centermanage.alcohol.repository;

import casestudy_module4_centermanage.alcohol.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepo extends JpaRepository<Score,Long> {
    @Query(value = "select classes_id,(avg(score_theory)+avg(score_lab)+avg(ccore_attitude))/3\n" +
            "from score join student s on score.student_id = s.id group by classes_id",nativeQuery = true)
    double getAvgScoreByClasses();
}
