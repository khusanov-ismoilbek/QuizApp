package uz.gita.quizappOracle.model;

public class ModelApp {
    private String question;
    private String correctAnswer;
    private String keyA;
    private String keyB;
    private String keyC;
    private String keyD;
    private String keyE;
    private String keyF;
    private String answerDefinition;

    public ModelApp(String question, String correctAnswer, String keyA, String keyB, String keyC, String keyD, String keyE, String keyF, String answerDefinition) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.keyA = keyA;
        this.keyB = keyB;
        this.keyC = keyC;
        this.keyD = keyD;
        this.keyE = keyE;
        this.keyF = keyF;
        this.answerDefinition = answerDefinition;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getKeyA() {
        return keyA;
    }

    public String getKeyB() {
        return keyB;
    }

    public String getKeyC() {
        return keyC;
    }

    public String getKeyD() {
        return keyD;
    }

    public String getKeyE() {
        return keyE;
    }

    public String getKeyF() {
        return keyF;
    }

    public String getAnswerDefinition(){
        return answerDefinition;
    }
}