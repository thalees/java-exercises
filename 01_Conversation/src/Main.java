public class Main {
    public static void main(String[] args){
        Programmer programmer = new Programmer("Maua");
        Stammerer stammerer = new Stammerer("porkyPig");

        System.out.println(programmer.getSalutation());
        System.out.println(stammerer.getSalutation());
        System.out.println(programmer.getQuestion());
        System.out.println(stammerer.getPhrase());
    }
}
