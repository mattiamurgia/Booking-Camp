import java.util.ArrayList;

public class Booking {
    public Camp name; // Nome del campo da gioco
    public double price; // Prezzo del campo da gioco
    public boolean availability = true; // Se è disponibile
    public String person; // Chi lo prenota
    public ArrayList<Camp> camps = new ArrayList<Camp>(); // Totale campi prenotati
    public ArrayList<Booking> reservation = new ArrayList<Booking>(); // Lista prenotazioni

    // Costruttore
    public Booking(String person) {
        this.person = person;
    }

    public Booking(Camp name, double price, boolean availability, String person) {
        this.name = name;
        this.price = price;
        this.availability = availability;
        this.person = person;

    }

    // Aggiunta di una prenotazione
    public void addReservation(Camp name, double price, boolean availability, String person) {
        Booking a = new Booking(name, price, availability, person);
        reservation.add(a);

    }

    public ArrayList<Camp> getCamps() {
        return camps;
    }

    public Camp getName() {
        return name;
    }

    public String getPerson() {
        return person;
    }

    // ToString
    public String toString() {
        return "The reserved field is: " + this.name + "\n" +
                "The price is: " + this.price + "\n"
                + "Was booked by: " + this.person + "\n";
    }

}
