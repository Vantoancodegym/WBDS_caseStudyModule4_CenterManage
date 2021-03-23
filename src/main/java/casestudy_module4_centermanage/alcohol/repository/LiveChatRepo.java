package casestudy_module4_centermanage.alcohol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiveChatRepo extends JpaRepository<LiveChatRepo,Long> {
}
