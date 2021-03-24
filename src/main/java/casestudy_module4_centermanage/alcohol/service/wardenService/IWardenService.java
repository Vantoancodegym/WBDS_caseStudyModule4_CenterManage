package casestudy_module4_centermanage.alcohol.service.wardenService;

import casestudy_module4_centermanage.alcohol.model.Classes;
import casestudy_module4_centermanage.alcohol.model.Score;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.Warden;
import casestudy_module4_centermanage.alcohol.service.IService;
import org.aspectj.weaver.patterns.IScope;

public interface IWardenService extends IService<Score> {

    Student editStatusOfStudent(Student student);

    double avgInClass();
}

