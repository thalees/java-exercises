public class Main {
    public static void main(String[] args){
        Programmer programmer = new Programmer("John");
        Stammerer stammerer = new Stammerer("PorkyPig");

        programmer.greet(stammerer);
        stammerer.responds(programmer);
    }
}
