package casestudy_module4_centermanage.alcohol.service.appUerService.admin;

import casestudy_module4_centermanage.alcohol.model.*;


public interface IAdminService {
    Teacher insertTeacher(Teacher teacher);
    Student insertStudent(Student student);
    Warden insertWarden(Warden warden);
    Classes insertClasses(Classes classes);
    int countStudentForTeacher();
    double getAvgScoreByClasses();
    Subject insertSubject(Subject subject);
}
