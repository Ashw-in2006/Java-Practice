public class Project1 {
    
    // Employee data class
    static class Employee {
        int empNo;
        String empName;
        String joinDate;
        char desigCode;
        String department;
        int basic;
        int hra;
        int it;
        
        public Employee(int empNo, String empName, String joinDate, char desigCode, 
                       String department, int basic, int hra, int it) {
            this.empNo = empNo;
            this.empName = empName;
            this.joinDate = joinDate;
            this.desigCode = desigCode;
            this.department = department;
            this.basic = basic;
            this.hra = hra;
            this.it = it;
        }
    }
    
    // Designation data class
    static class Designation {
        char desigCode;
        String designation;
        int da;
        
        public Designation(char desigCode, String designation, int da) {
            this.desigCode = desigCode;
            this.designation = designation;
            this.da = da;
        }
    }
    
    // Initialize employee data
    static Employee[] employees = {
        new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000),
        new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000),
        new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000),
        new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000),
        new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000),
        new Employee(1006, "Suman", "1/1/2000", 'e', "Manufacturing", 23000, 9000, 4400),
        new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000)
    };
    
    // Initialize designation data
    static Designation[] designations = {
        new Designation('e', "Engineer", 20000),
        new Designation('c', "Consultant", 32000),
        new Designation('k', "Clerk", 12000),
        new Designation('r', "Receptionist", 15000),
        new Designation('m', "Manager", 40000)
    };
    
    public static void main(String[] args) {
        // Check if command line argument is provided
        if (args.length == 0) {
            System.out.println("Please provide an employee ID as command line argument.");
            System.out.println("Usage: java Project1 <employee_id>");
            return;
        }
        
        try {
            int searchEmpNo = Integer.parseInt(args[0]);
            Employee foundEmployee = null;
            
            // Search for employee
            for (Employee emp : employees) {
                if (emp.empNo == searchEmpNo) {
                    foundEmployee = emp;
                    break;
                }
            }
            
            if (foundEmployee == null) {
                System.out.println("There is no employee with empid : " + searchEmpNo);
                return;
            }
            
            // Find designation and DA
            String designation = "";
            int da = 0;
            
            for (Designation desig : designations) {
                if (desig.desigCode == foundEmployee.desigCode) {
                    designation = desig.designation;
                    da = desig.da;
                    break;
                }
            }
            
            // Calculate salary
            int salary = foundEmployee.basic + foundEmployee.hra + da - foundEmployee.it;
            
            // Display output
            System.out.println("Emp No. Emp Name Department Designation Salary");
            System.out.printf("%-7d %-9s %-10s %-12s %d%n", 
                foundEmployee.empNo,
                foundEmployee.empName,
                foundEmployee.department,
                designation,
                salary);
                
        } catch (NumberFormatException e) {
            System.out.println("Invalid employee ID. Please provide a valid number.");
        }
    }
}

/*
int array[] = new int[5];
int[]array1 = new int[5]{1,2,3,4,5};

int empNo[] = {1001,1002,1003,1004,1005,1006,1007};
String empName[] = {"Arun","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
String joinDate[] = {"01/04/2009","23/08/2012","11/11/2000","29/01/2013","16/07/2005","01/01/2000","12/06/2006"};
char desigCode[] = {'e','c','k','r','m','e','c'};
String dept[]={"R&D","PM","ACCT","FrontDESk","Engg","Manufacturing","PM"};
int basic[] = {20000,30000,10000,12000,50000,23000,29000};
int hra[] = {8000,12000,8000,6000,20000};
