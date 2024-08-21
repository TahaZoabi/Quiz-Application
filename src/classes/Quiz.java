package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions = new ArrayList<>();
    private int score;
    private Scanner scanner = new Scanner(System.in);

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public boolean checkAnswer(Question question, String answer) {
        return answer.equalsIgnoreCase(question.getCorrectAnswer());
    }

    public void displayScore() {
        System.out.println("Your Final Score is: " + score);
    }

    public void startQuiz() {
        for (Question question : questions) {
            question.askQuestion();
            String userAnswer = scanner.nextLine();
            if (checkAnswer(question, userAnswer)) {
                score++;
                System.out.println("Correct Answer!");
            }
            else {
                System.out.println("Incorrect, The correct answer was: " + question.getCorrectAnswer());
            }
        }
        displayScore();
    }

    public void createQuestions() {
        // Create and add questions here
        addQuestion(new Question("What is the default value of a boolean variable in Java?", new String[]{"true", "false", "null", "0"}, "false"));
        addQuestion(new Question("Which keyword is used to define a constant in Java?", new String[]{"const", "final", "static", "constant"}, "final"));
        addQuestion(new Question("What does JVM stand for?", new String[]{"Java Virtual Machine", "Java Variable Manager", "Java Visual Maker", "Java Virtual Manager"}, "Java Virtual Machine"));
        addQuestion(new Question("Which method is used to start the execution of a Java program?", new String[]{"start()", "main()", "run()", "execute()"}, "main()"));
        addQuestion(new Question("What is the term used for a class that cannot be instantiated?", new String[]{"Abstract class", "Final class", "Static class", "Interface"}, "Abstract class"));
        addQuestion(new Question("Which of the following is an example of inheritance in Java?", new String[]{"class Dog extends Animal", "class Dog implements Animal", "class Dog uses Animal", "class Dog creates Animal"}, "class Dog extends Animal"));
    }
}
