package javaSixth.CW;

public class Designer extends Employee{
    private String tool;

    public Designer(String name, double salary, String tool){
        super(name, salary);
        this.tool = tool;
    }
    @Override
    public void info(){
        super.info();
        System.out.println("Инструмент: " + tool);
        System.out.println("-----------------------------");
    }
    @Override
    public void work(){
        System.out.println(name + " делает дизайн в " + tool);
        System.out.println("-----------------------------");
    }

    public String getTool(){
        return tool;
    }
    public void setTool(String tool){
        if (tool != null && tool.isBlank()) {
            System.out.println("Инструмент не может быть пустым");
            System.out.println("-----------------------------");
            return;
        }
        this.tool = tool;
    }
}