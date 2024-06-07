package algoClass;

import java.util.Scanner;

class Employee {
    int employeeId;
    String name;
    double salary;

    // Constructor
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }
}

public class HRApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of employees
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1));
            System.out.print("Employee ID: ");
            int employeeId = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            employees[i] = new Employee(employeeId, name, salary);
        }

        // Sort employees based on salary using Quick Sort
        quickSort(employees, 0, n - 1);

        // Output sorted employees
        System.out.println("\nSorted Employees based on Salary:");
        for (Employee emp : employees) {
            System.out.println(emp.employeeId + "\t" + emp.name + "\t" + emp.salary);
        }

        // Identify and output median salary
        double medianSalary = findMedianSalary(employees);
        System.out.println("\nMedian Salary: " + medianSalary);

        // Print two sets of employees based on median salary
        System.out.println("\nEmployees with Salary <= Median:");
        for (Employee emp : employees) {
            if (emp.salary <= medianSalary) {
                System.out.println(emp.employeeId + "\t" + emp.name + "\t" + emp.salary);
            }
        }

        System.out.println("\nEmployees with Salary > Median:");
        for (Employee emp : employees) {
            if (emp.salary > medianSalary) {
                System.out.println(emp.employeeId + "\t" + emp.name + "\t" + emp.salary);
            }
        }
    }

    // Quick Sort algorithm to sort employees based on salary
    private static void quickSort(Employee[] employees, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(employees, low, high);

            quickSort(employees, low, pivotIndex - 1);
            quickSort(employees, pivotIndex + 1, high);
        }
    }

    private static int partition(Employee[] employees, int low, int high) {
        double pivot = employees[high].salary;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (employees[j].salary <= pivot) {
                i++;
                swap(employees, i, j);
            }
        }

        swap(employees, i + 1, high);
        return i + 1;
    }

    private static void swap(Employee[] employees, int i, int j) {
        Employee temp = employees[i];
        employees[i] = employees[j];
        employees[j] = temp;
    }

    // Function to find the median salary
    private static double findMedianSalary(Employee[] employees) {
        int length = employees.length;
        if (length % 2 == 0) {
            // If the number of elements is even, average the middle two elements
            int mid1 = length / 2 - 1;
            int mid2 = length / 2;
            return (employees[mid1].salary + employees[mid2].salary) / 2.0;
        } else {
            // If the number of elements is odd, return the middle element
            int mid = length / 2;
            return employees[mid].salary;
        }
    }
}