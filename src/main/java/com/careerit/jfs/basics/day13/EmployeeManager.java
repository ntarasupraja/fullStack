package com.careerit.jfs.basics.day13;
class Employee{
    public int empno;
    private String name;
    public String deptname;
    private String mobileno;
    public Employee(int empno, String name) {
        this(empno,name,"N/A","N/A");
    }
    public Employee(int empno, String name, String deptname) {
        this(empno,name,deptname,"N/A");
    }
    public Employee(int empno, String name, String deptname, String mobileno) {
        this.empno=empno;
        this.name=name;
        this.deptname=deptname;
        this.mobileno=mobileno;
        System.out.println("hi");
    }

}
public class EmployeeManager {
    public static void main(String[] args) {
        Employee emp=new Employee(1001,"tara","Dev","89898898978");
    }
}
