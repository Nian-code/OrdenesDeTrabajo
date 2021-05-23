package Model;

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
    Boolean status;

    public OrderWork(Tecnic Tecnic, Client Client, Engineer Engineer){
        this.date    = new Date();
        this.OrderID = orderNumber;
        orderNumber++;
        this.EngineerName = Engineer.getName();
        this.tecnicName = Tecnic.getName();
        this.tecnicId   = Tecnic.getID();
        this.tecnicTel  = Tecnic.getTell();
        this.clientName = Client.getName();
        this.clientTell = Client.getTell();
        this.ClientAdress = Client.getAddress();
    }

    public int getOrderID() {
        return OrderID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Model.OrderWork{" +
                "date=" + date +
                ", EngineerName='" + EngineerName + '\'' +
                ", clientTell='" + clientTell + '\'' +
                ", clientName='" + clientName + '\'' +
                ", ClientAdress='" + ClientAdress + '\'' +
                ", tecnicTel='" + tecnicTel + '\'' +
                ", tecnicId=" + tecnicId +
                ", tecnicName='" + tecnicName + '\'' +
                '}';
    }
}
