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
    List<Student> getStudentByClasses_Name();
}
