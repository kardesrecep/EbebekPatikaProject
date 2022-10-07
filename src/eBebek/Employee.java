package eBebek;

public class Employee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    public Employee() {
    }

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    private static int bonus(int workHours) {
        if (workHours - 40 > 0) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    public static int raiseSalary(int salary, int hireYear) {
        if (2021 - hireYear < 10) {
            return (int) (salary * (0.05));
        } else if (2021 - hireYear < 20) {
            return (int) (salary * (0.1));
        }else {
            return (int) (salary * (0.15));
        }
    }

    public static int tax(int salary, int bonus, int raiseSalary) {
        int totalSalary = salary + bonus + raiseSalary;
        if (totalSalary < 1000) {
            return 0;
        } else {
            return (int) (totalSalary * (0.03));
        }
    }

    @Override
    public String toString() {
        return
                "\nname: " + name +
                "\nsalary: " + salary +
                "\nworkHours: " + workHours +
                "\nhireYear: " + hireYear +
                "\nbonus: " + bonus(workHours) +
                "\nraiseSalary: " + raiseSalary(salary,hireYear) +
                "\ntax: " + tax(salary, bonus(workHours),raiseSalary(salary,hireYear)) +
                "\nTotal Salary: " + (salary + bonus(workHours) + raiseSalary(salary,hireYear) - tax(salary, bonus(workHours),
                raiseSalary(salary,hireYear)));

    }
}














