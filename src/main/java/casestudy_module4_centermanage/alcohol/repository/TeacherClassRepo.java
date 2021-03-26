package casestudy_module4_centermanage.alcohol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherClassRepo extends JpaRepository<Integer,Long> {
    @Query(value = "insert into teacher_classes (teacher_id, classes_id) values(?,?)",nativeQuery = true)
    void createTeacherClass();
}
