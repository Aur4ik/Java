package control;


public class Manager extends Employee{
    private int teamSize;

    public Manager(String name, double salary, int teamSize){
        super(name,salary);
        this.teamSize = teamSize;
    }
    @Override
    public void work(){
        System.out.println(name + " управляет командой из " + teamSize + " человек");
        System.out.println("-----------------------------");
    }

    public int getTeamSize(){
        return teamSize;
    }
    public void setTeamSize(int teamSize){
        if (teamSize < 0) {
            System.out.println("Размер команды не может быть отрицательным");
            System.out.println("-----------------------------");
            return;
        }
        this.teamSize = teamSize;
    }
}