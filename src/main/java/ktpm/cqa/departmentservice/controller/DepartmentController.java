package ktpm.cqa.departmentservice.controller;

import ktpm.cqa.departmentservice.entity.Department;
import ktpm.cqa.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
@RequestMapping("/departments/")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    /*Add department controller*/
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    /*Find department by id controller*/
    @GetMapping("/{departmentID}")
    public Department findDepartmentById(@PathVariable("departmentID") Long departmentId) {
        return departmentService.findDepartmentById(departmentId);
    }

    @GetMapping("/")
    public String homePage() {
        return "Department service is running at port 8081";
    }
}
