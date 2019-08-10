public class Person {

    private String name;
    private String salutation;
    private String phrase;

    public Person(String name) {
        setName(name);
        setSalutation("Hello");
        setPhrase("I'm happy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalutation() {
        return salutation;
    }

    private void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getPhrase() {
        return phrase;
    }

    private void setPhrase(String phrase) {
        this.phrase = phrase;
    }
}
