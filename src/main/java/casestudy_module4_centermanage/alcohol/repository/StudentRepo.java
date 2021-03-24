package casestudy_module4_centermanage.alcohol.repository;

import casestudy_module4_centermanage.alcohol.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
    @Query(value = "select count(*) from teacher_classes inner join student\n" +
            "on teacher_classes.classes_id = student.classes_id",nativeQuery = true)
    int countStudentForTeacher();
    // sua thuoc tinh student them avgScore
    @Query(value = "select app_user.display_name,avgScore from (select app_user_id ,classes_id,student_id,(score_theory+score_lab+ccore_attitude)/3 as avgScore\n" +
            "from score join student s on score.student_id = s.id order by avgScore desc limit 5) as abd join app_user on app_user_id = app_user.id",nativeQuery = true)
    List<Student> getTop5StudentHaveBigScore();
}
