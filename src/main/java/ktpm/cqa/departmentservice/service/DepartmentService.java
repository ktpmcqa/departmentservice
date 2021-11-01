package ktpm.cqa.departmentservice.service;

import ktpm.cqa.departmentservice.entity.Department;
import ktpm.cqa.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository repository;
    /*Add department*/
    public Department saveDepartment(Department department) {
        log.info("Inside saveKhoa of Service!");
        return repository.saveAndFlush(department);
    }

    /*Find department by id*/
    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentId");
        return repository.findById(departmentId).get();
    }
}
