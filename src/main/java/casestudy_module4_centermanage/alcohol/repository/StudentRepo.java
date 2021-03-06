package casestudy_module4_centermanage.alcohol.repository;

import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.virtual.AllStudentByTeacher;
import casestudy_module4_centermanage.alcohol.model.virtual.StudentAmountByClass;
import casestudy_module4_centermanage.alcohol.model.virtual.UserAppVirtual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
    @Query(value = "select count(*) as amountStudent from student inner join classes\n" +
            "            on classes.id = student.classes_id group by classes.name",nativeQuery = true)
    List<StudentAmountByClass> countStudentForClass();
    @Query(value = "select count(*) as amountStudent from student inner join classes\n" +
            "                on classes.id = student.classes_id", nativeQuery = true)
    int countStudentAllCenter();
    // sua thuoc tinh student them avgScore
    @Query(value = "select app_user.display_name,avgScore from (select app_user_id ,classes_id,student_id,(score_theory+score_lab+ccore_attitude)/3 as avgScore\n" +
            "from score join student s on score.student_id = s.id order by avgScore desc limit 5) as abd join app_user on app_user_id = app_user.id",nativeQuery = true)
    List<UserAppVirtual> getTop5StudentHaveBigScore();
    @Query(nativeQuery = true,value = "select display_name as studentName, phone, name as className from student join app_user au on student.app_user_id = au.id join classes c on student.classes_id = c.id join teacher_classes tc on c.id = tc.classes_id where teacher_id =?")
    List<AllStudentByTeacher> getAllStudentForTeacher(Long id);
    List<Student> getStudentByClasses_Id(Long classes_id);
    @Query(nativeQuery = true,value = "select * from student join app_user au on student.app_user_id = au.id where au.display_name like ?;")
    List<Student> findStudentLikeAppUserName(String name);

}
