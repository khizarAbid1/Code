import java.util.ArrayList;
import java.util.List;

public class Example12 {
    class Employee
    {
        String name;
        Employee(String name)
        {
            this.name=name;

        }
        public void show_employee()
        {
            System.out.println("Employee : "+name);

        }



    }
    class department
    {
        String dep_name;
        List<Employee> employees;
        department(String dep_name)
        {
            this.dep_name=dep_name;
            this.employees=new ArrayList<>();
        }
        void add_employee(Employee employee)
        {
            employees.add(employee);
        }
        void show_details()
        {
            System.out.println("Dep : "+dep_name);
            for(Employee employee:employees)
            {
                employee.show_employee();
            }
        }

    }


    public static void main(String[] args)
    {
        Example12 example12=new Example12();
        Employee employee1=example12.new Employee("Khizar");
        Employee employee2=example12.new Employee("Hassan");
        department department1=example12.new department("CS");
        department1.add_employee(employee1);
        department1.add_employee(employee2);
        employee1.show_employee();
        employee2.show_employee();
        department1.show_details();

    }
}
