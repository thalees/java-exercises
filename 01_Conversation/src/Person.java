public class Person {

    private String name;
    private String salutation;
    private String phrase;

    public Person(String name) {
        this.name = name;
        this.salutation = "Hello";
        this.phrase = "I'm happy";
    }

    public void greet (Person person) {
        System.out.println(this.name + ": "  + this.salutation + " " + person.name);
        System.out.println(this.name + ": " + this.phrase);
    }

    public String getName() {
        return name;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getPhrase() {
        return phrase;
    }
}
