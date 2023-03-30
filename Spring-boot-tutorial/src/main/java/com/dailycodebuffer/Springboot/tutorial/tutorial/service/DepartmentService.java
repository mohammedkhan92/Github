package com.dailycodebuffer.Springboot.tutorial.tutorial.service;

import com.dailycodebuffer.Springboot.tutorial.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
     public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);
}
