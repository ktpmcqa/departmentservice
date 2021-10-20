package ktpm.cqa.deparmentservice.controller;

import ktpm.cqa.deparmentservice.entity.Department;
import ktpm.cqa.deparmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
@RequestMapping("/departments/")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.findKhoaById(departmentId);
    }

    @GetMapping("/")
    public String homePage() {
        return "Department service is running at port 8081";
    }
}
