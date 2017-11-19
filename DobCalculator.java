import java.time.LocalDate;
import java.util.Scanner;

public class DobCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your age: ");
        long age = Long.parseLong(scanner.nextLine());
        
        LocalDate currentDate = LocalDate.now();
        LocalDate approxDob = currentDate.minusYears(age);
        
        System.out.println("Age: " + age);
        System.out.println("Current date: " + currentDate);
        System.out.println("Approximate DOB: " + approxDob);
    }
}
