package com.careerit.jfs.basics.day12;

        public class Employee {
        private long empno;
        private String empname;
        private double salary;
        private String deptname;

            public Employee(long empno, String empname, double salary, String deptname) {
                this.empno = empno;
                this.empname = empname;
                this.salary = salary;
                this.deptname = deptname;
            }

            public long getEmpno() {
                return empno;
            }

            public void setEmpno(long empno) {
                this.empno = empno;
            }

            public String getEmpname() {
                return empname;
            }

            public void setEmpname(String empname) {
                this.empname = empname;
            }

            public double getSalary() {
                return salary;
            }

            public void setSalary(double salary) {
                this.salary = salary;
            }

            public String getDeptname() {
                return deptname;
            }

            public void setDeptname(String deptname) {
                this.deptname = deptname;
            }
        }
