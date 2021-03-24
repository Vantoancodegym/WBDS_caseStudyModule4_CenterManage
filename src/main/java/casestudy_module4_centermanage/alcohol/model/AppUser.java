package casestudy_module4_centermanage.alcohol.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String displayName;
    private String password;
    private String phone;
    private String address;
    private String avatar;
    @ManyToOne
    private AppRole appRole;
    @Transient
    private MultipartFile avatarMul;


    public AppUser() {
    }

    public AppUser(String username) {
        this.username = username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public MultipartFile getAvatarMul() {
        return avatarMul;
    }

    public void setAvatarMul(MultipartFile avatarMul) {
        this.avatarMul = avatarMul;
    }

    public AppRole getRole() {
        return appRole;
    }

    public void setRole(AppRole role) {
        this.appRole = role;
    }
}
