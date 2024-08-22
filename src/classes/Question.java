package classes;


import java.util.Arrays;

public class Question {
    private String questionText;
    private String[] options;
    private String correctAnswer;

    public Question(String questionText, String[] options, String correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public Question() {

    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getCorrectAnswer() {
        for (int i = 0; i < options.length; i++) {
            if (options[i].equalsIgnoreCase(correctAnswer)) {
                return i + 1;
            }
        }
        return -1;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void displayOptions(String[] options) {
        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ") " + options[i - 1]);
        }
    }

    public void askQuestion() {
        System.out.println(getQuestionText());
        displayOptions(getOptions());

    }
}
