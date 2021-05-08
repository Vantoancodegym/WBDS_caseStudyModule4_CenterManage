package casestudy_module4_centermanage.alcohol.service.appUerService.AppUser;

import casestudy_module4_centermanage.alcohol.model.AppUser;
import casestudy_module4_centermanage.alcohol.service.jwtService.JwtService;

import java.util.List;

public interface IAppUserService {
    AppUser findByUsername(String username);
    AppUser getUserCurrent(JwtService jwtService, String token);
    AppUser createAppUser(AppUser appUser);
    List<AppUser> getAllUser();

}
