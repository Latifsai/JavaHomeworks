package hw5;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class Seat {
    private String seatNumber;
    private boolean seatStatus;



    public long book() {
        if (seatStatus) {
            return (long) (1000 + Math.random() * 9999);
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNumber='" + seatNumber + '\'' +
                ", seatStatus=" + seatStatus +
                '}';
    }
}
