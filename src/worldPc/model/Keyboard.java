package worldPc.model;

public class Keyboard extends InputDevice{

    private final int idKeyboard;

    private static int countKeyboard;

    public Keyboard(String inputType, String brand, float price) {
        super(inputType, brand, price);
        idKeyboard = ++countKeyboard;
    }

    public int getIdKeyboard() {
        return idKeyboard;
    }

    public static int getCountKeyboard() {
        return countKeyboard;
    }

    public static void setCountKeyboard(int countKeyboard) {
        Keyboard.countKeyboard = countKeyboard;
    }

    @Override
    public String toString() {
        return "\nTeclado: " +
                "\nid: " + idKeyboard +
                "\nCantidad: "+ countKeyboard +
                super.toString();
    }
}
