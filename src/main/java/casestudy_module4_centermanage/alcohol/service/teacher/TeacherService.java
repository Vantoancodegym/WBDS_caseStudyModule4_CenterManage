package casestudy_module4_centermanage.alcohol.service.teacher;

import casestudy_module4_centermanage.alcohol.model.*;
import casestudy_module4_centermanage.alcohol.repository.ClassesRepo;
import casestudy_module4_centermanage.alcohol.repository.DiaryRepo;
import casestudy_module4_centermanage.alcohol.repository.StudentRepo;
import casestudy_module4_centermanage.alcohol.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService implements ITeacherService{
    @Autowired
    private TeacherRepo teacherRepo;
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

    @Override
    public List<AppUser> showAllStudentByClass() {
        return teacherRepo.findAllStudentByClass();
    }

    @Override
    public List<Classes> showAllClass() {
        return teacherRepo.findAllByAllClass();
    }
}
