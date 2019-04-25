package com.alevel.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String firstName;


    @Column
    private String lastName;

    @Column
    private Date birthday;

    @Column
    private String city;

    @Column
    private String image;

    @OneToMany(cascade = CascadeType.REFRESH,
            fetch = FetchType.LAZY,
            mappedBy = "person")
    private List<Casts> castList;

    @OneToMany(cascade = CascadeType.REFRESH,
            fetch = FetchType.LAZY,
            mappedBy = "person")
    private List<PersonCareer> personCareerList;

    @OneToMany(cascade = CascadeType.REFRESH,
            fetch = FetchType.LAZY,
            mappedBy = "person")
    private List<PersonsAwards> personsAwardsList;

    public Person() {
    }

    public Person(String firstName, String lastName,
                  Date birthday, String city, String image) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.city = city;
        this.image = image;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Casts> getCastList() {
        return castList;
    }

    public void setCastList(List<Casts> castList) {
        this.castList = castList;
    }

    public List<PersonCareer> getPersonCareerList() {
        return personCareerList;
    }

    public void setPersonCareerList(List<PersonCareer> personCareerList) {
        this.personCareerList = personCareerList;
    }

    public List<PersonsAwards> getPersonsAwardsList() {
        return personsAwardsList;
    }

    public void setPersonsAwardsList(List<PersonsAwards> personsAwardsList) {
        this.personsAwardsList = personsAwardsList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", city='" + city + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
