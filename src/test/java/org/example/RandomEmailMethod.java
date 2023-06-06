package org.example;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.ThreadLocalRandom;

public class RandomEmailMethod {
    public static void main(String[] args) {
        String generatedEmail = RandomStringUtils.randomAlphabetic(10);
        String randomEmail = generatedEmail+ "@gmail.com";
        System.out.println(randomEmail);

    }


}
