package casestudy_module4_centermanage.alcohol.repository;

import casestudy_module4_centermanage.alcohol.model.Classes;
import casestudy_module4_centermanage.alcohol.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Long> {
<<<<<<< HEAD
    @Query(value = "select count(*) from teacher",nativeQuery = true)
    int countTeacher();
=======



>>>>>>> 80a1518af7c4bc895bb7941655d5467a2cfbaada
}
