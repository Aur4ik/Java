package seven.Employes;
public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
            new Developer(1, "Aurik", 50000, "Java", 5),
            new Developer(2, "Alex", 55000, "Go", 3),

            new Designer(3, "Anna", 40000, "Figma", 6),
            new Designer(4, "Kate", 42000, "Photoshop", 4),

            new Manager(5, "John", 60000, 10, 2)
        };


        for (Employee emp : employees) {
            emp.showInfo();
            emp.work();
            System.out.println("Salary: " + emp.calculateSalary());
            System.out.println("---------------------");
        }
    }
}