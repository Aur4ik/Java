package seven;

abstract class Employee {
    private int id;
    private String name;
    private double baseSalary;

    // Конструктор
    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void showInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Base Salary: " + baseSalary);
    }

    // Абстрактные методы
    public abstract void work();
    public abstract double calculateSalary();
}