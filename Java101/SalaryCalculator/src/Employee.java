import java.util.Calendar;

public class Employee implements IEmployee {

    String fullName;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String fullName, double salary, int workHours, int hireYear) {
        this.fullName = fullName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    @Override
    public double tax() {
        return this.salary < 1000.0 ? 0 : this.salary * 0.03;
    }

    @Override
    public double bonus() {
        return this.workHours <= 40 ? 0 : (this.workHours - 40) * 30;
    }

    @Override
    public double raiseSalary() {
        int workingYears = Calendar.getInstance().get(Calendar.YEAR) - this.hireYear;
        // or => int workingYears = 2021 - this.hireYear;

        if(workingYears < 0) return 0;
        else if(workingYears <= 9) return this.salary * 0.05;
        else if(workingYears <= 19) return this.salary * 0.1;
        else return this.salary * 0.15;
    }

    @Override
    public String toString() {

        return ""
                + "\nFullname: " + this.fullName
                + "\nSalary: " + this.salary
                + "\nWork hours: " + this.workHours
                + "\nHiring year: " + this.hireYear
                + "\nTax: " + tax()
                + "\nBonus: " + bonus()
                + "\nRaise salary: " + raiseSalary()
                + "\nSalary with Taxes and Bonuses: " + (this.salary - tax() + bonus())
                + "\nTotal salary: " + (this.salary + raiseSalary());
    }
}
