package classes;

import java.util.Scanner;

public class QuizApp {
    private Quiz quiz = new Quiz();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        QuizApp app = new QuizApp();
        app.displayMainMenu();
    }

    public void displayMainMenu() {
        while (true) {
            System.out.println("Welcome to the Quiz App");
            System.out.println("1. Start New Quiz");
            System.out.println("2. Show Instructions");
            System.out.println("3. Exit");

            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    startNewQuiz();
                    break;
                case 2:
                    showInstructions();
                    break;
                case 3:
                    System.out.println("Thank you for using the Quiz App!");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextInt();
    }

    public void startNewQuiz() {
        quiz.createQuestions(); // Setup quiz with questions
        quiz.startQuiz(); // Start the quiz
    }

    public void showInstructions() {
        System.out.println("Instructions:");
        System.out.println("1. The quiz will present a series of questions.");
        System.out.println("2. Enter the number corresponding to your answer.");
        System.out.println("3. After answering all questions, your score will be displayed.");
    }
}
