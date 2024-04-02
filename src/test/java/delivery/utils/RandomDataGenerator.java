package delivery.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomDataGenerator {

    public static String generateName(){

        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;

        return RandomStringUtils.random(length, useLetters, useNumbers);
    }

    public static String generatePhoneNumber() {
        int length = 10;
        boolean useLetters = false;
        boolean useNumbers = true;
        String generatedPhoneNumber = RandomStringUtils.random(length, useLetters, useNumbers);

        return generatedPhoneNumber;
    }

    public static String generateComment() {
        int length = 20;
        boolean useLetters = true;
        boolean useNumbers = true;
        String generatedComment = RandomStringUtils.random(length, useLetters, useNumbers);

        return generatedComment;
    }

    public static int generateId() {
        int length = 10;
        boolean useLetters = false;
        boolean useNumbers = true;
        int generatedId = Integer.parseInt(RandomStringUtils.random(length, useLetters, useNumbers));

        return generatedId;
    }

    public static int generateCourierId() {
        int length = 10;
        boolean useLetters = false;
        boolean useNumbers = true;
        int generatedCourierId = Integer.parseInt(RandomStringUtils.random(length, useLetters, useNumbers));

        return generatedCourierId;
    }
}
