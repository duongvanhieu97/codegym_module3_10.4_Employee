package com.example.employee;

import com.example.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "EmployeeServlet", value = "/show")
public class EmployeeServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Hiếu", "29/12/1997","Bắc Ninh","/home/duonghieu/codegym/module3/codegym_module3_10.3_Employee/image/Hieu.jpg"));
        employeeList.add(new Employee("Trung", "01/09/1993","Bắc Ninh","/home/duonghieu/codegym/module3/codegym_module3_10.3_Employee/image/Trung.jpg"));
        employeeList.add(new Employee("Hoàng", "07/04/1999","Bắc Ninh","/home/duonghieu/codegym/module3/codegym_module3_10.3_Employee/image/Hoang.jpg"));
        employeeList.add(new Employee("Quân", "23/02/1993","Bắc Ninh","/home/duonghieu/codegym/module3/codegym_module3_10.3_Employee/image/Quan.jpg"));

        req.setAttribute("employeeList",employeeList);
        System.out.println(employeeList.get(1));
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("show.jsp");
        requestDispatcher.forward(req,resp);
    }

}