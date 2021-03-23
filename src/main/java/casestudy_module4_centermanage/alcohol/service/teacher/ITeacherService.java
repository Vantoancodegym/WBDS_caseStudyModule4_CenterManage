package casestudy_module4_centermanage.alcohol.service.teacher;

import casestudy_module4_centermanage.alcohol.model.Classes;
import casestudy_module4_centermanage.alcohol.model.Diary;
import casestudy_module4_centermanage.alcohol.model.Student;
import casestudy_module4_centermanage.alcohol.model.Teacher;
import casestudy_module4_centermanage.alcohol.service.IService;

import java.util.List;

public interface ITeacherService {
    Diary create(Diary diary);
    Diary edit(Diary diary);
    void delete(Long id);

}
