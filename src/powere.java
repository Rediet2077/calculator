case 4: // Natural Logarithm
                    System.out.print("Enter positive number: ");
                    double num = scanner.nextDouble();
                    if (num > 0) {
                        System.out.println("ln(" + num + ") = " + Math.log(num));
                    } else {
                        System.out.println("Invalid input! Number must be positive.");
                    }
                    break; 