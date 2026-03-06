// Inisialisasi class
class Mobil{  
  // Deklarasi atribut sesuai UML
  String merk;
  String warna;
  int tahun;
  int kecepatan;

  // Method Untuk menampilkan spesifikasi mobil
  public void tampilkanSpesifikasi(){
    System.out.println("=== SPESIFIKASI MOBIL ===");
    System.out.println("");
    System.out.println("Merk  : " + merk);
    System.out.println("");
    System.out.println("Warna : " + warna);
    System.out.println("");
    System.out.println("Tahun : " + tahun);
    System.out.println("");
    System.out.println("");
  }

  // Method Untuk menghitung percepatan dan menampilkan informasi bahwa mobil dipercepat
  public void percepat(){
    kecepatan += 20;
    System.out.println("Mobil dipercepat...");
    System.out.println("");
  }

  // Method Untuk menampilkan kecepatan saat ini 
  public void tampilkanKecepatan(){
    System.out.println("Kecepatan saat ini : " + kecepatan + " km/jam");
    System.out.println("");
  }
}

public class LatihanClassMobil {
  public static void main(String[] args) {
    Mobil mobil1 = new Mobil(); //Deklarasi dan inisialisasi Objek
    // Mengisi atribut objek untuk spesifikasi mobil 
    mobil1.merk = "Toyota Avanza";
    mobil1.warna = "Silver";
    mobil1.tahun = 2020;
    mobil1.kecepatan = 0;

    // // Menampilkan spesifikasi mobil
    mobil1.tampilkanSpesifikasi();
    // memanggil method percepat sebanyak 2x
    mobil1.percepat();
    mobil1.percepat();
    // Menampilkan informasi kecepatan saat ini
    mobil1.tampilkanKecepatan();
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Jumat/6 Maret 2026