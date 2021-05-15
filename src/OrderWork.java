import java.util.Date;

public class OrderWork {
    public  static int orderNumber = 0;

    int OrderID;
    Date date;
    String EngineerName;
    String ClientAdress;
    String clientTell;
    String clientName;
    String tecnicTel;
    int tecnicId;
    String tecnicName;

    public OrderWork(Tecnic Tecnic, Client Client, Engineer Engineer){
        this.date    = new Date();
        this.OrderID = orderNumber;
        orderNumber++;
        this.EngineerName = Engineer.getName();
        this.tecnicName = Tecnic.getName();
        this.tecnicId   = Tecnic.id;
        this.tecnicTel  = Tecnic.getTel();
        this.clientName = Client.getName();
        this.clientTell = Client.getTell();
        this.ClientAdress = Client.getAddress();
    }

    public Date getDate() {
        return date;
    }

    public int getOrderID() {
        return OrderID;
    }

    public String getEngineerName() {
        return EngineerName;
    }

    public void setEngineerName(String engineerName) {
        EngineerName = engineerName;
    }

    public String getClientAdress() {
        return ClientAdress;
    }

    public void setClientAdress(String clientAdress) {
        ClientAdress = clientAdress;
    }

    public String getClientTell() {
        return clientTell;
    }

    public void setClientTell(String clientTell) {
        this.clientTell = clientTell;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getTecnicTel() {
        return tecnicTel;
    }

    public void setTecnicTel(String tecnicTel) {
        this.tecnicTel = tecnicTel;
    }

    public int getTecnicId() {
        return tecnicId;
    }

    public void setTecnicId(int tecnicId) {
        this.tecnicId = tecnicId;
    }

    public String getTecnicName() {
        return tecnicName;
    }

    public void setTecnicName(String tecnicName) {
        this.tecnicName = tecnicName;
    }
}
