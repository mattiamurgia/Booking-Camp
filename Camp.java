import java.util.ArrayList;

public class Camp {
    public String name;// Nome del campo da gioco
    public int numbers; // Numero campo
    public ArrayList<Camp> camps = new ArrayList<Camp>();// Tutti i campi

    public Camp(String name, int numbers) {
        this.name = name;
        this.numbers = numbers;

    }

    public void addCamp(String name, int numbers) {
        Camp a = new Camp(name, numbers);
        camps.add(a);
    }

    public String getNameCampsString() {
        return name;
    }

    public ArrayList<Camp> getCamps() {
        return camps;
    }
}
