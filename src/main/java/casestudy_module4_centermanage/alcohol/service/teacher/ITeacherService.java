package casestudy_module4_centermanage.alcohol.service.teacher;

import casestudy_module4_centermanage.alcohol.model.*;
import casestudy_module4_centermanage.alcohol.service.IService;

import java.util.List;

public interface ITeacherService {

    Diary create(Diary diary);

    Diary edit(Diary diary);

    void delete(Long id);
<<<<<<< HEAD

    List<Student> showAllStudentByClass();
=======
    List<AppUser> showAllStudentByClass();
    List<Classes> showAllClass();
>>>>>>> 207defb7ec42e7fe8728767df8bdd0f680bde227

}
