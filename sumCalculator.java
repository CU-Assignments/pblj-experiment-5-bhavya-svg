import java.util.*;

public class sumCalculator {
    public static void main(String[] args) {
        List<String> numberStrings = Arrays.asList("10", "20", "30", "40", "50");
        List<Integer> numbers = parseToIntegers(numberStrings);
        int sum = calculateSum(numbers);
        System.out.println("Sum: " + sum);
    }

    // Method to parse a list of string numbers into a list of Integer objects
    public static List<Integer> parseToIntegers(List<String> strNumbers) {
        List<Integer> numbers = new ArrayList<>();
        for (String str : strNumbers) {
            numbers.add(Integer.parseInt(str)); // Autoboxing: int to Integer
        }
        return numbers;
    }

    // Method to calculate sum of a list of Integer objects
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing: Integer to int
        }
        return sum;
    }
}
