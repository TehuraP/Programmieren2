package a.campus02.emp;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    //we gotta initialize the list, just like a normal array
    private ArrayList<Employee> employees = new ArrayList<Employee>(); // or we do it in constructor


    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public Employee findByEmpNumber(int number) {
        for (Employee emp : employees) {
            if (emp.getEmpNumber() == number) {
                return emp;
            }
        }
        return null;
    }

    public ArrayList<Employee> findByDepartment(String department) {
        //initialize an empty array list
        ArrayList<Employee> erg = new ArrayList<>();
        //make a loop that goes though all the employees
        for (Employee ee : employees) {
            //if the department matches, then the loop adds the employee to the array list
            if (ee.getDepartment().equals(department)) {
                erg.add(ee);
            }
        }
        return erg;
    }

    public Employee findByMaxSalary() {
        Employee highestE = null;
        double highestSalary = 0; //oder -1

        for (Employee eee : employees) {
            if (eee.getSalary() > highestSalary) {
                highestSalary = eee.getSalary();
                highestE = eee;
            }
        }
        return highestE;
    }
}
