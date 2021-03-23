package casestudy_module4_centermanage.alcohol.service.appUerService.admin;

import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.Teacher;
import casestudy_module4_centermanage.alcohol.model.Warden;

public interface IAdminService {
    Teacher insertTeacher(Teacher teacher);
    Student insertStudent(Student student);
    Warden insertWarden(Warden warden);

}
