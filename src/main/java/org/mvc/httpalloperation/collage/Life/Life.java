package org.mvc.httpalloperation.collage.Life;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.mvc.httpalloperation.collage.students;

@Entity
public class Life {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String hobby;
    private String die;

    @OneToOne(mappedBy = "matter")
    @JsonBackReference
    private students student;

    public students getStudent() {
        return student;
    }

    public void setStudent(students student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getDie() {
        return die;
    }

    public void setDie(String die) {
        this.die = die;
    }
}
