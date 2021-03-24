package casestudy_module4_centermanage.alcohol.service.wardenService;

import casestudy_module4_centermanage.alcohol.model.Classes;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.Warden;
import casestudy_module4_centermanage.alcohol.service.IService;
import org.aspectj.weaver.patterns.IScope;

public interface IWardenService extends IService<Warden> {
    Iterable<Student> listFindByName(String name);

    Iterable<Student> findAllByClassess(Classes classes);
    Student editStatusOfStudent(Student student);
}
