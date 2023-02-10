package com.careerit.jfs.basics.day15;

import java.util.List;

public class EmployeeDriver {


    public static void main(String[] args) throws Exception {
        EmployeeService empservice=new EmployeeService();
        List<EmployeeDTO> list=empservice.getEmployeeDetails();
        for (EmployeeDTO emp:list){
            System.out.println(String.format("%s,%s,%s,%s",emp.getEmpno(),emp.getName(),emp.getCountryName(),emp.getSalary()));
        }
    }




}
