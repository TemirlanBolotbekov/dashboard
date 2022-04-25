package two.nova.dashboard.repository;


import two.nova.dashboard.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, Long>{

    Employee findByLogin(String login);

    Employee findByName(String name);
}
