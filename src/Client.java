public class Client extends personalData {
    public static int id = 0;
    private int ID;

    private String Address;
    private String latitud;
    private String longitud;
    private double mensualidad;

    Client(String name, String tell, String address){
        super(name, tell);
        this.ID = id;
        this.Address = address;
        id++;
    }

    Client(String name, String lastname, String tell, String address){
        super(name, lastname, tell);
        this.ID = id;
        this.Address = address;
        id++;
    }


    Client(String name, String lastname, String tell, String address, String latitud, String longitud){
        super(name, lastname, tell);
        this.ID = id;
        this.latitud = latitud;
        this.longitud = longitud;
        id++;
    }

    public int getID() {
        return ID;
    }

    public String getAddress() {
        return Address;
    }

    public String getLatitud() {
        return latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return
                "ID= " + ID + ", name='" + super.getName() + '\'' +
                ", lastname= '" + super.getLastname() + '\'' +
                ", tell= '" + super.getTell() + '\'' +
                ", Address= '" + Address + '\'' +
                ", latitud= '" + latitud + '\'' +
                ", longitud= '" + longitud + '\'' +
                "}\n";
    }
}
