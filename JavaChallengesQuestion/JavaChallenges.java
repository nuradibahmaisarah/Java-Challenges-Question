// Nuradibah Maisarah
import java.util.Random;
import java.util.Scanner;

public class JavaChallenges {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        int choice;
        do {
            // Display the main menu
            System.out.println("\n\n\n\n***********************************************************************************");
            System.out.println("\t\tWELCOME TO THE JAVA PROGRAMMING CHALLENGES");
            System.out.println("***********************************************************************************");
            System.out.println("\t1. Even-Odd Game");
            System.out.println("\t2. Multiplication Quiz");
            System.out.println("\t3. Fibonacci Series Generator");
            System.out.println("\t4. Exit the Program");
            System.out.print("\tSelect a task you want to choose: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            // Handle user choice
            switch (choice) {
                case 1:
                    playEvenOdd(); // Call the playEvenOdd function
                    break;
                case 2:
                    generateQuestion(); // Call the generateQuestion function
                    break;
                case 3:
                    generateFibonacci(); // Call the generateFibonacci function
                    break;
                case 4:
                    System.out.println("\nThank you for playing!");  // Exit the program
                    break;
                default:
                    System.out.println("\nInvalid choice! Please select again."); // Invalid main menu choice
            }
        } while (choice != 4); // Continue until the user chooses to exit
    }

    // Even-Odd Game (QUESTION 1)
    public static void playEvenOdd() {
        int score = 0; // User's score
        int rounds = 0; // Number of rounds played
        System.out.println("\n\n\n\n\n***********************************************************************************");
        System.out.println("\t\tWELCOME TO THE EVEN-ODD GAME!");
        System.out.println("***********************************************************************************");
        System.out.println("\tThe computer will generate a random number between 1 and 100.");
        System.out.println("\tYour task is to guess whether the number is even or odd.");
        System.out.println("\tLet's begin!\n");

        while (true) {
            rounds++;
            int num = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            System.out.println("\nRound " + rounds);
            System.out.println("The computer has generated a number.");
            System.out.print("Guess: Is the number even or odd? (type 'even' or 'odd'): ");
            String guess = scanner.nextLine().toLowerCase();

            // Validate user input
            if (!guess.equals("even") && !guess.equals("odd")) {
                System.out.println("Invalid input! Please type 'even' or 'odd'."); // Handle invalid input
                rounds--; // Do not count this round
                continue; // Ask for input again
            }

            // Reveal the generated number
            System.out.println("The number was: " + num);
            // Check if the user's guess is correct
            if (isEven(num) && guess.equals("even") || !isEven(num) && guess.equals("odd")) {
                System.out.println("Correct! You've earned 1 point.");
                score++;
            } else {
                System.out.println("Wrong! No points this round.");
            }

            // Ask if the user wants to play another round
            String continuePlay;
            do {
            System.out.print("\nDo you want to play another round? (yes/no): ");
            continuePlay = scanner.nextLine().toLowerCase();
            if (!continuePlay.equals("yes") && !continuePlay.equals("no")) {
                System.out.println("Invalid input! Please type 'yes' or 'no'."); // Handle invalid input
            }
            } while (!continuePlay.equals("yes") && !continuePlay.equals("no")); // Continue until valid input

            if (continuePlay.equals("no")) {
            break; // Exit the game loop if the user does not want to play again
            }
        }

        // Display final score and rounds played
        System.out.println("\nGame Over!");
        System.out.println("You played " + rounds + " rounds.");
        System.out.println("Your total score is: " + score);
        System.out.println("Thank you for playing the Even-Odd Game!");
    }

