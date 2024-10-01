package net.dunice.advancedjavaprojectacademy;

import net.dunice.advancedjavaprojectacademy.tasks.block2.Block2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AdvancedJavaProjectAcademyApplication {

    public static void main(String[] args) {
//        SpringApplication.run(AdvancedJavaProjectAcademyApplication.class, args);

        Block2 block2 = new Block2();
        var list = new ArrayList<Integer>();
        list.add(12342342);

        System.out.println(block2.getFrequencyCharacter("qkowwwweqqqeeeqqrw"));



    }
}
