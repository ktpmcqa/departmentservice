package ktpm.cqa.deparmentservice.service;

import ktpm.cqa.deparmentservice.entity.Department;
import ktpm.cqa.deparmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveKhoa of Service!");
        return repository.saveAndFlush(department);
    }

    public Department findKhoaById(Long departmentId) {
        log.info("Inside findDepartmentId");
        return repository.findById(departmentId).get();
    }
}
