public class Client {
    public static int id = 0;
    private int ID;
    private String lastname;
    private long tell;
    private String Address;
    private String latitud;
    private String longitud;

    Client(String name, long tell, String address){
        this.ID = id;
        this.name = name;
        this.tell = tell;
        this.Address = address;
        id++;
    }

    Client(String name, String lastname, long tell, String address){
        this.ID = id;
        this.name = name;
        this.lastname = lastname;
        this.tell = tell;
        this.Address = address;
        id++;
    }

    Client(String name, long tell, String address,String latitud, String longitud ){
        this.ID = id;
        this.name = name;
        this.tell = tell;
        this.Address = address;
        this.latitud = latitud;
        this.longitud = longitud;
        id++;
    }

    Client(String name, String lastname, long tell, String address, String latitud, String longitud){
        this.ID = id;
        this.name = name;
        this.lastname = lastname;
        this.tell = tell;
        this.latitud = latitud;
        this.longitud = longitud;
        id++;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public long getTell() {
        return tell;
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

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setTell(long tell) {
        if (tell.length() != 10) {
            return "Error"
        } else {
            this.tell = tell;
        }

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

}
