package co.edu.misiontic.sebas.students_rest.model.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDtoBidirectional {

    private Long id;
    private String name;
    private int fee;
    private int modules;

    List<StudentDtoBidirectional> studentDtoBidirectional = new ArrayList<>();

}
