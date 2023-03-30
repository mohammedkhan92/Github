package com.dailycodebuffer.Springboot.tutorial.tutorial.controller;

import com.dailycodebuffer.Springboot.tutorial.tutorial.entity.Department;
import com.dailycodebuffer.Springboot.tutorial.tutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);

    }
@GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
    return departmentService.fetchDepartmentList();
    }

}
