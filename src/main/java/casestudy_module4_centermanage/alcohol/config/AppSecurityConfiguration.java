package casestudy_module4_centermanage.alcohol.config;

import casestudy_module4_centermanage.alcohol.config.success_dines_handle.AccessDinyHandle;
import casestudy_module4_centermanage.alcohol.config.success_dines_handle.LoginSuccessHandle;
import casestudy_module4_centermanage.alcohol.service.appUerService.AppUser.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class AppSecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    private IAppUserService appUserService;
//    @Autowired
//    private LoginSuccessHandle loginSuccessHandle;
//    @Autowired
//    private AccessDinyHandle accesDinedHandler;
    @Bean
    public RestAuthenticationEntryPoint restServicesEntryPoint() {
        return new RestAuthenticationEntryPoint();
    }
    @Bean
    public JwtAuthenticationFilter jwtAuthenticationFilter() {
        return new JwtAuthenticationFilter();
    }
    @Bean(BeanIds.AUTHENTICATION_MANAGER)
    @Override
    public AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

    //    xac thuc bo nho
    //    @Bean
//    public UserDetailsService userDetailsService(){
//        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
//        InMemoryUserDetailsManager memoryUserDetailsManager = new InMemoryUserDetailsManager();
//        memoryUserDetailsManager.createUser(userBuilder.username("hung").password("123456").roles("USER").build());
//        memoryUserDetailsManager.createUser(userBuilder.username("vohung").password("123456").roles("ADMIN").build());
//        return memoryUserDetailsManager;
//    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService((UserDetailsService) appUserService).passwordEncoder(NoOpPasswordEncoder.getInstance());

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().authenticationEntryPoint(restServicesEntryPoint());
        http.addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
        http.authorizeRequests()
//                .antMatchers("/","/logout","/logot","/admin/insertLiveChat","/admin/findAllLiveChat","/currentUser")
////                .hasAnyRole("ADMIN","WARDEN","STUDENT","TEARCHER")
//                .permitAll()
//        .antMatchers("/", "/login","/admin/countStudent","/admin/countSubject","/admin/countEvent",
//                "/admin/countTeacher","/admin/findAllSubject","/admin/findAllEvent","/admin/getTop5StudentHaveBigScore",
//                "/admin/getTop3Teacher","/admin/countStudentAllCenter","/admin/getTop3Subject","/admin/insertCustomerRegister"
//        ).permitAll()

                .antMatchers("/login").permitAll()
                .antMatchers("/logot").permitAll()
                .antMatchers("/currentUser").permitAll()
                .antMatchers("/admin/**").permitAll()
                .antMatchers("/teacher/**").permitAll()
                .antMatchers("/warden/**").permitAll()
                .anyRequest().authenticated().and()
                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
//        http.addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
//                .exceptionHandling().accessDeniedHandler(accesDinedHandler);
//        http.sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.csrf().disable();

    }
}
