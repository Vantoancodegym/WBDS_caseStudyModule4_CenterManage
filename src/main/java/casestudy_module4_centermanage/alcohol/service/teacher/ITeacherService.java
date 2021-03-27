package casestudy_module4_centermanage.alcohol.service.teacher;

import casestudy_module4_centermanage.alcohol.model.*;
import casestudy_module4_centermanage.alcohol.model.virtual.FindAllClassByTeacher;
import casestudy_module4_centermanage.alcohol.model.virtual.FindByStudentByClass;

import java.util.List;

public interface ITeacherService {
    List<FindByStudentByClass> showAllStudentByClass(Long t_id, Long C_id);
    List<FindAllClassByTeacher> showAllClassByTeacher (Long id);
    List<Diary> findAll();
    Diary addDiaryByClass(Diary diary);
    Teacher_classes createTeacherClass(Teacher_classes teacher_Classes);
    List<Teacher_classes> showAll();

}
