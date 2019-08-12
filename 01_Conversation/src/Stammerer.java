public class Stammerer extends Person {

    public Stammerer(String name) {
        super(name);
    }

    @Override
    public String getPhrase() {
        return "Th-Th-Th-Th-Th-... That's all, folks.";
    }

    public void responds(Person person){
        System.out.println(this.getName() + ": " + this.getSalutation() + " " + person.getName());
        System.out.println(this.getName() + ": " + this.getPhrase());
    }
}
