package two.nova.dashboard.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import two.nova.dashboard.entity.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "security_role")
public class SecurityRole extends BaseEntity {

    private static final long serialVersionUID = -7735984447585784660L;

    @NotEmpty
    @Column(nullable = false, unique = true)
    private String title;

    @NotEmpty
    @Column(nullable = false, unique = true)
    private String code;

}
