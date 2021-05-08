package casestudy_module4_centermanage.alcohol.repository;

import casestudy_module4_centermanage.alcohol.model.CustomerRegister;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRegisterRepo extends JpaRepository<CustomerRegister,Long> {
}
