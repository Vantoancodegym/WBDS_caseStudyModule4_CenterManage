package casestudy_module4_centermanage.alcohol.service.appUerService.admin;
import casestudy_module4_centermanage.alcohol.model.*;
import casestudy_module4_centermanage.alcohol.model.virtual.ClassesVirtual;
import casestudy_module4_centermanage.alcohol.model.virtual.StudentAmountByClass;
import casestudy_module4_centermanage.alcohol.model.virtual.TeacherTop;
import casestudy_module4_centermanage.alcohol.model.virtual.UserAppVirtual;

import java.util.List;


public interface IAdminService {
    Teacher insertTeacher(Teacher teacher);
    Student insertStudent(Student student);
    Warden insertWarden(Warden warden);
    Classes insertClasses(Classes classes);
    List<StudentAmountByClass> countStudentForClass();
    List<ClassesVirtual> getAvgScoreByClasses();
    Subject insertSubject(Subject subject);
    int countSubject();
    int countEvent();
    int countTeacher();
    List<Subject> findAllSubject();
    List<Event> findAllEvent();
    List<Teacher> findAllTeacher();
    List<CustomerRegister> findAllCustomerRegister();
    CustomerRegister insertCustomerRegister(CustomerRegister customerRegister);
    Event insertEvent(Event event);
    LiveChat insertLiveChat(LiveChat liveChat);
    List<LiveChat> findAllLiveChat();
    List<UserAppVirtual> getTop5StudentHaveBigScore();
    AppUser insertAppUser(AppUser appUser);
    List<TeacherTop> getTop3Teacher();
    int countStudentAllCenter();
}
