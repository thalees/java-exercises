public class Programmer extends Person {

    private String question;

    public Programmer(String name) {
        super(name);
        this.question = "How are you?";
    }

    @Override
    public String getSalutation() {
        return "Hello world";
    }

    public String getQuestion() {
        return question;
    }
}
