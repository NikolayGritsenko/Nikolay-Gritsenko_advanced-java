package net.dunice.advancedjavaprojectacademy.tasks.block1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Barsik");
        cat.setAge(5);

        Crow crow = new Crow();
        crow.setName("Vasya");
        crow.setAge(2);

        Duck duck = new Duck();
        duck.setName("Donald");
        duck.setAge(3);

        cat.mySkill();
        crow.mySkill();
        duck.mySkill();
    }
}
