package beans;

public class QuestionBean implements java.io.Serializable {

    private String category = null;
    private String question = null;
    private String answer = null;
    private String a1, a2, a3, a4 = null;
    private String lbl = null;
    private int value = 0;
    private int bet = 0;
    private int[] chosen;

    private boolean daily = false;
    private boolean answered = false;

    public QuestionBean() {

    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getLbl() {
        return lbl;
    }

    public void setLbl(String lbl) {
        this.lbl = lbl;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public int[] getChosen() {
        return chosen;
    }

    public void setChosen(int[] chosen) {
        this.chosen = chosen;
    }

    public boolean isDaily() {
        return daily;
    }

    public void setDaily(boolean daily) {
        this.daily = daily;
    }

    public boolean isAnswered() {
        return answered;
    }

    public void setAnswered(boolean answered) {
        this.answered = answered;
    }

}
