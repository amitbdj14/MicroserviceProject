package com.test.departmentservice.Repository;

import com.test.departmentservice.Entity.DepartmentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<DepartmentEntity, Long> {
    DepartmentEntity findByDepartmentId(Long departmentId);
}
