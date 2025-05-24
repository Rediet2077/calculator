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
                                    case 1: // Sine
                                    System.out.print("Enter angle in degrees: ");
                                    System.out.print("Enter angle in degrees: ");
                                    
                                    double angle = scanner.nextDouble();
                                    System.out.println("sin(" + angle + "°) = " + Math.sin(Math.toRadians(angle)));
                                    break;
                                    case 7: // Power
                                        System.out.print("Enter base: ");
                                        double base = scanner.nextDouble();
                                        System.out.print("Enter exponent: ");
                                        double exponent = scanner.nextDouble();
                                        System.out.println(base + "^" + exponent + " = " + Math.pow(base, exponent));
                                        break;
                                    case 8:
                                        System.out.print("Enter non-negative integer: ");
                                        num = scanner.nextDouble();
                                        if (num >= 0 && num == (int) num) {
                                            long factorial = 1;
                                            for (int i = 1; i <= (int) num; i++) {
                                                factorial *= i;
                                            }
                                            System.out.println((int) num + "! = " + factorial);
                                        } else {
                                            System.out.println("Invalid input! Must be non-negative integer.");
                                        }
                                        break;
                    
                                    case 9: // Exit
                                        running = false;
                                        System.out.println("Exiting calculator...");
                                        break;
                                    default:
                                        System.out.println("Feature not implemented yet!");
                                }
                            }
                            scanner.close();
                        }
                    }
                    

            
