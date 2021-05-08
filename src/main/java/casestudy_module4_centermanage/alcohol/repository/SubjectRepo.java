package casestudy_module4_centermanage.alcohol.repository;

import casestudy_module4_centermanage.alcohol.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepo extends JpaRepository<Subject,Long> {
    @Query(value = "select count(*) from subject",nativeQuery = true)
    int countSubject();
    @Query(value = "select * from   subject order by id desc limit 3",nativeQuery = true)
    List<Subject> getTop3Subject();
}
