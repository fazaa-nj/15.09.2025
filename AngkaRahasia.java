import java.util.Scanner;

public class AngkaRahasia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angkaRahasia = 7;
        int tebakan;

        System.out.println("Selamat datang di permainan Tebak Angka!");
        System.out.println("Coba tebak angka rahasia antara 1 sampai 10.");

        do {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = input.nextInt();

            if (tebakan < angkaRahasia) {
                System.out.println("Terlalu rendah! Coba lagi.");
            } else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu tinggi! Coba lagi.");
            }
        } while (tebakan != angkaRahasia);

        System.out.println("Selamat! Anda berhasil menebak angka rahasia: " + angkaRahasia);
        input.close();
    }
}
