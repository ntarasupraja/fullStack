package com.careerit.jfs.basics.day15;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
        private String empno;
        private String name;
        private String countryName;
        private String salary;
}
