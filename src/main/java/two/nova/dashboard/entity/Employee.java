package two.nova.dashboard.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import two.nova.dashboard.entity.base.BaseEntity;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Employee extends BaseEntity {

    private static final long serialVersionUID = 7175093576481406189L;

    @NotEmpty
    private String name;

    @NotEmpty
    private String surname;

    private String patronymic;

    @NotEmpty
    private String login;

    @NotEmpty
    private String password;

    @NotNull
    private LocalDate dateOfBirth;


}
