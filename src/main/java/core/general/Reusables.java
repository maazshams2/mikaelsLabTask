package core.general;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Reusables {
    public Reusables(){}

    // Get current time
    static Date getTime() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTime();
    }

    //random rating generation
    public static int randomNo(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    // Return a substring between the two strings.
    // value = "Hello New World" , a = "Hello" , b = "World"
    // return "New"
    static String between(String value, String a, String b) {
        int posA = value.indexOf(a);
        if (posA == -1) {
            return "";
        }
        int posB = value.lastIndexOf(b);
        if (posB == -1) {
            return "";
        }
        int adjustedPosA = posA + a.length();
        if (adjustedPosA >= posB) {
            return "";
        }
        return value.substring(adjustedPosA, posB);
    }

    // Return substring containing all characters before a string.
    // value = "Hello New World" , a = " New"
    // return "Hello"
    static String before(String value, String a) {
        int posA = value.indexOf(a);
        if (posA == -1) {
            return "";
        }
        return value.substring(0, posA);
    }

    // Returns a substring containing all characters after a string.
    // value = "Hello New World" , a = "New "
    // return "World"
    static String after(String value, String a) {
        int posA = value.lastIndexOf(a);
        if (posA == -1) {
            return "";
        }
        int adjustedPosA = posA + a.length();
        if (adjustedPosA >= value.length()) {
            return "";
        }
        return value.substring(adjustedPosA);
    }
}
