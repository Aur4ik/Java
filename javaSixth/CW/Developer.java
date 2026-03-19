package javaSixth.CW;

public class Developer extends Employee {
    private String language;

    public Developer(String name, double salary, String language){
        super(name, salary);
        this.language = language;
    }
    @Override
    public void info(){
        super.info();
        System.out.println("Язык " + language);
        System.out.println("-----------------------------");
    }
    @Override
    public void work(){
        System.out.println(name + " пишет код на " + language);
        System.out.println("-----------------------------");
    }

    public String getLanguage(){
        return language;
    }
    public void setLanguage(String language){
        if (language != null && language.isBlank()) {
            System.out.println("Язык не может быть пустым");
            System.out.println("-----------------------------");
            return;
        }
        this.language = language;
    }
}