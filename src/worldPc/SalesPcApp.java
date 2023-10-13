package worldPc;

import worldPc.model.Computer;
import worldPc.model.Keyboard;
import worldPc.model.Monitor;
import worldPc.model.Mouse;
import worldPc.service.Order;

public class SalesPcApp {
    public static void main(String[] args) {

        Mouse mouseLenovo = new Mouse("Bluetooth", "lenovo", 950);

        Keyboard KeyboardLenovo = new Keyboard("usb", "Lenovo", 850);

        Monitor monitorLenovo = new Monitor("Lenovo", 24.5, 25000);

        Computer computerLenovo = new Computer("PC Lenovo",monitorLenovo,KeyboardLenovo,mouseLenovo);

        float total=0;
        float total2=0;
        Monitor monitorDell = new Monitor("Dell",26,40000);
        Keyboard KeyboardDell = new Keyboard("USB 3.0","Dell",1050);
        Mouse mouseDell = new Mouse("Bluetooth","Dell",1020);
        Computer computerDell = new Computer("Pc Dell desk",monitorDell, KeyboardDell,mouseDell);
        Order order1 = new Order();
        order1.addComputer(computerLenovo);
        order1.addComputer(computerDell);
        order1.showOrder();
        total = computerDell.total() + computerLenovo.total();
        System.out.println("***********************************************");
        System.out.println("* El total entre las ordenes es: $"+total+"     *");
        System.out.println("***********************************************");

        Monitor monitorMac = new Monitor("Mac", 24, 60000);
        Keyboard KeyboardMac = new Keyboard("USB","Mac",2000);
        Mouse mouseMac = new Mouse("Bluetooth","Mac", 1800);
        Computer computerMac = new Computer("Mac",monitorMac,KeyboardMac,mouseMac);
        Order order2 = new Order();
        order2.addComputer(computerLenovo);
        order2.addComputer(computerMac);
        order2.addComputer(computerDell);
        order2.showOrder();
        total2 = computerDell.total() + computerMac.total() +computerLenovo.total();
        System.out.println("***********************************************");
        System.out.println("* El total entre las ordenes es: $"+total2+"    *");
        System.out.println("***********************************************");


    }
}