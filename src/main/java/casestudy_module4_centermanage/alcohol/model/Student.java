package casestudy_module4_centermanage.alcohol.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double tuition;
    @OneToOne
    private AppUser appUser;
    @ManyToOne
    private Status status;
    @ManyToOne
    private Classes classes;

    public Student() {
    }


    public Student(Long id, Double tuition, AppUser appUser, Status status, Classes classes) {
        this.id = id;
        this.tuition = tuition;
        this.appUser = appUser;
        this.status = status;
        this.classes = classes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTuition() {
        return tuition;
    }

    public void setTuition(Double tuition) {
        this.tuition = tuition;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}
