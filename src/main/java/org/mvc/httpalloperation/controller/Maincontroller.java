package org.mvc.httpalloperation.controller;

import org.mvc.httpalloperation.Entite.UserRepostriy;
import org.mvc.httpalloperation.collage.students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class Maincontroller {

    @Autowired
    private UserRepostriy userRepostriy;

    // Fetch all students
    @GetMapping
    public List<students> getAllStudents() {
        return userRepostriy.findAll();
    }

    // Fetch student by userid
    @GetMapping("/{userid}")
    public students getStudentByUserid(@PathVariable int userid) {
        return userRepostriy.findByUserid(userid);
    }

    // Add a new student
    @PostMapping
    public students addStudent(@RequestBody students student) {
        return userRepostriy.save(student);
    }
    @DeleteMapping("/{id}")
    public void deleteone(@PathVariable("id")int id){
        userRepostriy.deleteById(id);
    }



}
