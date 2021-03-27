package casestudy_module4_centermanage.alcohol.controller;


import casestudy_module4_centermanage.alcohol.model.AppUser;
import casestudy_module4_centermanage.alcohol.model.Diary;
import casestudy_module4_centermanage.alcohol.model.Teacher_classes;
import casestudy_module4_centermanage.alcohol.model.virtual.FindAllClassByTeacher;
import casestudy_module4_centermanage.alcohol.model.virtual.FindByStudentByClass;
import casestudy_module4_centermanage.alcohol.service.appUerService.AppUser.AppUserService;
import casestudy_module4_centermanage.alcohol.service.jwtService.JwtService;
import casestudy_module4_centermanage.alcohol.service.teacher.TeacherService;
import casestudy_module4_centermanage.alcohol.service.tokenService.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;
    @Autowired
    private JwtService jwtService;

    @Autowired
    private AppUserService userService;
    @Autowired
    private TokenService tokenService;

    public AppUser getCurrentUser(HttpServletRequest request) {
        String token = tokenService.getJwtFromRequest(request);
        AppUser appUser = userService.getUserCurrent(jwtService, token);
        return appUser;
    }

    @GetMapping("classes")
    public ResponseEntity<List<FindAllClassByTeacher>> showAllClassesByTeacher(HttpServletRequest request) {
        AppUser appUser = getCurrentUser(request);
        List<FindAllClassByTeacher> list = teacherService.showAllClassByTeacher(appUser.getId());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("diary")
    public ResponseEntity<List<Diary>> showAllDiary() {
        List<Diary> diaryList = teacherService.findAll();
        return new ResponseEntity<>(diaryList, HttpStatus.OK);
    }

    @GetMapping("student")
    public ResponseEntity<List<FindByStudentByClass>> ShowAllStudentByClassAndTeacher(@RequestParam Long id, Long cd) {
        List<FindByStudentByClass> list = teacherService.showAllStudentByClass(id, cd);
//        System.out.println(cd);
//        System.out.println(id);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("diary/create")
    public ResponseEntity<Diary> createDiary(@RequestBody Diary diary) {
        return new ResponseEntity<>(teacherService.addDiaryByClass(diary), HttpStatus.OK);
    }

    @PostMapping("createTeacherClass")
    public ResponseEntity<Teacher_classes> createTeacher_Class(@RequestBody Teacher_classes teacherClasses) {

        return new ResponseEntity<>(teacherService.createTeacherClass(teacherClasses),HttpStatus.OK);
    }
    @GetMapping("teacherClass")
    public ResponseEntity<List<Teacher_classes>> showAllTC(){
        return new ResponseEntity<>(teacherService.showAll(),HttpStatus.OK);
    }

}
