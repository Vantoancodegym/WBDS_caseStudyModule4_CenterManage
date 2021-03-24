package casestudy_module4_centermanage.alcohol.service.appUerService.admin;

import casestudy_module4_centermanage.alcohol.model.*;
import casestudy_module4_centermanage.alcohol.repository.CustomerRegisterRepo;

import java.util.List;


public interface IAdminService {
    Teacher insertTeacher(Teacher teacher);
    Student insertStudent(Student student);
    Warden insertWarden(Warden warden);
    Classes insertClasses(Classes classes);
    int countStudentForTeacher();
    double getAvgScoreByClasses();
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
    List<Student> getTop5StudentHaveBigScore();
}
