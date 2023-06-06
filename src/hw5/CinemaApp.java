package hw5;

public class CinemaApp {
    public static void main(String[] args) {
        

        Seat[] seats = {
                new Seat("N1", false),
                new Seat("N3", false),
                new Seat("N4", true),
                new Seat("N5", false)
        };

        for (Seat seat : seats) {
            if (seat.book() != -1) {
                System.out.println("Number of ticket: " + seat.book());
            }else {
                System.out.println("Seat is full");
            }
        }


    }
}
