package casestudy_module4_centermanage.alcohol.controller;

import casestudy_module4_centermanage.alcohol.model.Classes;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.Teacher;
import casestudy_module4_centermanage.alcohol.model.Warden;
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
    @PostMapping("insertTeacher")
    public ResponseEntity<Teacher> insertTeacher(@RequestBody Teacher teacher){
        return new ResponseEntity(adminService.insertTeacher(teacher),HttpStatus.OK);
    }
//    @PostMapping("insertStudent")
//    public ResponseEntity insertStudent(@RequestBody Student student){
//        return new ResponseEntity(adminService.insertStudent(student),HttpStatus.OK);
//    }
//    @PostMapping("insertWardent")
//    public ResponseEntity<Warden> insertWarden(@RequestBody Warden warden){
//        return new ResponseEntity(adminService.insertWarden(warden),HttpStatus.OK);
//    }
//    @PostMapping("insertClasses")
//    public ResponseEntity<Classes> insertClasses(@RequestBody Classes classes){
//        return new ResponseEntity<>(adminService.insertClasses(classes),HttpStatus.OK);
//    }
}
