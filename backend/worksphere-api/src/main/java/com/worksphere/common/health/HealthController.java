package com.worksphere.common.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class HealthController {

    @GetMapping("/health")
    public HealthResponse checkHealth() {

        return new HealthResponse(
                "UP and Running",
                "WorkSphere",
                Instant.now()
        );
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmp(){
        List<Employee> list  = new ArrayList<>();
        list.add(new Employee(1, "shital"));
        list.add(new Employee(2, "prakash"));
        list.add(new Employee(3, "das"));
        return list;
    }

    class Employee {
        int id;
        String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
