package co.edu.misiontic.sebas.students_rest.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import co.edu.misiontic.sebas.students_rest.model.Student;
import co.edu.misiontic.sebas.students_rest.model.dto.StudentDto;

@Mapper(componentModel = "spring", uses = CourseMapper.class)
public interface StudentMapper {

    StudentDto studentToStudentDto(Student student);

    List<StudentDto> studentsToStudentsDto(List<Student> students);

}
