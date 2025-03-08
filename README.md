Project Tittle: Advance Java Programming Challenges

Overview

This Java application consists of three advance programming challenges:

1. Even-Odd Game: A game where the user guesses whether a randomly generated number between 1 and 100 is even or odd.

2. Multiplication Quiz: A quiz that requires users to answer random multiplication questions between numbers 1 and 12.

3. Fibonacci Series Generator: A program that generates and displays the Fibonacci series up to a specified number of terms from the user.


Program Structure

The program is structured into a single class named JavaChallanges, which contains the following methods:

1. main(String[] args): The entry point of the program. It displays a main menu for the user to select a task.

2. playEvenOdd(): Implements the Even-Odd Game.

3. generateQuestion(): Implements the Multiplication Quiz.

4. generateFibonacci(): Implements the Fibonacci Series Generator.

5. isEven(int number): A method to determine if a given number is even.

6. generateFibonacciSeries(int n): Generates the Fibonacci series up to n terms.


User instructions:

1) Main Menu: Upon starting the program, a main menu will be displayed with the following options:

1: Even-Odd Game
2: Multiplication Quiz
3: Fibonacci Series Generator
4: Exit the Program


2) Selecting a Task: Enter the number that corresponds to the task user want to select and press Enter. If the user enter number other than 1-4, it will display the main menu functions again.

3) Even-Odd Game:

- The program will generate a random number between 1 and 100.
- User will be prompted to guess whether the number is even or odd by typing "even" or "odd". 
- If user enters wrong input, it will display invalid input message and need to enter correct input again.
- User can choose to play multiple rounds by typing "yes" or "no".
- If the user does not want to continue the game, the program will display how many rounds the user has played and the total score the user has earned before the program will return to the main menu.


4) Multiplication Quiz:

- The program will present random multiplication questions between numbers 1 and 12.
- User can answer the question or type skip to move to the next question.
- If the user enters an incorrect answer, the program allows the user to answer the question again.
- User can choose to continue answering questions by typing "yes" or "no". If the user types "no" it will return to the main menu.


5) Fibonacci Series Generator:

- User will be prompted to enter the number of terms to be generated in the Fibonacci series.
- User need to enter only integer values ​​that are positive numbers and greater than zero.
- If user enters wrong input, it will display invalid input message and need to enter correct input again.
- The program will display the generated Fibonacci series based on user input.
- User can choose to continue generating Fibonacci series by typing "yes" or "no". If the user types "no" it will return to the main menu.
 

6) Exiting the Program: To exit the program, select option 4 from the main menu.




