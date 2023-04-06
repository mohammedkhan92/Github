package com.dailycodebuffer.Springboot.tutorial.tutorial.controller;

import com.dailycodebuffer.Springboot.tutorial.error.DepartmentNotFoundException;
import com.dailycodebuffer.Springboot.tutorial.tutorial.entity.Department;
import com.dailycodebuffer.Springboot.tutorial.tutorial.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.web.servlet.function.RequestPredicates.contentType;

@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DepartmentService departmentService;

    private Department department;

    @BeforeEach
    void setup() {
        department = Department.builder()
                .departmentAddress("Ahmedabad")
                .departmentCode("IT-06")
                .departmentName("IT")
                .departmentId(1L)
                .build();

    }

    @Test
    void saveDepartment() throws Exception {
        Department inputDepartment  = Department.builder()
                .departmentAddress("Ahmedabad")
                .departmentCode("IT-06")
                .departmentName("IT")
                .departmentId(1L)
                .build();

        Mockito.when(departmentService.saveDepartment(inputDepartment))
                .thenReturn(department);

        mockMvc.perform(post("/departments")
        .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "\t\"departmentName\":\"IT\",\n" +
                        "\t\"departmentAddress\":\"Ahmedabad\",\n" +
                        "\t\"departmentCode\":\"IT-06\"\n" +
                        "\t\n" +
                        "}"))
                .andExpect(status().isOk());

    }

    @Test
    void fetchDepartmentById() throws Exception {
        Mockito.when(departmentService.fetchDepartmentById(1L))
                .thenReturn(department);

        mockMvc.perform(get("/departments/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.departmentName").
                        value(department.getDepartmentName()));
    }
}