package casestudy_module4_centermanage.alcohol.model;

import javax.persistence.*;

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



}
