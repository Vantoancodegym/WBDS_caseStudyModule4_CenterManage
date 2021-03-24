package casestudy_module4_centermanage.alcohol.controller;

import casestudy_module4_centermanage.alcohol.model.*;
import casestudy_module4_centermanage.alcohol.model.virtual.ClassesVirtual;
import casestudy_module4_centermanage.alcohol.service.appUerService.IAppUserService;
import casestudy_module4_centermanage.alcohol.service.appUerService.admin.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private IAdminService adminService;
    @Autowired
    private IAppUserService appUserService;
    @PostMapping("insertTeacher")
    public ResponseEntity<Teacher> insertTeacher(@RequestBody Teacher teacher){
        adminService.insertAppUser(teacher.getAppUser());
        return new ResponseEntity(adminService.insertTeacher(teacher),HttpStatus.OK);
    }
    @PostMapping("insertStudent")
    public ResponseEntity insertStudent(@RequestBody Student student){
        adminService.insertAppUser(student.getAppUser());
        return new ResponseEntity(adminService.insertStudent(student),HttpStatus.OK);
    }
    @PostMapping("insertWarden")
    public ResponseEntity<Warden> insertWarden(@RequestBody Warden warden){
        adminService.insertAppUser(warden.getAppUser());
        return new ResponseEntity(adminService.insertWarden(warden),HttpStatus.OK);
    }
    @PostMapping("insertClasses")
    public ResponseEntity<Classes> insertClasses(@RequestBody Classes classes){
        return new ResponseEntity<>(adminService.insertClasses(classes),HttpStatus.OK);
    }
    @GetMapping("countStudent")
    public ResponseEntity<Integer> countStudentByClass(){
        return new ResponseEntity(adminService.countStudentForTeacher(),HttpStatus.OK);
    }
    @GetMapping("getAvgScoreByClasses")
    public ResponseEntity<List<ClassesVirtual>> getAvgScoreByClasses(){
        return new ResponseEntity(adminService.getAvgScoreByClasses(),HttpStatus.OK);
    }
    @PostMapping("insertSubject")
    public ResponseEntity<Subject> insertSubject(@RequestBody Subject subject){
        return new ResponseEntity<>(adminService.insertSubject(subject),HttpStatus.OK);
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

}
