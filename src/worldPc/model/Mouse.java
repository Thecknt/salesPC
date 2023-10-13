package worldPc.model;

public class Mouse extends InputDevice{

    private final int idMouse;
    private static int countMouse;


    public Mouse(String inputType, String brand, float price) {
        super(inputType, brand, price);
        idMouse = ++countMouse;
    }

    public int getIdMouse() {
        return idMouse;
    }

    public static int getCountMouse() {
        return countMouse;
    }

    public static void setCountMouse(int countMouse) {
        Mouse.countMouse = countMouse;
    }

    @Override
    public String toString() {
        return "\nMouse id: " + idMouse +
                "\nCantidad de Mouse en pedido: "+ countMouse +
                super.toString();  //llamo al metodo to string del padre,
                                  // asi me muestra el resto de los atributos.
    }
}
