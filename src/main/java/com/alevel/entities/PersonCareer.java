package com.alevel.entities;

import javax.persistence.*;

@Entity
@Table
public class PersonCareer {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(targetEntity = Person.class)
    @JoinColumn(name = "person", referencedColumnName = "id")
    private Person person;

    @ManyToOne(targetEntity = Career.class)
    @JoinColumn(name = "career", referencedColumnName = "id")
    private Career career;

    public PersonCareer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }
}
