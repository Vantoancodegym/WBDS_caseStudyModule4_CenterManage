package casestudy_module4_centermanage.alcohol.service.teacher;

import casestudy_module4_centermanage.alcohol.model.*;
import casestudy_module4_centermanage.alcohol.model.virtual.FindAllClassByTeacher;
import casestudy_module4_centermanage.alcohol.model.virtual.FindByStudentByClass;
import casestudy_module4_centermanage.alcohol.service.IService;

import java.util.List;

public interface ITeacherService {

    Diary create(Diary diary);

    Diary edit(Diary diary);

    void delete(Long id);
    List<FindByStudentByClass> showAllStudentByClass(Long t_id, Long C_id);
    List<FindAllClassByTeacher> showAllClassByTeacher (Long id);
    List<Diary> findAll();

}
