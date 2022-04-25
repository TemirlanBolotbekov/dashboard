package two.nova.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import two.nova.dashboard.entity.Employee;

@Repository
public interface SecurityRoleRepository extends JpaRepository<Employee, Long> {
}
