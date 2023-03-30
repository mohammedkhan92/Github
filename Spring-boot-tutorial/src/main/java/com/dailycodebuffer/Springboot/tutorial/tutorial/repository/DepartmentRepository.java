package com.dailycodebuffer.Springboot.tutorial.tutorial.repository;

import com.dailycodebuffer.Springboot.tutorial.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
