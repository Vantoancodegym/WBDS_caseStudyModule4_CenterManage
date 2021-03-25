package casestudy_module4_centermanage.alcohol.repository;

import casestudy_module4_centermanage.alcohol.model.AppUser;
import casestudy_module4_centermanage.alcohol.model.Classes;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.Teacher;
import casestudy_module4_centermanage.alcohol.model.virtual.FindAllClassByTeacher;
import casestudy_module4_centermanage.alcohol.model.virtual.TeacherTop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Long> {
    @Query(value = "select au.display_name,c2.name as category , c.name as classesName from teacher join teacher_classes on teacher.id = teacher_classes.teacher_id join classes c on teacher_classes.classes_id = c.id join app_user au on teacher.app_user_id = au.id join category c2 on c.category_id = c2.id where teacher_id = ?", nativeQuery = true)
    List<FindAllClassByTeacher> findAllClassByTeacher(Long id);
    @Query(value = "select display_name , name from (teacher_classes join teacher t on teacher_classes.teacher_id = t.id) join classes c on c.id= classes_id\n" +
            "join student s on c.id = s.classes_id\n" +
            "join app_user ap on s.app_user_id = ap.id",nativeQuery = true)
    List<AppUser> findAllStudentByClass();

    @Query(value = "select count(*) from teacher",nativeQuery = true)
    int countTeacher();
    @Query(value = "select display_name as name,app_user.avatar as image,salary,address,phone from app_user join teacher t on app_user.id = t.app_user_id order by salary desc limit 3",nativeQuery = true)
    List<TeacherTop> getTop3Teacher();
}
