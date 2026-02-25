package Pertemuan7;

public class LatihanRefleksi {
  public static void main(String[] args) {
    int angka = 1; // Menginisialisasi variabel angka 

    System.out.println("=== MENGGUNAKAN WHILE ===");
    // kondisi perulangan jika nilai angka <= 5 maka perulangan akan dijalankan
    while (angka <= 5) { 
      System.out.print(angka + " ");
      angka++;
    }

    System.out.println("");

    angka = 1; // Menginisialisasi ulang nilai angka menjadi 1 agar dalam perulangan do while nilai angka tidak menjadi 6 dan hasilnya tidak akan identik
    System.out.println("=== MENGGUNAKAN DO-WHILE ===");
    // Melakukan terlebih dahulu pencetakan dan penjumlahan nilai angka + 1 kemudian akan dicek kondisinya jika nilai angka <= 5 makan perulangannya akan dilanjutkan
    do {
      System.out.print(angka + " ");
      angka++;
    } while (angka <= 5);

    System.out.println("");

    System.out.println("=== MENGGUNAKAN FOR ===");
    // pertama kita menginisialisasi nilai i menjadi 1 kemudian menggunakan kondisi i<=5 yang artinya jika kondisinya true maka akan perulangannya akan dijalankan kemudian menambahkan nilai i setiap setalah terjadi perulangan
    for(int number = 1; number <= 5; number++){
      System.out.print(number + " ");  // Mencetak hasilnya sebaris dan dipisahkan spasi
    }
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Senin/25-02-2026