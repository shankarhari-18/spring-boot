package com.hari.crud.controller;

import com.hari.crud.model.Employee;
import com.hari.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
    @Autowired

    private EmployeeService employeeService;

    @GetMapping("/addnew")
    public String addNewEmployee(Model model){
        Employee employee=new Employee();
        model.addAttribute("employee",employee);
        return "newemployee";
    }
}
