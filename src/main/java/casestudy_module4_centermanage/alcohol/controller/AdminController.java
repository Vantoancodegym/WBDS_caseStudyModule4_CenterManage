package casestudy_module4_centermanage.alcohol.controller;

import casestudy_module4_centermanage.alcohol.model.*;
import casestudy_module4_centermanage.alcohol.service.appUerService.IAppUserService;
import casestudy_module4_centermanage.alcohol.service.appUerService.admin.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
//    @PostMapping("insertWardent")
//    public ResponseEntity<Warden> insertWarden(@RequestBody Warden warden){
//        return new ResponseEntity(adminService.insertWarden(warden),HttpStatus.OK);
//    }
//    @PostMapping("insertClasses")
//    public ResponseEntity<Classes> insertClasses(@RequestBody Classes classes){
//        return new ResponseEntity<>(adminService.insertClasses(classes),HttpStatus.OK);
//    }
}
