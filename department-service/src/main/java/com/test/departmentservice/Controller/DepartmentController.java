package com.test.departmentservice.Controller;

import com.test.departmentservice.Entity.DepartmentEntity;
import com.test.departmentservice.Service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public DepartmentEntity saveDepartment(@RequestBody DepartmentEntity obj){
        log.info("Inside saveDepartment method ");
        return departmentService.saveDepartment(obj);
    }

    @GetMapping("/{id}")
    public DepartmentEntity getDepartment(@PathVariable("id") Long departmentId){
        log.info("Inside getDepartment method ");
        return departmentService.getDepartmentByID(departmentId);
    }

}
