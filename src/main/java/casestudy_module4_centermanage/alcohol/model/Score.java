package casestudy_module4_centermanage.alcohol.model;

import javax.persistence.*;

@Entity
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double score_lab; //diem thuc hanh
    private double score_theory; //diem ly thuyet
    private double ccore_attitude; //diem thai do
    @ManyToOne
    private Student student;
    @ManyToOne
    private Subject subject;

    public Score() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getScore_lab() {
        return score_lab;
    }

    public void setScore_lab(double score_lab) {
        this.score_lab = score_lab;
    }

    public double getScore_theory() {
        return score_theory;
    }

    public void setScore_theory(double score_theory) {
        this.score_theory = score_theory;
    }

    public double getCcore_attitude() {
        return ccore_attitude;
    }

    public void setCcore_attitude(double ccore_attitude) {
        this.ccore_attitude = ccore_attitude;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
