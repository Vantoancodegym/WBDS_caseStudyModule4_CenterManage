package casestudy_module4_centermanage.alcohol.repository;

import casestudy_module4_centermanage.alcohol.model.Classes;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Long> {
    @Query(value = "select username, name from (teacher_classes join teacher t on teacher_classes.teacher_id = t.id) join classes c on c.id= classes_id\n" +
            "join student s on c.id = s.classes_id\n" +
            "join app_user ap on s.app_user_id = ap.id",nativeQuery = true)
    List<Student> showAllStudentByClass();


}
