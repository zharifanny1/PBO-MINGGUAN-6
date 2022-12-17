import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Motor m=new Motor();
        Penyewa penyewa = new Penyewa();
        Motor motor = new Motor();
        Rental_motor rentalmotor = new Rental_motor();




        penyewa.output();
        motor.output();
        rentalmotor.output();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilihan Pembayaran (1.credit card or 2.cash):");
        String paymentMethod = scanner.nextLine();

        System.out.println("Masukkan Jumlah Pembayaran:");
        double paymentAmount = scanner.nextDouble();

        Payment payment;
        if (paymentMethod.equalsIgnoreCase("1")) {
            System.out.println("Enter Nomor Kartu Kredit :");
            String cardNumber = scanner.nextLine();

            System.out.println("Enter Expiration Date (mm/yy):");
            String expirationDate = scanner.nextLine();

            System.out.println("Enter Security Code:");
            String securityCode = scanner.nextLine();

            System.out.println("Enter Nama Pada Kartu:");
            String nameOnCard = scanner.nextLine();

            payment = new CreditCard(cardNumber, expirationDate, securityCode, nameOnCard);
        }
        else
        {
            payment = new Cash();
        }

    }
}