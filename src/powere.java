import java.util.Scanner;

public class Powere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Scientific Calculator ===");
            System.out.println("1. Sine (sin)");
            System.out.println("2. Cosine (cos)");
            System.out.println("3. Tangent (tan)");
            System.out.println("4. Natural Logarithm (ln)");
            System.out.println("5. Base 10 Logarithm (log)");
            System.out.println("6. Square Root (√)");
            System.out.println("7. Power (x^y)");
            System.out.println("8. Factorial (n!)");
            System.out.println("9. Exit");
            System.out.print("Choose an operation (1-9): ");

            int choice = scanner.nextInt();
            

            switch (choice) {
                
                default:
                    System.out.println("Feature not implemented yet!");
            }
        }
        scanner.close();
    }
}
