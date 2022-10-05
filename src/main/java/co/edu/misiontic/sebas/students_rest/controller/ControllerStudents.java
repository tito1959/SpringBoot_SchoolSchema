package co.edu.misiontic.sebas.students_rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.misiontic.sebas.students_rest.model.dto.CourseDtoBidirectional;
import co.edu.misiontic.sebas.students_rest.model.dto.StudentDto;
import co.edu.misiontic.sebas.students_rest.model.mapper.CourseMapper;
import co.edu.misiontic.sebas.students_rest.model.mapper.CoursesBidirectionalMapper;
import co.edu.misiontic.sebas.students_rest.model.mapper.StudentMapper;
import co.edu.misiontic.sebas.students_rest.repository.CourseRepository;
import co.edu.misiontic.sebas.students_rest.repository.StudentRepository;
import lombok.AllArgsConstructor;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ControllerStudents {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    CoursesBidirectionalMapper coursesBidirectionalMapper;

    @GetMapping("/test")
    public List<StudentDto> getStundetList() {
        var data = studentRepository.findAll();
        return studentMapper.studentsToStudentsDto(data);
        // return null;
    }

    @GetMapping("/test2")
    public List<CourseDtoBidirectional> getCourseList() {
        var data = courseRepository.findAll();
        return coursesBidirectionalMapper.coursesToCoursesDtoB(data);
        // return null;
    }
}
