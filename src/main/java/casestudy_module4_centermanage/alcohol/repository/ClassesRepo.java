package casestudy_module4_centermanage.alcohol.repository;

import casestudy_module4_centermanage.alcohol.model.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassesRepo extends JpaRepository<Classes,Long> {
}
