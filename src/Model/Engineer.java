package Model;

import Interfaces.ICliente;


public class Engineer extends personalData implements ICliente{

    public static int id = 0;
    private int ID;
    private String speciality;
    private String email;

    public Engineer(String name, String tell){
        super(name, tell);
        this.ID   = id;
        id++;
    }


    public int getID() {
        return ID;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ID = " + ID + " " + super.toString() +
                "name = '" + this.getSpeciality() +
                "lastname = '" + this.getEmail()+
                "\n";
    }


    public void LlamarClientes(Client client) {
        System.out.println("Llamando a " + client.getName());
    }


    public void RecibirOrdenes(OrderWork orderWork) {
        orderWork.setStatus(true);
        System.out.println("Order ID: " + orderWork.getOrderID() + " was recibed");
    }


}
