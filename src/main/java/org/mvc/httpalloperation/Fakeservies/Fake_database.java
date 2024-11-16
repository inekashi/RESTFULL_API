package org.mvc.httpalloperation.Fakeservies;

import org.mvc.httpalloperation.Entite.UserRepostriy;
import org.mvc.httpalloperation.collage.students;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;




public class Fake_database {

    @Autowired
    public UserRepostriy userRepostiry;

    // Fetch all students
    public List<students> getall() {
        return (List<students>) userRepostiry.findAll(); // Calls the new method to fetch all students
    }

    // Get a student by ID
    public students getbyid(int id) {
        return userRepostiry.findByUserid(id); // This calls the method to fetch by ID
    }

    // Add a student
    public students addone(students s) {
        userRepostiry.save(s); // Saving student via repository
        return s; // Return the student added
    }

    // Delete a student by ID
    public void deleteone(int id) {
        userRepostiry.deleteById(id); // Delete student by ID from the repository
    }

    // Update a student by ID
    public void updateone(students s, int id) {
        students existingStudent = userRepostiry.findByUserid(id); // Find student by ID
        if (existingStudent != null) {
            existingStudent.setName(s.getName());
            existingStudent.setCourse(s.getCourse());
            userRepostiry.save(existingStudent); // Save the updated student back to the database
        }
    }
}
