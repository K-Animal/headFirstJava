public class QuizCard {
    private String q;
    private String a;

    QuizCard(String question, String answer) {
        this.q = question;
        this.a = answer;
    }

    public String getQuestion(){
        return q;
    }

    public String getAnswer() {
        return a;
    }
}
