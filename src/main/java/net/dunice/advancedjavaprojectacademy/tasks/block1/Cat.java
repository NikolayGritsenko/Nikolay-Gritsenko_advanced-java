package net.dunice.advancedjavaprojectacademy.tasks.block1;

public class Cat extends Animal{

    @Override
    public void movement() {
        System.out.println("I can run!");
    }

    @Override
    public void voice() {
        System.out.println("Meow, meow");
    }
}
