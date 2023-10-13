package worldPc.service;

import worldPc.model.Computer;

import java.util.ArrayList;
import java.util.List;

public class Order {
private final int idOrder;
private final List<Computer>computers;

private static int countOrders;

public Order(){
    computers = new ArrayList<>();
    this.idOrder = ++countOrders;
}

public void addComputer(Computer computer){
    computers.add(computer);
}

public void showOrder(){
    System.out.println("\nOrden #: "+idOrder);
    System.out.println("Total de PCs: "+computers.size());
    //System.out.println();
    computers.forEach(System.out::println); // Muestro con esta funcion cada uno de los objetos
}
}
