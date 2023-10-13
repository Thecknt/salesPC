package worldPc.model;

public class InputDevice {

    private String inputType;
    private String brand;
    private float price;

    public InputDevice() {
    }

    public InputDevice(String inputType, String brand, float price) {
        this.inputType = inputType;
        this.brand = brand;
        this.price = price;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nDispositivos ->" +
                "\nTipo de conexion: " + inputType  +
                "\nMarca: " + brand +
                "\nPrecio: $"+price;
    }
}
