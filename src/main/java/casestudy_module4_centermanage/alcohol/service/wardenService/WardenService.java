package casestudy_module4_centermanage.alcohol.service.wardenService;


import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WardenService implements IWardenService {
    @Autowired
    private StudentRepo studentRepo;
    @Override
    public Student editStatusForStudent(Student student) {
        return studentRepo.save(student);
    }
}


