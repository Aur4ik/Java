package control;

import java.util.Scanner;

public class Main {
    private Developer developer = new Developer("Иван", 50000, "Java");
    private Manager manager = new Manager("Петр", 70000, 5);
    private Scanner sc = new Scanner(System.in);

    public void showWork() {
        System.out.println("\n=== Работа сотрудников ===");
        developer.work();
        manager.work();
        System.out.println("=========================\n");
    }

    public void changeInfo() {
        System.out.println("Введите новое имя для разработчика:");
        String newName = sc.nextLine();
        System.out.println("Введите новую зарплату для разработчика:");
        double newSalary = sc.nextDouble();
        sc.nextLine(); // очистка буфера после nextDouble

        developer.setName(newName);
        developer.setSalary(newSalary);

        System.out.println("Введите новое имя для менеджера:");
        String newManagerName = sc.nextLine();
        System.out.println("Введите новую зарплату для менеджера:");
        double newManagerSalary = sc.nextDouble();
        sc.nextLine(); // очистка буфера

        manager.setName(newManagerName);
        manager.setSalary(newManagerSalary);

        System.out.println("Информация успешно обновлена!");
    }

    public void upSalary() {
        System.out.println("На сколько повысить зарплату разработчику?");
        double devIncrease = sc.nextDouble();
        System.out.println("На сколько повысить зарплату менеджеру?");
        double mgrIncrease = sc.nextDouble();
        sc.nextLine(); // очистка буфера

        developer.upSalary(devIncrease);
        manager.upSalary(mgrIncrease);

        System.out.println("Зарплаты успешно повышены!");
    }

    public static void main(String[] args) {
        Main main = new Main();

        while (true) {
            System.out.println("Введите команду:\n" +
                               "1 - показать работу\n" +
                               "2 - изменить информацию\n" +
                               "3 - повысить зарплату\n" +
                               "0 - выйти");
            int command = main.sc.nextInt();
            main.sc.nextLine(); // очистка буфера после nextInt

            switch (command) {
                case 1 -> main.showWork();
                case 2 -> main.changeInfo();
                case 3 -> main.upSalary();
                case 0 -> {
                    System.out.println("Выход из программы.");
                    return;
                }
                default -> System.out.println("Неверная команда. Попробуйте снова.");
            }
        }
    }
}