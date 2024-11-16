package org.mvc.httpalloperation.Entite;

import org.mvc.httpalloperation.collage.students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepostriy extends JpaRepository<students, Integer> {
    students findByUserid(int userid); // Correct naming convention
}
