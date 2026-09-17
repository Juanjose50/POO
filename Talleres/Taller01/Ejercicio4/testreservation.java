package Talleres.Taller01.Ejercicio4;

public class testreservation {
    public static void main(String[] args) {
        
        reservation reservation = new reservation("Carlos Mendoza", 204, 3, 150.0);

        System.out.println("INFORMACION RESERVA");
        System.out.println("Huesped: " + reservation.getGuest());
        System.out.println("Habitacion: " + reservation.getRoomNumber());
        System.out.println("Noches: " + reservation.getNumberOfNights());
        System.out.println("Precio por noche: $" + reservation.getPricePerNight());
        System.out.println("Costo Total: $" + reservation.getTotalCost());

        System.out.println("MODIFICACIONES");
        
        boolean nightsSuccess = reservation.setNumberOfNights(5);
        System.out.println("Cambiar noches a 5: " + (nightsSuccess ? "ACEPTADO" : "RECHAZADO"));
        System.out.println("Nuevo Costo Total: $" + reservation.getTotalCost());

        boolean priceSuccess = reservation.setPricePerNight(200.0);
        System.out.println("Cambiar precio por noche a $200.0: " + (priceSuccess ? "ACEPTADO" : "RECHAZADO"));
        System.out.println("Nuevo Costo Total: $" + reservation.getTotalCost());

        System.out.println("MODIFICACIONES NO PERMITIDAS");

        nightsSuccess = reservation.setNumberOfNights(0);
        System.out.println("Cambiar noches a 0: " + (nightsSuccess ? "ACEPTADO" : "RECHAZADO"));

        priceSuccess = reservation.setPricePerNight(-50.0);
        System.out.println("Cambiar precio por noche a -$50.0: " + (priceSuccess ? "ACEPTADO" : "RECHAZADO"));

        boolean guestSuccess = reservation.setGuest("   ");
        System.out.println("Cambiar huesped a texto vacio: " + (guestSuccess ? "ACEPTADO" : "RECHAZADO"));

        System.out.println("ESTADO FINAL DE LA RESERVA");
        System.out.println("Huesped: " + reservation.getGuest());
        System.out.println("Noches: " + reservation.getNumberOfNights());
        System.out.println("Precio por noche: $" + reservation.getPricePerNight());
        System.out.println("Costo Total Consistente: $" + reservation.getTotalCost());
    }
}
