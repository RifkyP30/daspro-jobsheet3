import java.util.Scanner;

public class Kafe15 {
  public static void main(String[] args) {
    // Deklarasi scanner
    Scanner input = new Scanner(System.in);

    // Deklarasi variabel
    boolean keanggotaan;
    int jmlKopi, jmlTeh, jmlRoti;
    double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
    double totalHarga, nominalBayar;
    float diskon = 10 / 100f;

    // Masukkan input
    System.out.print("Masukkan keanggotaan (true/false): ");
    keanggotaan = input.nextBoolean();
    System.out.print("Masukkan jumlah pembelian kopi: ");
    jmlKopi = input.nextInt();
    System.out.print("Masukkan jumlah pembelian teh: ");
    jmlTeh = input.nextInt();
    System.out.print("Masukkan jumlah pembelian roti: ");
    jmlRoti = input.nextInt();

    // Hitung total harga
    totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);

    // Hitung nominal bayar
    nominalBayar = totalHarga - (diskon * totalHarga);

    // Tampilkan output
    System.out.println("Keanggotaan pelanggan " + keanggotaan);
    System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti");
    System.out.println("Nominal bayar Rp " + nominalBayar);
  }
}