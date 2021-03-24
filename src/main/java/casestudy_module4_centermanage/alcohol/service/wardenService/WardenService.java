package casestudy_module4_centermanage.alcohol.service.wardenService;

import casestudy_module4_centermanage.alcohol.model.Classes;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.Warden;
import casestudy_module4_centermanage.alcohol.repository.StudentRepo;
import casestudy_module4_centermanage.alcohol.repository.WardenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WardenService implements IWardenService {

    @Autowired
    private WardenRepo wardenRepo;

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Warden> findAll() {
        return wardenRepo.findAll();
    }

    @Override
    public Warden findById(Long id) {
        return wardenRepo.findById(id).get();
    }

    @Override
    public Warden save(Warden warden) {
        return wardenRepo.save(warden);
    }

    @Override
    public void delete(Long id) {
        wardenRepo.deleteById(id);
    }

    @Override
    public Iterable<Student> listFindByName(String name) {
        return wardenRepo.findAllByNameContaining(name);
    }

    @Override
    public Iterable<Student> findAllByClassess(Classes classes) {
        return wardenRepo.findAllByClassess(classes);
    }

    @Override
    public Student editStatusOfStudent(Student student) {
        return studentRepo.save(student);
    }
}
