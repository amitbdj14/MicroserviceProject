package com.test.departmentservice.Service;

import com.test.departmentservice.Entity.DepartmentEntity;
import com.test.departmentservice.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public DepartmentEntity saveDepartment(DepartmentEntity obj) {
        return departmentRepository.save(obj);
    }

    public DepartmentEntity getDepartmentByID(Long departmentId) {
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
