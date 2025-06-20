public class Main {
    public static void main(String[] args) {
        MySingleton s1 = MySingleton.getInstance();
        s1.showMessage("First call");

        MySingleton s2 = MySingleton.getInstance();
        s2.showMessage("Second call");

        if (s1 == s2) {
            System.out.println("Both instances are the same (Singleton works)");
        } else {
            System.out.println("Instances are different (Singleton failed)");
        }
    }
}
