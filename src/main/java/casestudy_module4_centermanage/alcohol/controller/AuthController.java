package casestudy_module4_centermanage.alcohol.controller;

import casestudy_module4_centermanage.alcohol.model.AppUser;
import casestudy_module4_centermanage.alcohol.model.JwtResponse;
import casestudy_module4_centermanage.alcohol.model.Token;
import casestudy_module4_centermanage.alcohol.service.appUerService.AppUser.AppUserService;
import casestudy_module4_centermanage.alcohol.service.jwtService.JwtService;
import casestudy_module4_centermanage.alcohol.service.tokenService.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

@CrossOrigin("*")
@RestController
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AppUserService userService;
    @Autowired
    private TokenService tokenService;
    private AppUser getCurrentUser(){
        return userService.getUserCurrent();
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AppUser user) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtService.generateTokenLogin(authentication);
        Token token=new Token(jwt);
        tokenService.save(token);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        AppUser currentUser = userService.findByUsername(user.getUsername());
        return ResponseEntity.ok(new JwtResponse(jwt, currentUser.getId(), userDetails.getUsername(), userDetails.getAuthorities()));
    }
    @GetMapping("/logot")
    public String logout(HttpServletRequest request){
        String token=tokenService.getJwtFromRequest(request);
        System.out.println(token);
        tokenService.delete(token);
        return "succsess";
    }
    @GetMapping("currentUser")
     public ResponseEntity<AppUser> currentUser(){
        return new ResponseEntity<>(getCurrentUser(),HttpStatus.OK);
    }

}