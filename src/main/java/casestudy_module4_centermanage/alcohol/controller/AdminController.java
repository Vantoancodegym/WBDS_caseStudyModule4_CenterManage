package casestudy_module4_centermanage.alcohol.controller;

import casestudy_module4_centermanage.alcohol.model.*;
import casestudy_module4_centermanage.alcohol.model.virtual.ClassesVirtual;
import casestudy_module4_centermanage.alcohol.model.virtual.StudentAmountByClass;
import casestudy_module4_centermanage.alcohol.model.virtual.TeacherTop;
import casestudy_module4_centermanage.alcohol.model.virtual.UserAppVirtual;
import casestudy_module4_centermanage.alcohol.service.appUerService.AppUser.IAppUserService;
import casestudy_module4_centermanage.alcohol.service.appUerService.admin.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private IAdminService adminService;
    @Autowired
    private IAppUserService appUserService;
    @Autowired
    private Environment environment;

    private AppUser createAppUser(AppUser appUser) {
//        MultipartFile multipartFile = appUser.getAvatarMul();
//        String fileName = multipartFile.getOriginalFilename();
//        String fileUpload = environment.getProperty("upload.path").toString();
//        try {
//            FileCopyUtils.copy(appUser.getAvatar().getBytes(),new File(fileUpload+fileName));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        appUser.setAvatar(fileName);
        return appUserService.createAppUser(appUser);
    }
    public Subject createSubject(Subject subject){
        MultipartFile multipartFile = subject.getImageMul();
        String fileName = multipartFile.getOriginalFilename();
        String fileUpload = environment.getProperty("upload.path").toString();
        try {
            FileCopyUtils.copy(subject.getImage().getBytes(),new File(fileUpload+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        subject.setImage(fileName);
        return adminService.insertSubject(subject);
    }
    @PostMapping("insertTeacher")
    public ResponseEntity<Teacher> insertTeacher(@RequestBody Teacher teacher){
        AppUser appUser = createAppUser(teacher.getAppUser());
        teacher.setAppUser(appUser);
        return new ResponseEntity(adminService.insertTeacher(teacher),HttpStatus.OK);
    }
    @PostMapping("insertStudent")
    public ResponseEntity insertStudent(@RequestBody Student student){
        AppUser appUser = createAppUser(student.getAppUser());
        student.setAppUser(appUser);
        return new ResponseEntity(adminService.insertStudent(student),HttpStatus.OK);
    }
    @PostMapping("insertWarden")
    public ResponseEntity<Warden> insertWarden(@RequestBody Warden warden){
        AppUser appUser = createAppUser(warden.getAppUser());
        warden.setAppUser(appUser);
        return new ResponseEntity(adminService.insertWarden(warden),HttpStatus.OK);
    }
    @PostMapping("insertClasses")
    public ResponseEntity<Classes> insertClasses(@RequestBody Classes classes){
        return new ResponseEntity<>(adminService.insertClasses(classes),HttpStatus.OK);
    }
    @GetMapping("countStudent")
    public ResponseEntity<List<StudentAmountByClass>> countStudentByClass(){
        return new ResponseEntity(adminService.countStudentForClass(),HttpStatus.OK);
    }
    @GetMapping("getAvgScoreByClasses")
    public ResponseEntity<List<ClassesVirtual>> getAvgScoreByClasses(){
        return new ResponseEntity(adminService.getAvgScoreByClasses(),HttpStatus.OK);
    }
    @PostMapping("insertSubject")
    public ResponseEntity<Subject> insertSubject(@RequestBody Subject subject){
        return new ResponseEntity<>(createSubject(subject),HttpStatus.OK);
    }
    @PostMapping("insertAppUser")
    public ResponseEntity<AppUser> insertAppUser(@RequestBody AppUser appUser){
        return new ResponseEntity<>(createAppUser(appUser),HttpStatus.OK);
    }

    @GetMapping("countSubject")
    public ResponseEntity<Integer> countSubject(){
        return new ResponseEntity<>(adminService.countSubject(),HttpStatus.OK);
    }
    @GetMapping("countEvent")
    public ResponseEntity<Integer> countEvent(){
        return new ResponseEntity<>(adminService.countEvent(),HttpStatus.OK);
    }
    @GetMapping("countTeacher")
    public ResponseEntity<Integer> countTeacher(){
        return new ResponseEntity<>(adminService.countTeacher(),HttpStatus.OK);
    }
    @GetMapping("findAllSubject")
    public ResponseEntity<List<Subject>> findAllSubject(){
        return new ResponseEntity<>(adminService.findAllSubject(),HttpStatus.OK);
    }
    @GetMapping("findAllEvent")
    public ResponseEntity<List<Event>> findAllEvent(){
        return new ResponseEntity<>(adminService.findAllEvent(),HttpStatus.OK);
    }
    @GetMapping("findAllTeacher")
    public ResponseEntity<List<Teacher>> findAllTeacher(){
        return new ResponseEntity<>(adminService.findAllTeacher(),HttpStatus.OK);
    }
    @GetMapping("findAllCustomerRegister")
    public ResponseEntity<List<CustomerRegister>> findAllCustomerRegister(){
        return new ResponseEntity<>(adminService.findAllCustomerRegister(),HttpStatus.OK);
    }
    @GetMapping("findAllLiveChat")
    public ResponseEntity<List<LiveChat>> findAllLiveChat(){
        return new ResponseEntity<>(adminService.findAllLiveChat(),HttpStatus.OK);
    }
    @PostMapping("insertCustomerRegister")
    public ResponseEntity<CustomerRegister> insertCustomerRegister(@RequestBody CustomerRegister customerRegister){
        return new ResponseEntity(adminService.insertCustomerRegister(customerRegister),HttpStatus.OK);
    }
    @PostMapping("insertEvent")
    public ResponseEntity<Event> insertEvent(@RequestBody Event e){
        return new ResponseEntity(adminService.insertEvent(e),HttpStatus.OK);
    }
    @PostMapping("insertLiveChat")
    public ResponseEntity<LiveChat> insertEvent(@RequestBody LiveChat e){
        return new ResponseEntity(adminService.insertLiveChat(e),HttpStatus.OK);
    }
    @GetMapping("getTop5StudentHaveBigScore")
    public ResponseEntity<List<UserAppVirtual>> getTop5StudentHaveBigScore(){
        return new ResponseEntity<>(adminService.getTop5StudentHaveBigScore(),HttpStatus.OK);
    }
    @GetMapping("getTop3Teacher")
    public ResponseEntity<List<TeacherTop>> getTop3Teacher(){
        return new ResponseEntity<>(adminService.getTop3Teacher(),HttpStatus.OK);
    }
    @GetMapping("countStudentAllCenter")
    public ResponseEntity<Integer> countStudentAllCenter(){
        return new ResponseEntity<>(adminService.countStudentAllCenter(),HttpStatus.OK);
    }
    @GetMapping("getTop3Subject")
    public ResponseEntity<List<Subject>> getTop3Subject(){
        return new ResponseEntity<>(adminService.getTop3Subject(),HttpStatus.OK);
    }
    @GetMapping("getAllUser")
    public ResponseEntity<List<AppUser>> getAllUser(){
        return new ResponseEntity<>(appUserService.getAllUser(),HttpStatus.OK);
    }

}
