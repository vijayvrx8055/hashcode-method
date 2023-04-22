package com.vrx.withoutHashcode;

import java.util.HashSet;
import java.util.Set;

public class WithoutOverridingHashcodeMethod {
    public static void main(String[] args) {
        System.out.println("Without Overriding hashCode() method");
        Employee employee1 = new Employee();
        employee1.setEmployeeId(101);
        employee1.setName("Vijay");

        Employee employee2 = new Employee();
        employee2.setEmployeeId(102);
        employee2.setName("Binod");


        Employee employee3 = new Employee();
        employee3.setEmployeeId(101);
        employee3.setName("Vijay");

        Set<Employee> employees = new HashSet<Employee>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        System.out.println("Size of hashSet:" + employees.size());
    }
}
