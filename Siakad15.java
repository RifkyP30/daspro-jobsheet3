import java.util.Scanner;

public class Siakad15 {
  public static void main(String[] args) {
    // Deklarasi scanner
    Scanner sc = new Scanner(System.in);

    // Deklarasi variabel
    String nama, nim;
    char kelas;
    byte absen;
    double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

    // Masukkan input
    System.out.print("Masukkan nama\t: ");
    nama = sc.nextLine();
    System.out.print("Masukkan NIM\t: ");
    nim = sc.nextLine();
    System.out.print("Masukkan kelas\t: ");
    kelas = sc.nextLine().charAt(0);
    System.out.print("Masukkan nomor absen: ");
    absen = sc.nextByte();

    // Masukkan nilai
    System.out.print("Masukkan nilai kuis: ");
    nilaiKuis = sc.nextDouble();
    System.out.print("Masukkan nilai tugas: ");
    nilaiTugas = sc.nextDouble();
    System.out.print("Masukkan nilai ujian: ");
    nilaiUjian = sc.nextDouble();

    // Hitung nilai akhir
    nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

    // Tampilkan output
    System.out.println("Nama: " + nama + " NIM: " + nim);
    System.out.println("Kelas: " + kelas + " Absen: " + absen);
    System.out.println("Nilai Akhir: " + nilaiAkhir);
  }
}