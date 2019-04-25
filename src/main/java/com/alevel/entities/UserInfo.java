package com.alevel.entities;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column(name = "FIRST_NAME", nullable = true, insertable = true, updatable = true, length = 200)
    private String firstName;
    @Column(name = "LAST_NAME", nullable = true, insertable = true, updatable = true, length = 200)
    private String lastName;

    @Column(name = "GENDER", nullable = true, insertable = true, updatable = true, length = 6)
    private String gender;
    @Column(name = "BIRTHDAY")
    private Date birthday;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "CITY", nullable = true, insertable = true, updatable = true, length = 200)
    private String city;

    @Column(name = "HASHPASS")
    private String hashPass;
    @Column(name = "IMAGE")
    private String image;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "userInfo",
            targetEntity = Review.class)
    private List<Review> reviews;

    public UserInfo() {
    }

    public UserInfo(String firstName, String lastName, String gender, Date birthday,
                    String email, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHashPass() {
        return hashPass;
    }

    public void setHashPass(String hashPass) {
        this.hashPass = hashPass;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}