    // Check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0; // Return true if the number is even
    }

    // Multiplication Quiz (QUESTION 2)
    public static void generateQuestion() {
        System.out.println("\n\n\n\n\n***********************************************************************************");
        System.out.println("\t\tWELCOME TO THE MULTIPLICATION QUIZ!");
        System.out.println("***********************************************************************************");
        System.out.println("\tTry to solve the questions or type 'skip' to move to the next question.");
        
        String continueQuiz; // Declare variable to store user's choice to continue the quiz
        
        do {
            int num1 = random.nextInt(12) + 1; // Random number between 1 and 12
            int num2 = random.nextInt(12) + 1; // Random number between 1 and 12
            int correctAnswer = num1 * num2; // Calculate the correct answer
            System.out.println("\nWhat is " + num1 + " x " + num2 + "? ");
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().toLowerCase();

            // Handle user input
            if (userAnswer.equals("skip")) {
                System.out.println("Skipping this question.");
            } else {
                boolean answeredCorrect = false; // Flag to check if the user answered correctly
                while (!answeredCorrect) {
                    int answer = Integer.parseInt(userAnswer); // Parse user input to an integer
                    if (answer == correctAnswer) {
                        System.out.println("Correct! Well done!");
                        answeredCorrect = true; // Mark as answered correctly
                    } else {
                        System.out.print("Incorrect. Try again."); 
                        System.out.print("\nYour Answer: ");
                        userAnswer = scanner.nextLine().toLowerCase();
                        if (userAnswer.equals("skip")) {
                            System.out.println("Skipping this question.");
                            answeredCorrect = true; // Exit the loop
                        }
                    }
                }
            }
            // Ask if the user wants to continue with the quiz
            do {
                System.out.print("\nDo you want to continue? (yes/no): ");
                continueQuiz = scanner.nextLine().toLowerCase();
                if (!continueQuiz.equals("yes") && !continueQuiz.equals("no")) {
                    System.out.println("Invalid input! Please type 'yes' or 'no'."); // Handle invalid input
                }
            } while (!continueQuiz.equals("yes") && !continueQuiz.equals("no")); // Continue until valid input
        } while (continueQuiz.equals("yes")); // Continue if the user wants to play more
        System.out.println("\nYou have completed the quiz!");
        System.out.println("Thank you for playing. Great job!");
    }

    // Fibonacci Series Generator (QUESTION 3)
    public static void generateFibonacci() {
        System.out.println("\n\n\n\n\n***********************************************************************************");
        System.out.println("\t\tWELCOME TO THE FIBONACCI SERIES GENERATOR!");
        System.out.println("***********************************************************************************");
        System.out.println("\tEnter the number of terms you want to generate.");    
        while (true) {
            int n;
            do {
                System.out.print("\nEnter the number of terms: ");
                n = scanner.nextInt();
                if (n < 1) {
                    System.out.println("Invalid input! Please enter a positive integer and greater than zero."); // Handle invalid input
                }
            } while (n < 1); // Ensure valid input which is integer values

            // Generate and display the Fibonacci series
            System.out.print("The first " + n + " terms of the Fibonacci series are: ");
            int[] fibonacciSeries = generateFibonacciSeries(n); // Generate Fibonacci series
            for (int i = 0; i < fibonacciSeries.length; i++) {
                System.out.print(fibonacciSeries[i]);
                if (i < fibonacciSeries.length - 1) {
                    System.out.print(", "); // Add comma for all but the last term
                }
            }
            System.out.println();

            // Ask if the user wants to continue generating Fibonacci series
            String continueFibonacci;
            do {
                System.out.print("\nDo you want to continue generating Fibonacci series? (yes/no): ");
                continueFibonacci = scanner.next().toLowerCase();
                if (!continueFibonacci.equals("yes") && !continueFibonacci.equals("no")) {
                    System.out.println("Invalid input! Please type 'yes' or 'no'."); // Handle invalid input
                }
            } while (!continueFibonacci.equals("yes") && !continueFibonacci.equals("no")); // Continue until valid input

            if (continueFibonacci.equals("no")) {
                break; // Exit the loop if the user does not want to continue
            }
        }
        System.out.println("\nThank you for using the Fibonacci Series Generator!");
    }

    // Generate Fibonacci series
    public static int[] generateFibonacciSeries(int n) {
        int[] fibonacci = new int[n]; // Create an array to hold Fibonacci numbers
        if (n > 0) 
            fibonacci[0] = 0; // First term
        if (n > 1) 
            fibonacci[1] = 1; // Second term
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; // Calculate subsequent terms
        }
        return fibonacci; // Return the array of Fibonacci numbers
    }
}