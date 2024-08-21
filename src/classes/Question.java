package classes;

import java.util.Arrays;

public class Question {
    private String questionText;
    private String[] options;
    private String correctAnswer;

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

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void askQuestion() {
        System.out.println(getQuestionText() + " /n" + Arrays.toString(getOptions()));
    }
}
