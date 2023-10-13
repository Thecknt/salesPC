package worldPc.model;

public class Monitor {

    private final int idMonitor;

    private String brand;
    private double size;
    private float price;

    private static int countMonitors;

    private Monitor() {
        idMonitor = ++countMonitors;
    }

    public Monitor(String brand, double size, float price) {
        this(); //inicializo el constructor idMonitor, junto al contador de monitores
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static int getCountMonitors() {
        return countMonitors;
    }

    public static void setCountMonitors(int countMonitors) {
        Monitor.countMonitors = countMonitors;
    }

    @Override
    public String toString() {
        return "\nDatos del Monitor: " +
                "\nId Monitor: " + idMonitor +
                "\nMarca: " + brand +
                "\nTamaño: " + size +
                "\nPrecio: $"+price;
    }
}
