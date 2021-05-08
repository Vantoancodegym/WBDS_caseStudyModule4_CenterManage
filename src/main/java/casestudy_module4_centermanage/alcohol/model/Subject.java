package casestudy_module4_centermanage.alcohol.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String image;
    @Transient
    private MultipartFile imageMul;

    public Subject() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public MultipartFile getImageMul() {
        return imageMul;
    }

    public void setImageMul(MultipartFile imageMul) {
        this.imageMul = imageMul;
    }
}
