package casestudy_module4_centermanage.alcohol.service.appUerService.admin;

import casestudy_module4_centermanage.alcohol.model.*;
import casestudy_module4_centermanage.alcohol.repository.*;
import javafx.event.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdminService implements IAdminService{
    @Autowired
    private LiveChatRepo liveChatRepo;
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
    @Autowired
    private EventRepo eventRepo;
    @Autowired
    private CustomerRegisterRepo customerRegisterRepo;
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

    @Override
    public int countSubject() {
        return subjectRepo.countSubject();
    }

    @Override
    public int countEvent() {
        return eventRepo.countEvent();
    }

    @Override
    public int countTeacher() {
        return teacherRepo.countTeacher();
    }

    @Override
    public List<Subject> findAllSubject() {
        return subjectRepo.findAll();
    }

    @Override
    public List<Event> findAllEvent() {
        return eventRepo.findAll();
    }

    @Override
    public List<Teacher> findAllTeacher() {
        return teacherRepo.findAll();
    }

    @Override
    public List<CustomerRegister> findAllCustomerRegister() {
        return customerRegisterRepo.findAll();
    }

    @Override
    public CustomerRegister insertCustomerRegister(CustomerRegister customerRegister) {
        return customerRegisterRepo.save(customerRegister);
    }

    @Override
    public Event insertEvent(Event event) {
        return eventRepo.save(event);
    }

    @Override
    public LiveChat insertLiveChat(LiveChat liveChat) {
        return liveChatRepo.save(liveChat);
    }

    @Override
    public List<LiveChat> findAllLiveChat() {
        return liveChatRepo.findAll();
    }


}
