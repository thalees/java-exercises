public class Programmer extends Person {

    private String question;

    public Programmer(String name) {
        super(name);
        setQuestion("How are you?");
    }

    @Override
    public String getSalutation() {
        return "Hello world";
    }

    public String getQuestion() {
        return question;
    }

    private void setQuestion(String question) {
        this.question = question;
    }
}
