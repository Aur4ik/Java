package fifth.practice;

public class GameCharacter {
    private String name;
    private int health;

    public GameCharacter(String name){
        this.name = name;
        this.health = 100;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }

    public void takeDamage(int Damage){
        if(Damage < 0){
            return;
        }
        health -= Damage;

        if(health < 0){
            health = 0;
        }
    }
    public void heal(int amount){
        if(amount < 0){
            return;
        }
        health += amount;

        if(health > 100){
            health = 100;
        }
    }
    public boolean isAlive(){
        return health > 0;
    }
}
