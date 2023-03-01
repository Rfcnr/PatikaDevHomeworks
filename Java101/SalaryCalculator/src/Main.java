public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Salary Calculator
            You should write a class called "Employee" that represents the factory employees and
            calculates their salaries with its methods. This class will have 4 attributes and 5 methods.

            Attributes of the class

            name : Employee's first and last name
            salary : Employee's salary
            workHours : Weekly working hours
            hireYear : Employment start year
            Methods of the class

            Employee(name,salary,workHours,hireYear) : Constructor method and will take 4 parameters.
            tax() : It will calculate the tax applied to the salary.
            If the employee's salary is less than 1000 TL, no tax will be applied.
            If the employee's salary is more than 1000 TL, a tax of 3% of the salary will be applied.
            bonus() : If the employee worked more than 40 hours per week, it will calculate bonus wages of 30 TL for each extra hour worked.
            raiseSalary() : It will calculate the salary increase according to the employee's starting year. Take the current year as 2021.
            If the employee has been working for less than 10 years, the salary will be increased by 5%.
            If the employee has worked for more than 9 years and less than 20 years, the salary will be increased by 10%.
            If the employee has worked more than 19 years, the salary will be increased by 15%.
            toString() : It will print the information about the employee on the screen.
         */

        Employee employee1 = new Employee("Raif Çınar", 2000, 54, 2016);
        Employee employee2 = new Employee("Patika Dev", 2000, 45, 1985);

        System.out.println(employee1);
        System.out.println("-------------------------------");
        System.out.println(employee2);
    }
}