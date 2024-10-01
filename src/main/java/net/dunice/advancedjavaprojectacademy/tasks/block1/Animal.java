package net.dunice.advancedjavaprojectacademy.tasks.block1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Animal {

    private String name;

    private int age;

    public void movement() {}

    public void voice() {}

    public void mySkill() {
        System.out.println("====================");
        System.out.println("My name: " + getName());
        System.out.println("I am " + getAge() + " years old");
        movement();
        voice();
        System.out.println("====================");
    }

}
