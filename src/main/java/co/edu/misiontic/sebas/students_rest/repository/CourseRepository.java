package co.edu.misiontic.sebas.students_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.misiontic.sebas.students_rest.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
