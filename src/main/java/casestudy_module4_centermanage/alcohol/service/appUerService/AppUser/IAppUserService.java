package casestudy_module4_centermanage.alcohol.service.appUerService.AppUser;

import casestudy_module4_centermanage.alcohol.model.AppUser;

import java.util.List;

public interface IAppUserService {
    AppUser findByUsername(String username);
    AppUser getUserCurrent();
    AppUser createAppUser(AppUser appUser);
    List<AppUser> getAllUser();

}
