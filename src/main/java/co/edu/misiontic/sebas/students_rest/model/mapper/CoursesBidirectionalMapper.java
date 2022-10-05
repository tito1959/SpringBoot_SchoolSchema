package co.edu.misiontic.sebas.students_rest.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import co.edu.misiontic.sebas.students_rest.model.Course;
import co.edu.misiontic.sebas.students_rest.model.Student;
import co.edu.misiontic.sebas.students_rest.model.dto.CourseDtoBidirectional;
import co.edu.misiontic.sebas.students_rest.model.dto.StudentDtoBidirectional;

@Mapper(componentModel = "spring")
public interface CoursesBidirectionalMapper {

    StudentDtoBidirectional studentToStudentDtoB(Student studen);

    List<CourseDtoBidirectional> coursesToCoursesDtoB(List<Course> courses);

    @Mapping(target = "studentDtoBidirectional", source = "students")
    CourseDtoBidirectional courseToCourseDtoB(Course course);

}
