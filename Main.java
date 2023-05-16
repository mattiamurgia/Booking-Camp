public class Main {
    public static void main(String[] args) {
        Camp calcio1 = new Camp("Calcio a 5", 2);
        Booking a = new Booking(calcio1, 12.50, false, "Francesco");
        a.addReservation(calcio1, 10, false, "Francesco");
        Camp calcio2 = new Camp("Basket", 5);
        Booking b = new Booking(calcio2, 20, true, "Alessandro");
        a.addReservation(calcio2, 20, true, "Alessandro");

        System.out.println(calcio1.getNameCampsString());
        System.out.println(a.toString());
        System.out.println(calcio2.getNameCampsString());
        System.out.println(b.toString());

    }

}
