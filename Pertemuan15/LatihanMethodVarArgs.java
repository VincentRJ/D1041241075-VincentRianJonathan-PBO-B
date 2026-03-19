package Pertemuan15;

public class LatihanMethodVarArgs {
  // Membuat method VarArgs untuk menghitung rata-rata
  static double hitungRataRata(int ... nilai){
  // Mengecek kondisi jika panjang nilai = 0 maka akan mengembalikan nilai 0
  if (nilai.length == 0){
  return 0;}
  // Mendeklarasi dan menginisialisasi nilai total awal
  int total = 0;

  // Refactored dengan enhanced for untuk menghitung total nilai dari array 
  for (int n : nilai){
  total += n;}
  // Mengembalikan nilai rata-rata perhitungan
  return (double) total/nilai.length;
  }
  public static void main(String[] args) {
    // Mendeklarasikan objek, menginisialisasinya atributnya dengan 3 nilai dan mencetak hasil rata-ratanya
    double RataRata1 = hitungRataRata(70, 80, 90);
    System.out.println("Rata-rata (3 nilai) : " + RataRata1);

    // Mendeklarasikan objek, menginisialisasinya atributnya dengan 5 nilai dan mencetak hasil rata-ratanya
    double RataRata2 = hitungRataRata(82, 90, 78, 92, 88);
    System.out.println("Rata-rata (5 nilai) : " + RataRata2);
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Rabu/18 Maret 2026