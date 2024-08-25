package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions = new ArrayList<>();
    private int score;
    private final Scanner SCANNER_INPUT = new Scanner(System.in);

    public List<Question> getQuestions() {
        return questions;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public boolean checkAnswer(Question question, int answer) {
        return answer == question.getCorrectAnswerIndex();
    }

    public void displayScore() {
        System.out.println("Your Final Score is: (" + score + "/" + getQuestions().size() + ")");
    }

    public void startQuiz() {
        for (Question question : questions) {
            question.askQuestion();
            int userAnswer = SCANNER_INPUT.nextInt();
            if (checkAnswer(question, userAnswer)) {
                score++;
                System.out.println("Correct Answer!");
            }
            else {
                System.out.println("Incorrect, The correct answer was: " + question.getCorrectAnswerIndex());
            }
        }
        displayScore();
    }

    public void chooseDifficulty() {
        int level;
        do {
            System.out.println("Choose a difficulty level!\n1) Easy\n2) Medium\n3) Hard");
            level = SCANNER_INPUT.nextInt();

            switch (level) {
                case 1:
                    generateEasyQuestions();
                    break;
                case 2:
                    generateMediumQuestions();
                    break;
                case 3:
                    generateHardQuestions();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid difficulty level.");
            }
        } while (level < 1 || level > 3);
    }


    public void generateEasyQuestions() {
        addQuestion(new Question("What is the default value of a boolean variable in Java?", new String[]{"true", "false", "null", "0"}, "false"));

        addQuestion(new Question("What is the size of a char in Java?", new String[]{"1 byte", "2 bytes", "4 bytes", "8 bytes"}, "2 bytes"));

        addQuestion(new Question("Which keyword is used to define a constant in Java?", new String[]{"static", "final", "const", "immutable"}, "final"));

        addQuestion(new Question("What is the correct way to declare an array of integers in Java?", new String[]{"int[] arr;", "int arr[];", "int arr;", "int[] arr = new int();"}, "int[] arr;"));

        addQuestion(new Question("How do you create a new instance of a String in Java?", new String[]{"String str = new String();", "String str = new String(\"text\");", "String str = \"text\";", "All of the above"}, "All of the above"));

    }

    public void generateMediumQuestions() {
        addQuestion(new Question("What will be the output of the following code snippet? \nint a = 5; \nint b = 10; \nSystem.out.println(a + b);", new String[]{"15", "510", "Error", "None of the above"}, "15"));

        addQuestion(new Question("Which method is used to find the length of an array in Java?", new String[]{"length()", "size()", "length", "getSize()"}, "length"));

        addQuestion(new Question("What is the result of the expression 10 / 3 in Java?", new String[]{"3", "3.0", "3.333", "Error"}, "3"));

        addQuestion(new Question("Which access modifier makes a member visible only within its own package?", new String[]{"private", "protected", "default", "public"}, "default"));

        addQuestion(new Question("What does the keyword 'static' signify when applied to a method?", new String[]{"The method can only be accessed by instances of the class", "The method belongs to the class, not instances", "The method is synchronized", "The method is abstract"}, "The method belongs to the class, not instances"));

    }

    public void generateHardQuestions() {
        addQuestion(new Question("What will be the output of the following code snippet? \nint[] arr = {1, 2, 3}; \nSystem.out.println(arr[3]);", new String[]{"1", "2", "3", "ArrayIndexOutOfBoundsException"}, "ArrayIndexOutOfBoundsException"));

        addQuestion(new Question("What is the result of the following operation: 5 << 1?", new String[]{"10", "5", "2", "20"}, "10"));

        addQuestion(new Question("Which of the following is not a valid method signature in Java?", new String[]{"void method(int a);", "void method(int a, int b);", "void method(int a, int a);", "void method();"}, "void method(int a, int a);"));

        addQuestion(new Question("What will be the result of the following code snippet? \nString s1 = \"Hello\"; \nString s2 = \"Hello\"; \nSystem.out.println(s1 == s2);", new String[]{"true", "false", "Error", "None of the above"}, "true"));

        addQuestion(new Question("What is the result of the following operation: \nSystem.out.println(5 / 2.0);", new String[]{"2", "2.5", "2.0", "Error"}, "2.5"));

    }
}
