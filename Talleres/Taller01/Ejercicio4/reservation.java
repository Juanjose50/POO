package Talleres.Taller01.Ejercicio4;
public class reservation {
    private String guest;
    private int roomNumber;
    private int numberOfNights;
    private double pricePerNight;

    public reservation(String guest, int roomNumber, int numberOfNights, double pricePerNight) {
        this.guest = (guest != null && !guest.trim().isEmpty()) ? guest : "Unknown";
        this.roomNumber = (roomNumber > 0) ? roomNumber : 101;
        this.numberOfNights = (numberOfNights > 0) ? numberOfNights : 1;
        this.pricePerNight = (pricePerNight > 0) ? pricePerNight : 100.0;
    }

    public String getGuest() {
        return guest;
    }

    public boolean setGuest(String guest) {
        if (guest != null && !guest.trim().isEmpty()) {
            this.guest = guest;
            return true;
        }
        return false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean setRoomNumber(int roomNumber) {
        if (roomNumber > 0) {
            this.roomNumber = roomNumber;
            return true;
        }
        return false;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean setNumberOfNights(int numberOfNights) {
        if (numberOfNights > 0) {
            this.numberOfNights = numberOfNights;
            return true;
        }
        return false;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean setPricePerNight(double pricePerNight) {
        if (pricePerNight > 0) {
            this.pricePerNight = pricePerNight;
            return true;
        }
        return false;
    }

    public double getTotalCost() {
        return numberOfNights * pricePerNight;
    }
}