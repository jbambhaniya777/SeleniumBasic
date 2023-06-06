package org.example;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomMethod {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);

        for(int i=0; i<5; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(10, 50 + 1);
            System.out.println(randomNum);
        }
    }
}
