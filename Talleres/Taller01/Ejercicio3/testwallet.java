package Talleres.Taller01.Ejercicio3;
public class testwallet {
    public static void main(String[] args) {
        wallet wallet = new wallet("Juan Betancur");
        System.out.println("Billetera creada de: " + wallet.getOwner() + " | Saldo inicial: $" + wallet.getBalance());

        System.out.println("Recarga $800.000: " + (wallet.topUp(800000.0) ? "EXITOSA" : "RECHAZADA") 
                           + " | Saldo: $" + wallet.getBalance());

        System.out.println("Recarga -$50.000: " + (wallet.topUp(-50000.0) ? "EXITOSA" : "RECHAZADA") 
                           + " | Saldo: $" + wallet.getBalance());

        System.out.println("Pago $0: " + (wallet.pay(0) ? "EXITOSO" : "RECHAZADO") 
                           + " | Saldo: $" + wallet.getBalance());

        System.out.println("Pago $600.000 (excede límite): " + (wallet.pay(600000.0) ? "EXITOSO" : "RECHAZADO") 
                           + " | Saldo: $" + wallet.getBalance());

        System.out.println("Pago $400.000: " + (wallet.pay(400000.0) ? "EXITOSO" : "RECHAZADO") 
                           + " | Saldo: $" + wallet.getBalance());

        System.out.println("Pago $450.000 (excede saldo actual): " + (wallet.pay(450000.0) ? "EXITOSO" : "RECHAZADO") 
                           + " | Saldo: $" + wallet.getBalance());
    }
}