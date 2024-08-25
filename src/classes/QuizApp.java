package classes;

import java.util.Scanner;

public class QuizApp {
    private final Quiz QUIZ = new Quiz();
    private final Scanner SCANNER_INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        QuizApp app = new QuizApp();
        app.displayMainMenu();
    }

    public void displayMainMenu() {
        while (true) {
            System.out.println("Welcome to the Quiz App\n1. Start New Quiz\n2. Show Instructions\n3. Exit");
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
        while (!SCANNER_INPUT.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            SCANNER_INPUT.next(); // Clear invalid input
        }
        return SCANNER_INPUT.nextInt();
    }

    public void startNewQuiz() {
        QUIZ.chooseDifficulty(); // Setup quiz with questions
        QUIZ.startQuiz(); // Start the quiz
    }

    public void showInstructions() {
        System.out.println("Instructions:\n1. The quiz will present a series of questions.\n2. Enter the number corresponding to your answer.\n3. After answering all questions, your score will be displayed.");
    }
}
