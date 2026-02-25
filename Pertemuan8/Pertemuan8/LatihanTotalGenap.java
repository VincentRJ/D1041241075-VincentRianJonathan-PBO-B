package Pertemuan8;

public class LatihanTotalGenap {
  public static void main(String[] args) {
    int total = 0; // Menginisialisasi nilai awal total jumlah angka genap
    System.out.println("=== TOTAL BILANGAN GENAP ===");
    // Looping untuk mengecek angka genap dari range 1-20
    for(int angka=1; angka <= 20; angka++){
      // Mengecek apakah angka tersebut ganjil jika iya di lewati
      if(angka % 2 != 0){
        continue;
      }
      // Mencetak angka genap yang ditemukan dan menjumlah totalnya bedasarkan angka yang ditemukan
      System.out.println("Tambah : " + angka + " -> Total :" + (total += angka ));
    }

      System.out.println("---");
      // Mencetak total jumlah angka genap dari range 1-20
      System.out.println("Total akhir : " + total);
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Rabu/25-02-2026