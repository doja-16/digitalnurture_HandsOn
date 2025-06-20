public class MySingleton {
    private static MySingleton instance;

    private MySingleton() {
        System.out.println("MySingleton initialized");
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }

    public void showMessage(String message) {
        System.out.println("Message: " + message);
    }
}
