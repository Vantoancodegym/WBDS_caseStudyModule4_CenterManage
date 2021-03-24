package casestudy_module4_centermanage.alcohol.service.appUerService.admin;

import casestudy_module4_centermanage.alcohol.model.*;
import casestudy_module4_centermanage.alcohol.repository.*;
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
    @Autowired
    private ScoreRepo scoreRepo;
    @Autowired
    private SubjectRepo subjectRepo;
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

    @Override
    public int countStudentForTeacher() {
        return studentRepo.countStudentForTeacher();
    }

    @Override
    public double getAvgScoreByClasses() {
        return scoreRepo.getAvgScoreByClasses();
    }

    @Override
    public Subject insertSubject(Subject subject) {
        return subjectRepo.save(subject);
    }

}
