package secondlesson;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Hero {
    String name;
    int hp;
    int maxHp;
    int power;
    int energy;
    int coins;
    int potions;
    Element element;

    void heroStat() {
        System.out.println("------ ГЕРОЙ ------");
        System.out.println("Имя: " + name);
        System.out.println("HP: " + hp + "/" + maxHp);
        System.out.println("Сила: " + power);
        System.out.println("Энергия: " + energy);
        System.out.println("Монеты: " + coins);
        System.out.println("Зелья: " + potions);
        System.out.println("Стихия: " + element);
        System.out.println("-------------------");
    }

    void workout() {
        if (energy <= 0) {
            System.out.println("Нет энергии!");
            return;
        }
        int boost = power + 2;
        power += boost;
        energy -= boost;
        if (energy < 0) energy = 0;

        System.out.println("Тренировка завершена. + " + boost + " силы");
    }

    void chill() {
        int restore = ThreadLocalRandom.current().nextInt(1, 11);
        energy += restore;
        hp += 2;
        if (hp > maxHp) hp = maxHp;

        System.out.println("Отдых: +" + restore + " энергии, +2 HP");
    }

    void usePotion() {
        if (potions > 0) {
            hp += 30;
            if (hp > maxHp) hp = maxHp;
            potions--;
            System.out.println("Вы использовали зелье. HP: " + hp);
        } else {
            System.out.println("Зелий нет!");
        }
    }
}

enum Element{
    FIRE,
    WATER,
    EARTH,
    AIR
}


class Monster {
    String name;
    int hp;
    int power;
    int maxHp;
    Element element;
}

class Shop {

    static void open(Hero hero, Scanner sc) {
        while (true) {
            System.out.println("------ МАГАЗИН ------");
            System.out.println("1. Зелье (10 монет)");
            System.out.println("2. +5 к силе (25 монет)");
            System.out.println("3. Выход");
            System.out.print("Выбор: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    if (hero.coins >= 10) {
                        hero.coins -= 10;
                        hero.potions++;
                        System.out.println("Вы купили зелье!");
                    } else {
                        System.out.println("Не хватает монет!");
                    }
                    break;

                case "2":
                    if (hero.coins >= 25) {
                        hero.coins -= 25;
                        hero.power += 5;
                        System.out.println("Сила увеличена!");
                    } else {
                        System.out.println("Не хватает монет!");
                    }
                    break;

                case "3":
                    return;

                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
}

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.name = "Aurik";
        hero.hp = 100;
        hero.maxHp = 100;
        hero.power = 1;
        hero.energy = 100;
        hero.coins = 20;
        hero.potions = 2;
        hero.element = Element.AIR;

        Monster monster = new Monster();
        monster.name = "Pifagor";
        monster.hp = 150;
        monster.maxHp = 150;
        monster.power = 4;
        monster.element = Element.WATER;
        while (true) {
            System.out.println("\n--- МЕНЮ ---");
            System.out.println("1. Показать героя");
            System.out.println("2. Тренировка");
            System.out.println("3. Бой");
            System.out.println("4. Отдых");
            System.out.println("5. Магазин");
            System.out.println("6. Использовать зелье");
            System.out.println("0. Выход");
            System.out.print("Выбор: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    hero.heroStat();
                    break;
                case "2":
                    hero.workout();
                    break;
                case "3":
                    fight(hero, monster);
                    break;
                case "4":
                    hero.chill();
                    break;
                case "5":
                    Shop.open(hero, sc);
                    break;
                case "6":
                    hero.usePotion();
                    break;
                case "0":
                    System.out.println("Выход из игры");
                    return;
                default:
                    System.out.println("Неверный ввод");
            }
        }
    }

static int calcDamage(Hero hero, Monster monster){
    Random random = new Random();
    int damage = hero.power + random.nextInt(3);

    switch (hero.element) {
        case EARTH:
            damage += 2;
            break;
        case AIR:
            int chance = random.nextInt(100); 
            if(chance < 30){ 
                System.out.println("Монстр промахнулся!");
                return damage;
            }
            break;
        case FIRE:
            damage += 3;
            break;
        case WATER:
            damage += 1;
            if(hero.hp <= 15){
                hero.hp = hero.maxHp;
                System.out.println("Стихия воды вас спасла!");
            }
            break;
    }

    return damage;
}


    static void fight(Hero hero, Monster monster) {

        if (hero.energy <= 0) {
            System.out.println("Энергия закончилась,ты должен отдохнуть");
            return;
        }
        hero.energy -= 20;
        monster.hp = 150; 
        System.out.println("Бой с " + monster.name + " начался!");
        System.out.println("Твоя стихия : " + hero.element);
        System.out.println("Стихия Монстра: " + monster.element);

        while (hero.hp > 0 && monster.hp > 0) {
            int heroDamage = calcDamage(hero, monster);
            monster.hp -= heroDamage;
            System.out.println("Ты ударил на " + heroDamage);
            System.out.println("Здоровье Монстра: " + monster.hp+ "/" + monster.maxHp);

            if (monster.hp <= 0) {
                System.out.println("Ты победил!");
                hero.hp = hero.maxHp;
                hero.coins += 20;
                return;
            }

            int monsterDamage = monster.power + random.nextInt(3);
            hero.hp -= monsterDamage;
            System.out.println("Монстр ударил на " + monsterDamage);
            System.out.println("Твое Здоровье: " + hero.hp+ "/" + hero.maxHp);


            if (hero.hp <= 0) {
                System.out.println("Ты проиграл...");
                hero.hp = hero.maxHp;
                return;
            }

            if (hero.hp <= 35 && hero.potions > 0) {
                System.out.println("Использовать зелье? (1 - да, 2 - нет)");
                String ans = sc.nextLine();
                if (ans.equals("1")) {
                    hero.usePotion();
                }
                else{
                    
                }
            }
        }
    }
}
