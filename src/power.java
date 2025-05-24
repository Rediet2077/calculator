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

            
            }
        }
