package two.nova.dashboard.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

@Getter
@Setter
public class EmployeeDto {

    @NotNull
    @JsonProperty("name")
    private String name;

    @NotNull
    @JsonProperty("surname")
    private String surname;

    @JsonProperty("patronymic")
    private String patronymic;

    @NotNull
    @JsonProperty("login")
    private String login;

    @NotNull
    @JsonProperty("password")
    private String password;

    @NotNull
    @JsonProperty("dateOfBirth")
    private LocalDate dateOfBirth;

}
