package casestudy_module4_centermanage.alcohol.repository;

import casestudy_module4_centermanage.alcohol.model.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepo extends JpaRepository<Token,Long> {
    Token findTokenByName(String token);
////    @Query(value = "delete from Token as t where t.name= :name",nativeQuery = false)
//    @Query(value = "delete from Token where name= ?",nativeQuery = true)
//    void deleteByNameQ( String name);
}
