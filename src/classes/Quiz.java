package classes;

import java.util.List;


public class Quiz {
    private List<Question> questions;
    private int score;
    Question question = new Question();

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
        getQuestions().add(q);
    }

    public boolean checkAnswer(String answer) {
        return answer.equals(question.getCorrectAnswer());
    }

    public void displayScore() {

    }

    public void startQuiz() {
    }
}
