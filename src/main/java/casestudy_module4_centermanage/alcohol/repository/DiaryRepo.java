package casestudy_module4_centermanage.alcohol.repository;

import casestudy_module4_centermanage.alcohol.model.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiaryRepo extends JpaRepository<Diary,Long> {
    List<Diary> findDiaryByClasses_Id(Long class_id);
    List<Diary> findDiaryByStudent_Id(Long student_id);
}
