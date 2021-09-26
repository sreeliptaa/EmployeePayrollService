package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Purpose - To implement Employee PayRoll Service System
 * @author - Sreelipta
 * @since - 2021-09-26
 */

public class EmployeePayrollService {
    public List<EmployeePayrollData> employeePayrollList = new ArrayList<>();

    public EmployeePayrollService(ArrayList<EmployeePayrollData> employeePayrollList) {
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Payroll Service");
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<EmployeePayrollData>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeeData(consoleInputReader);
        employeePayrollService.writeEmployeeData();
    }

    private void writeEmployeeData() {
        System.out.println("\nwriting employee payroll data to console\n"+ employeePayrollList);
    }

    private void readEmployeeData(Scanner consoleInputReader) {
        System.out.println("Enter Employee id: ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee name ");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee salary ");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id,name,salary));
    }
}



