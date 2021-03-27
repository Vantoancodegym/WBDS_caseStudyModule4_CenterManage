package casestudy_module4_centermanage.alcohol.model;

import casestudy_module4_centermanage.alcohol.model.Classes;
import casestudy_module4_centermanage.alcohol.model.Teacher;

import javax.persistence.*;

@Entity
public class Teacher_classes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Teacher teacher;
    @OneToOne
    private Classes classes;

    public Teacher_classes() {
    }

    public Teacher_classes(Teacher teacher, Classes classes) {
        this.teacher = teacher;
        this.classes = classes;
    }

    public Teacher_classes(Long id, Teacher teacher, Classes classes) {
        this.id = id;
        this.teacher = teacher;
        this.classes = classes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}
