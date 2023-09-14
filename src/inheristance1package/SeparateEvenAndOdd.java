package inheristance1package;

import java.util.ArrayList;
import java.util.List;

public class SeparateEvenAndOdd {
    public static void main(String[] args) {
        // Input list of numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        // Separate even and odd numbers
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num); // Add even number to evenNumbers list
            } else {
                oddNumbers.add(num); // Add odd number to oddNumbers list
            }
        }

        // Calculate sum and average of even numbers
        int evenSum = 0;
        for (int even : evenNumbers) {
            evenSum += even;
        }
        double evenAverage = (evenNumbers.size() > 0) ? (double) evenSum / evenNumbers.size() : 0;

        // Calculate sum and average of odd numbers
        int oddSum = 0;
        for (int odd : oddNumbers) {
            oddSum += odd;
        }
        double oddAverage = (oddNumbers.size() > 0) ? (double) oddSum / oddNumbers.size() : 0;

        // Print even numbers
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Average of even numbers: " + evenAverage);

        // Print odd numbers
        System.out.println("Odd numbers: " + oddNumbers);
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Average of odd numbers: " + oddAverage);
    }
}