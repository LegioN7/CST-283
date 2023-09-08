public class JeopardyQuestion {

    private final String showDate;
    private final String round;
    private final String category;
    private final String value;
    private final String question;
    private final String answer;

    public JeopardyQuestion(String showDate, String round, String category, String value, String question, String answer) {
        this.showDate = showDate;
        this.round = round;
        this.category = category;
        this.value = value;
        this.question = question;
        this.answer = answer;
    }

    public String getShowDate() {
        return showDate;
    }

    public String getRound() {
        return round;
    }

    public String getCategory() {
        return category;
    }

    public String getValue() {
        return value;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "JeopardyQuestion{" +
                "showDate='" + showDate + '\'' +
                ", round='" + round + '\'' +
                ", category='" + category + '\'' +
                ", value='" + value + '\'' +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
