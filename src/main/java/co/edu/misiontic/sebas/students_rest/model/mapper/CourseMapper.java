package co.edu.misiontic.sebas.students_rest.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import co.edu.misiontic.sebas.students_rest.model.Course;
import co.edu.misiontic.sebas.students_rest.model.dto.CourseDto;

@Mapper(componentModel = "spring", uses = StudentMapper.class)
public interface CourseMapper {

    List<CourseDto> coursesToCoursesDto(List<Course> courses);

}
