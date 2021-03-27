package casestudy_module4_centermanage.alcohol.service.teacher;

import casestudy_module4_centermanage.alcohol.model.*;
import casestudy_module4_centermanage.alcohol.model.virtual.FindAllClassByTeacher;
import casestudy_module4_centermanage.alcohol.model.virtual.FindByStudentByClass;
import casestudy_module4_centermanage.alcohol.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  TeacherService implements ITeacherService{
    @Autowired
    TeacherClassRepo teacherClassRepo;
    @Autowired
    private TeacherRepo teacherRepo;

    @Autowired
    private DiaryRepo diaryRepo;



    @Override
    public List<FindByStudentByClass> showAllStudentByClass(Long t_id, Long c_id) {
        return teacherRepo.findAllStudentByClass(t_id,c_id);
    }

    @Override
    public List<FindAllClassByTeacher> showAllClassByTeacher(Long id) {
        return teacherRepo.findAllClassByTeacher(id);
    }

    @Override
    public List<Diary> findAll() {
        return diaryRepo.findAll();
    }

    @Override
    public Diary addDiaryByClass(Diary diary) {
       return diaryRepo.save(diary);
    }

    @Override
    public Teacher_classes createTeacherClass(Teacher_classes teacher_Classes) {
        return  teacherClassRepo.save(teacher_Classes);
    }

    @Override
    public List<Teacher_classes> showAll() {
        return teacherClassRepo.findAll();
    }

}
