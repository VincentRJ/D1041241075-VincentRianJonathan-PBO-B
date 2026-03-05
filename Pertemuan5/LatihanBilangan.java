public class LatihanBilangan {
  public static void main(String[] args) {
    int number = -7; //Inisialisasi Awal
    System.out.println("=== PEMERIKSAAN BILANGAN ===");
    System.out.println("Bilangan : " + number);

    // Pengkondisian jika kondisinya benar akan menampilkan output berdasarkan kondisinya
    if (number > 0) {
      System.out.println("Jenis : Bilangan positif");
    } 
    else if(number < 0){
        System.out.println("Jenis : Bilangan negatif");
    } 
    else {
          System.out.println("Jenis : Bilangan nol");
    }

    // Menggunakan ternaty untuk mengecek kondisi apakah billangan tersebut termasuk ganjil/genap
    String parity = (number % 2 == 0) ? "Genap" : "Ganjil";
    System.out.println("Tipe : " + parity);
      }
    }
