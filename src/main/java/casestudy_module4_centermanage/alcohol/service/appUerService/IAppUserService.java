package casestudy_module4_centermanage.alcohol.service.appUerService;

import casestudy_module4_centermanage.alcohol.model.AppUser;

public interface IAppUserService {
    AppUser findByUsername(String username);
    AppUser getUserCurrent();

}
