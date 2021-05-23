package Model;

import java.util.Arrays;

public class Tecnic extends personalData {
    public static int id = 0;
    private int ID;

    private boolean disponibiliy;
    private String[] tools;
    private String bonus;
    //Clase anidada como productividad

    public Tecnic(String name, String lastname, String tell){
        super(name, lastname, tell);
        this.ID = id;
        id++;
    }

    public Tecnic(String name, String lastname, String tell, boolean disponibiliy, String[] tools){
        super(name, lastname, tell);
        this.ID = id;
        this.disponibiliy = disponibiliy;
        this.tools = tools;
        id++;
    }

    public static int getId() {
        return id;
    }

    public int getID() {
        return ID;
    }

    public boolean isDisponibiliy() {
        return disponibiliy;
    }

    public void setDisponibiliy(boolean disponibiliy) {
        this.disponibiliy = disponibiliy;
    }

    public String[] getTools() {
        return tools;
    }

    public void setTools(String[] tools) {
        this.tools = tools;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return
                "ID = " + ID + super.toString() +
                ", disponibiliy = " + disponibiliy +
                ", tools = " + Arrays.toString(tools) +
                ", bonus = '" + bonus + '\'' +
                '\n';
    }
}


