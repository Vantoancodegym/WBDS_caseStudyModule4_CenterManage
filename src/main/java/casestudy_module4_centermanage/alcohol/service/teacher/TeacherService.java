package casestudy_module4_centermanage.alcohol.service.teacher;

import casestudy_module4_centermanage.alcohol.model.Diary;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.Teacher;
import casestudy_module4_centermanage.alcohol.repository.ClassesRepo;
import casestudy_module4_centermanage.alcohol.repository.DiaryRepo;
import casestudy_module4_centermanage.alcohol.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService implements ITeacherService{
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private ClassesRepo classesRepo;

    @Autowired
    private DiaryRepo diaryRepo;

    @Override
    public Diary create(Diary diary) {
        return diaryRepo.save(diary);
    }

    @Override
    public Diary edit(Diary diary) {
        return diaryRepo.save(diary);
    }

    @Override
    public void delete(Long id) {
        diaryRepo.deleteById(id);
    }
}
