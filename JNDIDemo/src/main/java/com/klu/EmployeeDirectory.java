package com.klu;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class EmployeeDirectory {
    private Context ctx;

    public EmployeeDirectory() {
        try {
            ctx = new InitialContext();
        } catch (NamingException e) {
            System.out.println("JNDI Error: " + e.getMessage());
        }
    }

    public void addEmployee(Employee employee) {
        try {
            ctx.bind(employee.getName(), employee);
            System.out.println("Employee added: " + employee.getName());
        } catch (NamingException e) {
            System.out.println("JNDI Error: " + e.getMessage());
        }
    }

    public Employee searchEmployee(String name) {
        try {
            return (Employee) ctx.lookup(name);
        } catch (NamingException e) {
            System.out.println("JNDI Error: " + e.getMessage());
            return null;
        }
    }

    public void updateEmployee(Employee employee) {
        try {
            ctx.rebind(employee.getName(), employee);
            System.out.println("Employee updated: " + employee.getName());
        } catch (NamingException e) {
            System.out.println("JNDI Error: " + e.getMessage());
        }
    }

    public void deleteEmployee(String name) {
        try {
            ctx.unbind(name);
            System.out.println("Employee deleted: " + name);
        } catch (NamingException e) {
            System.out.println("JNDI Error: " + e.getMessage());
        }
    }
}

