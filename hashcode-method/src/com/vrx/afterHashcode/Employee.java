package com.vrx.afterHashcode;

public class Employee {
    private int employeeId;
    private String name;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) return false;
        return this.employeeId == ((Employee) obj).employeeId;
    }

    @Override
    public int hashCode() {
        return this.employeeId;
    }
}
