package javaSixth;


import javaSixth.CW.Designer;
import javaSixth.CW.Developer;
import javaSixth.CW.Manager;

public class Main {
    Developer developer = new Developer("Иван", 50000, "Java");
    Manager manager = new Manager("Петр", 70000, 5);
    Designer designer = new Designer("Светлана", 60000, "Photoshop");
    
    public void showInfo(){
        developer.info();
        manager.info();
        designer.info();
    }
    public void showWork(){
        developer.work();
        manager.work();
        designer.work();
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.showInfo();
        main.showWork();
    }
    public void changeInfo(){
        developer.setName("Ivan");
        developer.setSalary(55000);

        manager.setName("Petr");
        manager.setSalary(75000);

        designer.setName("Svetlana");
        designer.setSalary(65000);
    }
    public void upSalary(){
        developer.upSalary(5000);
        manager.upSalary(5000);
        designer.upSalary(5000);
    }

}
