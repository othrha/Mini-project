
import java.util.ArrayList;
import java.util.Scanner;

    public class EmployeeManager {
        static Scanner scnr = new Scanner(System.in);

        public static void main(String[] args) {
            final int MAX_ELEMENTS = 10;
            final char EXIT_CODE = 'X';
            final String PROMPT_ACTION = "Add, Delete, List or eXit (a,d,l,x): ";
            ArrayList<String> name = new ArrayList<String>(MAX_ELEMENTS);
            ArrayList<String> department = new ArrayList<String>(MAX_ELEMENTS);
            ArrayList<String> title = new ArrayList<String>(MAX_ELEMENTS);
            char userAction;

// Loop until the user enters the exit code.
            userAction = getAction(PROMPT_ACTION);

            while (userAction != EXIT_CODE) {
                if(userAction == 'A') {
                    addEmployee(name, department, title);
                }
                else if(userAction == 'D') {
                    deleteEmployee(name, department, title);
                }
                else if(userAction == 'L') {
                    listEmployees(name, department, title);
                }

                userAction = getAction(PROMPT_ACTION);
            }
        }

        // Add an employee
        public static void addEmployee(ArrayList<String> name,
                                       ArrayList<String> department,
                                       ArrayList<String> title) {
            String theName;
            String theDept;
            String theTitle;

            System.out.println("\nEnter the name to add: ");
            theName = scnr.nextLine();
            System.out.println("Enter " + theName + "'s department: ");
            theDept = scnr.nextLine();
            System.out.println("Enter " + theName + "'s title: ");
            theTitle = scnr.nextLine();

            name.add(theName);
            department.add(theDept);
            title.add(theTitle);

            System.out.println(theName + "'s information has been added.");
        }

        // Delete an employee
        public static void deleteEmployee(ArrayList<String> name,
                                          ArrayList<String> department,
                                          ArrayList<String> title) {
            System.out.println("FIXME: Delete employee");
// FIXME: Ask the user for the employee # to delete, then delete that employee

        }

        // List all employees
        public static void listEmployees(ArrayList<String> name,
                                         ArrayList<String> department,
                                         ArrayList<String> title) {
            int nElements;
            int i;

            nElements = name.size();
            if (nElements > 0) {
                System.out.println();
                for (i = 0; i < nElements; ++i) {
                    System.out.println(i + ") Name: " + name.get(i) +
                            ",\tDepartment: " + department.get(i) +
                            ",\tTitle: " + title.get(i));
                }
            }
            else {
                System.out.println("\nThere are no employees to list.");
            }
        }

        // Get the action the user wants to perform
        public static char getAction(String prompt) {
            String answer;
            char firstChar;

            System.out.println();
            System.out.println(prompt);
            answer = scnr.nextLine().toUpperCase() + " "; // Ensure >= 1 character
            firstChar = answer.charAt(0);

            return firstChar;
        }
    }

