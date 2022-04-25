package two.nova.dashboard.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import two.nova.dashboard.dto.EmployeeDto;
import two.nova.dashboard.entity.Employee;
import two.nova.dashboard.repository.EmployeeRepository;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class EmployeeService {

    @Autowired
    private  EmployeeRepository repositoryss;

    public boolean createEmployee(EmployeeDto dto){
        if(existEmployeeByLogin(dto)) {
            Employee entity = new Employee();
                entity.setLogin(dto.getLogin());
                entity.setPassword(dto.getPassword());
                entity.setName(dto.getName());
                entity.setSurname(dto.getSurname());
                entity.setPatronymic(dto.getPatronymic());
                entity.setCreated(LocalDateTime.now());
                entity.setDateOfBirth(dto.getDateOfBirth());
            repositoryss.save(entity);
            return true;
        }
        return false;
    }

    private boolean existEmployeeByLogin(EmployeeDto dto){
        String login = String.valueOf(repositoryss.findByLogin(dto.getLogin()));
        return Objects.equals(login, "null");
    }


}
