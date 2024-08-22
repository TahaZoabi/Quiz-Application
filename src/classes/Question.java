package classes;

public class Question {
    private final String questionText;
    private final String[] options;
    private final String correctAnswer;

    public Question(String questionText, String[] options, String correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }
    
    public int getCorrectAnswerIndex() {
        for (int i = 0; i < options.length; i++) {
            if (options[i].equalsIgnoreCase(correctAnswer)) {
                return i + 1;
            }
        }
        return -1;
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
