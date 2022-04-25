package two.nova.dashboard.dto;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

@Getter
@Setter
public class EmployeeDto {

    @NotNull
    private String name;

    @NotNull
    private String surname;

    private String patronymic;

    @NotNull
    private String login;

    @NotNull
    private String password;

    @NotNull
    private LocalDate dateOfBirth;

}
