package casestudy_module4_centermanage.alcohol.service.wardenService;

import casestudy_module4_centermanage.alcohol.model.Classes;
import casestudy_module4_centermanage.alcohol.model.Score;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.Warden;
import casestudy_module4_centermanage.alcohol.repository.ScoreRepo;
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
    private ScoreRepo scoreRepo;

    @Autowired
    private StudentRepo studentRepo;


    @Override
    public List<Score> findAll() {
        return scoreRepo.findAll();
    }

    @Override
    public Score findById(Long id) {
        return scoreRepo.findById(id).get();
    }

    @Override
    public Score save(Score score) {
        return scoreRepo.save(score);
    }

    @Override
    public void delete(Long id) {
        scoreRepo.deleteById(id);
    }

    @Override
    public Student editStatusOfStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public double avgInClass() {
        return wardenRepo.avgClasses();
    }

}
