package worldPc.model;

public class Computer {

    private int idComputer;
    private String name;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    private static int countComputers;

    private Computer(){

        idComputer = ++countComputers;
    }

    public Computer(String name, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this(); //Inicializo el contador de cant. de computadoras
        this.name = name;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public int getIdComputer() {
        return idComputer;
    }

    public void setIdComputer(int idComputer) {
        this.idComputer = idComputer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }


    public float total(){
         float total= monitor.getPrice()+ keyboard.getPrice()+ mouse.getPrice();
        return total;
    }

    @Override
    public String toString() {
        return "\nComputadora: " +
                "\nid Computadora: "+idComputer +
                "\nNombre: "+name + "\n"+
                "\nmonitor: "+monitor +"\n"+
                "\nkeyboard: "+keyboard +"\n"+
                "\nMouse: "+mouse +
                "\n**************************************"+
                "\n*    Total pc Completa: $" + total() + "     *"+
                "\n**************************************";
    }
}
