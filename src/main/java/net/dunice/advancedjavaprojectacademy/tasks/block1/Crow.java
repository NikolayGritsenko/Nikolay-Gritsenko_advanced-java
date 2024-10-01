package net.dunice.advancedjavaprojectacademy.tasks.block1;

public class Crow extends Animal {

    @Override
    public void movement() {
        System.out.println("I can fly!");
    }

    @Override
    public void voice() {
        System.out.println("Caw-caw");
    }
}
