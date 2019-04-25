package com.alevel.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Award {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @OneToMany(cascade = CascadeType.REFRESH,
            fetch = FetchType.LAZY,
            mappedBy = "award")
    private List<PersonsAwards> personsAwardsList;

    public Award() {
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

    public List<PersonsAwards> getPersonsAwardsList() {
        return personsAwardsList;
    }

    public void setPersonsAwardsList(List<PersonsAwards> personsAwardsList) {
        this.personsAwardsList = personsAwardsList;
    }
}
