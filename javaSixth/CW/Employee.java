package javaSixth.CW;

public class Employee {
    protected String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public void info(){
        System.out.println("Сотрудник:" + name);
        System.out.println("Зарплата:" + salary);
        System.out.println("-----------------------------");
    }
    public void work(){
        System.out.println(name + "Выполняет работу");
        System.out.println("-----------------------------");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name != null && name.isBlank()) {
            System.out.println("Имя не может быть пустым");
            System.out.println("-----------------------------");
            return;
        }
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if (salary < 0) {
            System.out.println("Зарплата не может быть отрицательной");
            System.out.println("-----------------------------");
            return;
        }
        this.salary = salary;
    }

    public void upSalary(double amount){
        if (amount > 0) {
            this.salary += amount;
        }
        System.out.println("Зарплата после повышения: " + salary);
        System.out.println("-----------------------------");
    }
}