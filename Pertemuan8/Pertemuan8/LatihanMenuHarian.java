package Pertemuan8;

public class LatihanMenuHarian {
  public static void main(String[] args) {
    System.out.println("MENU MAKAN 3 HARI");

    // Looping untuk hari dengan range 1-3
    for(int hari = 1; hari <= 3; hari ++){
      System.out.println("Hari " + hari + ":"); //Menunjukan hari keberapa

      // Looping untuk jam waktu makan pagi & siang
      for (int waktuMakan = 1; waktuMakan <=2; waktuMakan++){
        // Mengecek kondisi hari keberapa dan jam waktu makan kemudian mencetak sesuai kondisinya
        if (hari == 1 && waktuMakan == 1){
          System.out.println("Pagi : Nasi Goreng");
        }
        else if (hari == 1 && waktuMakan == 2) {
          System.out.println("Siang : Soto Ayam");
        }

        else if (hari == 2 && waktuMakan == 1) {
          System.out.println("Pagi : Bubur Ayam");
        }
        else if (hari == 2 && waktuMakan == 2) {
          System.out.println("Siang : Mie Goreng");
        }

        else if (hari == 3 && waktuMakan == 1) {
          System.out.println("Pagi : Roti Bakar");
        }
        else {
          System.out.println("Siang : Nasi Uduk");
        }
      }
    }
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Rabu/25-02-2026