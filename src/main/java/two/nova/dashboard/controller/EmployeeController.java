package two.nova.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import two.nova.dashboard.dto.EmployeeDto;
import two.nova.dashboard.services.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private final EmployeeService service;

    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/create")
    public boolean createEmployee(@RequestBody EmployeeDto dto){
        return service.createEmployee(dto);
    }

    @GetMapping("/ping")
    public String pong(){
        return "pong";
    }
}
