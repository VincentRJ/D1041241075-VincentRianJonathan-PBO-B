package Pertemuan8;

public class LatihanCariKelipatan {
  public static void main(String[] args) {
    System.out.println("=== CARI KELIPATAN 7 ===");
    
    // Looping dari 1-50
    for(int angka = 1; angka <= 50; angka++){
        System.out.println("Cek :" + angka);

      // Mengecek apakah angka merupakan kelipatan 7 jika iya maka akan mencetakn kelipatan 7 pertama dan memberhentikan looping
      if(angka % 7 == 0){
        System.out.println("Kelipatan 7 pertama : " + angka);
        System.out.println("Pencarian selesai.");
        break;
      }
    }
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Rabu/25-02-2026