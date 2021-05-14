public class OrderWork {
    public  static int orderNumber = 0;
    int OrderID;
    String ClientAdress;
    long clientTell;
    String clientName;

    long tecnicTel;
    int tecnicId;
    String tecnicName;

    public OrderWork(Tecnic Tecnic, Client Client, Engineer Engineer){
        this.OrderID = orderNumber;
        orderNumber++;
        this.tecnicName = Tecnic.name;
        this.tecnicId   = Tecnic.id;
        this.tecnicTel  = Tecnic.tel;
        this.clientName = Client.getName();
        this.clientTell = Client.getTell();
        this.ClientAdress = Client.getAddress();
    }
}
