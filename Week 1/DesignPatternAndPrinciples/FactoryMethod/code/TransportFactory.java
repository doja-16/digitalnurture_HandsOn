public class TransportFactory {
    public Transport getTransport(String type) {
        if (type.equalsIgnoreCase("car")) return new Car();
        else if (type.equalsIgnoreCase("bike")) return new Bike();
        else if (type.equalsIgnoreCase("truck")) return new Truck();
        return null;
    }
}
