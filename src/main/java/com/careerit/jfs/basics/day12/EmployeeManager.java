package com.careerit.jfs.basics.day12;

public class EmployeeManager {
    public static void main(String[] args) {
        String data="1001-Rajesh-87000-Dev,1091-Raju-97000-QA,1501-Raja-67000-HR,1061-Pradeep-187000-Manager,10561-prajwal-84000-Dev,1501-vinay-87070-QA";
        //Get all department names
        //Get max paid employee of given department
        //Get max paid employee
        //Get total salary off all employees
        Employee[] arr= getEmployee(data);
        System.out.println("Total count of employees is " + arr.length);
        for(int i=0;i<arr.length;i++) {
            System.out.println( arr[i].getDeptname());
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i].getSalary();
        }
        System.out.println("Total salary is " +sum);
        System.out.println(getMaxpaidSalary(arr));
    }
    public static Employee[] getEmployee(String data){
    String[] arr=data.split(",");
    Employee[] empArr=new Employee[arr.length];
    int i=0;
    for (String empData:arr){
        String[] earr=empData.split("-");
        Long empno=Long.parseLong(earr[0]);
        String empname=earr[1];
        double salary=Double.parseDouble(earr[2]);
        String deptname=earr[3];
        Employee emp=new Employee(empno,empname,salary,deptname);
        empArr[i++]=emp;
    }
    return empArr;
    }
    private static double getMaxpaidSalary(Employee[] arr){

        double maxSalary = arr[0].getSalary();
        for (int i=0;i<arr.length;i++) {
            Employee sal=arr[i];
            if (sal.getSalary()>maxSalary){
                maxSalary=sal.getSalary();
            }
        }
        return maxSalary;
    }
    private static Employee  getMaxpaidSalaryofDept(String dept){

    return null;
    }
}
