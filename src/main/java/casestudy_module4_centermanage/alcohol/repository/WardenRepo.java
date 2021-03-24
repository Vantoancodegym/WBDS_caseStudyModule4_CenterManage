package casestudy_module4_centermanage.alcohol.repository;

import casestudy_module4_centermanage.alcohol.model.Classes;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.Warden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WardenRepo extends JpaRepository<Warden, Long> {

    @Query(value = "select avg(score_lab) ,avg(score_theory),name\n" +
            "from score s\n" +
            "         join student s1\n" +
            "              on s1.id = s.student_id\n" +
            "         join classes c\n" +
            "              on c.id = s1.classes_id group by name", nativeQuery = true)
    double avgClasses();


}
