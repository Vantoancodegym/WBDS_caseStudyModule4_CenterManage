package casestudy_module4_centermanage.alcohol.repository;

import casestudy_module4_centermanage.alcohol.model.AppUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppUserRepo extends CrudRepository<AppUser,Long> {
    AppUser findAppUserByUsername(String username);
    @Query(nativeQuery = true,value = "select * from app_user order by app_role_id;")
    List<AppUser> findALlUserOrderByRole();
}
