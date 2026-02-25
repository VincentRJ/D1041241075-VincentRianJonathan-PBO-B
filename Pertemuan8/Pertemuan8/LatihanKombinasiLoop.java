package Pertemuan8;

public class LatihanKombinasiLoop {
  public static void main(String[] args) {
    System.out.println("=== PENCARIAN KORDINAT [2,3] ===");

    // menginisialisasi kondisi kordinatnya belum ditemukan
    boolean isDitemukan = false;  
    // Looping kordinat luar dengan range 1-3
    for(int outer = 1; outer <= 3 && isDitemukan == false; outer++){

      // Looping Koordinat dalam dengan range 1-5
      for(int inner = 1; inner <=5 & isDitemukan == false; inner++){
        System.out.println("Cek : [" + outer + "," + inner + "]");
        
        // Jika kondisinya true maka akan mencetak koordinat ditemukan dan pencarian selesai serta memberhentikan inner looping
        if(outer == 2 && inner == 3){
          System.out.println("Koordinat ditemukan!");
          System.out.println("Pencarian Selesai.");
          isDitemukan = true;
          break;
        }
      }
    }
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Rabu/25-02-2026