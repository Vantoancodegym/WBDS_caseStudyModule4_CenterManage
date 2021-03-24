package casestudy_module4_centermanage.alcohol.repository;

import casestudy_module4_centermanage.alcohol.model.Classes;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.Warden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WardenRepo extends JpaRepository<Warden,Long> {
//    Iterable<Student> findAllByNameContaining (String name);
//
//    Iterable<Student> findAllByClassess(Classes classes);
//
//
//    @Query (value = "select avg(score_lab),avg(score_theory)\n"+
//            "from score s join student s1 on s1.id = s.student_id\n"+
//            "join classes c on c.id = s1.classes_id",nativeQuery = true)
//    double avgClasses();

}
