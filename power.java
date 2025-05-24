case 6: // Square Root
                    System.out.print("Enter non-negative number: ");
                  num = scanner.nextDouble();
                    if (num >= 0) {
                        System.out.println("√" + num + " = " + Math.sqrt(num));
                    } else {
                        System.out.println("Invalid input! Number must be non-negative.");
                    }
                    break;