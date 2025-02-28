package com.ooptasks.intermediatetasks;

import javax.security.sasl.SaslException;

/*
 * 8. Package Management:
Task: Create a package com.company.hr with classes like Employee and Manager. 
Create another package com.company.sales with a SalesPerson class. 
Import and use the classes from both packages in a Main class.
 */

import com.ooptasks.intermediatetasks.hr.Employee;
import com.ooptasks.intermediatetasks.hr.Manager;
import com.ooptasks.intermediatetasks.sales.SalesPerson;

public class task4 {
    public static void main(String[] args) {
        Employee e = new Employee("Nirajan", "IT");

        Manager m = new Manager("Riya", "HR");

        SalesPerson sp = new SalesPerson("Prajwal", "Manufacturing");
    }
}
