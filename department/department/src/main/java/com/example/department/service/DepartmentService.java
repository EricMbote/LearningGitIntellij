package com.example.department.service;

import com.example.department.model.Department;
import com.example.department.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;

    public DepartmentService(DepartmentRepo departmentRepo) {
        this.departmentRepo = departmentRepo;
    }

    public Department addDepartment(Department department){
        return departmentRepo.save(department);
    }

    public List<Department> findAllDepartments(){
        return departmentRepo.findAll();
    }

    public Department updateDepartment(Department department){
        return departmentRepo.save(department);
    }

    public Department findDepartmentById(Long departmentId){
        return departmentRepo.findByDepartmentId(departmentId);
    }
}
