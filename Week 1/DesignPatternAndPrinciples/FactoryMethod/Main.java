public class Main {
    public static void main(String[] args) {
        TransportFactory factory = new TransportFactory();

        Transport t1 = factory.getTransport("bike");
        t1.deliver();

        Transport t2 = factory.getTransport("truck");
        t2.deliver();
    }
}
