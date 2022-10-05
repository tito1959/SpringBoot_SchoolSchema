package co.edu.misiontic.sebas.students_rest.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDtoBidirectional {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
