package banat1.tect_10__17.hw10_17.hw15;


import java.util.ArrayList;
import java.util.List;

public class lect15 {

    // Method to return an ArrayList with consecutive values from min to max (inclusive, step -1)
    public static ArrayList<Integer> generateConsecutiveValues(int min, int max) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = max; i >= min; i--) {
            result.add(i);
        }
        return result;
    }

    // Method to sum elements greater than 5 in the list
    public static int sumElementsGreaterThanFive(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number > 5) {
                sum += number;
            }
        }
        return sum;
    }

    // Method to overwrite each filled slot in the list with a given number
    public static void overwriteListWithNumber(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
    }

    // Method to increase each element in the list by a given number
    public static void increaseElementsByNumber(int increment, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + increment);
        }
    }

    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> consecutiveValues = generateConsecutiveValues(1, 5);
        System.out.println("Consecutive Values: " + consecutiveValues);

        List<Integer> numbers = List.of(1, 6, 7, 3, 5, 8);
        int sum = sumElementsGreaterThanFive(numbers);
        System.out.println("Sum of elements greater than 5: " + sum);

        List<Integer> listToOverwrite = new ArrayList<>(List.of(1, 2, 3, 4));
        overwriteListWithNumber(10, listToOverwrite);
        System.out.println("List after overwrite: " + listToOverwrite);

        List<Integer> listToIncrease = new ArrayList<>(List.of(1, 2, 3));
        increaseElementsByNumber(5, listToIncrease);
        System.out.println("List after increase: " + listToIncrease);
    }
}
