package co.edu.misiontic.sebas.students_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.misiontic.sebas.students_rest.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
