package casestudy_module4_centermanage.alcohol.service.appUerService.admin;

import casestudy_module4_centermanage.alcohol.model.Classes;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.Teacher;
import casestudy_module4_centermanage.alcohol.model.Warden;
import casestudy_module4_centermanage.alcohol.repository.ClassesRepo;
import casestudy_module4_centermanage.alcohol.repository.StudentRepo;
import casestudy_module4_centermanage.alcohol.repository.TeacherRepo;
import casestudy_module4_centermanage.alcohol.repository.WardenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements IAdminService{
    @Autowired
    private ClassesRepo classesRepo;
    @Autowired
    private TeacherRepo teacherRepo;
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private WardenRepo wardenRepo;
    @Override
    public Teacher insertTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    @Override
    public Student insertStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Warden insertWarden(Warden warden) {
        return wardenRepo.save(warden);
    }

    @Override
    public Classes insertClasses(Classes classes) {
        return classesRepo.save(classes);
    }

}
