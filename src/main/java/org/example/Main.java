package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args)
    {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);


        LocalDate today = LocalDate.now();
        LocalDate newDate = today.plusWeeks(2);
        System.out.println("Current Date: " + today +  " New Date (after 2 weeks): " + newDate);

        LocalDate todayAgain = LocalDate.now();
        LocalDate futureDate = LocalDate.of(2025, 02,16);

        if (todayAgain.isBefore(futureDate)){
            System.out.println("Today is after specified future date: " + todayAgain);
        } else if (today.isAfter(futureDate)) {
            System.out.println("Today is after specified future date: " + today);


        }
        else {
            System.out.println("The current date is the same as the specified future date");
        }

        LocalDate date = LocalDate.of(2024, 9,4);
        LocalDate date2 = LocalDate.of(2025,2,16);

        long daysBetween = ChronoUnit.DAYS.between(date, date2);
        System.out.println("The difference in days between is: " + daysBetween);


    }
}