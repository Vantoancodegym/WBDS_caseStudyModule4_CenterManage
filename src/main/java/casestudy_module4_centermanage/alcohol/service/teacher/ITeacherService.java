package casestudy_module4_centermanage.alcohol.service.teacher;

import casestudy_module4_centermanage.alcohol.model.*;
import casestudy_module4_centermanage.alcohol.service.IService;

import java.util.List;

public interface ITeacherService {

    Diary create(Diary diary);

    Diary edit(Diary diary);

    void delete(Long id);

    List<AppUser> showAllStudentByClass();
    List<Classes> showAllClass();
    List<Diary> findAll();

}
