package fifth.practice;



public class Main {
    public static void main(String[] args) {
        
        GameCharacter hero = new GameCharacter("Arthas");

        hero.takeDamage(30);
        System.out.println(hero.getHealth());

        hero.heal(20);
        System.out.println(hero.getHealth());

        hero.takeDamage(50);
        System.out.println(hero.getHealth());

        System.out.println(hero.isAlive());


}
}
