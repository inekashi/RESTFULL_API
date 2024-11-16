package org.mvc.httpalloperation.collage;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.mvc.httpalloperation.collage.Life.Life;

@Entity
public class students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String course;
    private int userid;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private Life matter;

    public Life getMatter() {
        return matter;
    }

    public void setMatter(Life matter) {
        this.matter = matter;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
