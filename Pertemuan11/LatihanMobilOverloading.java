package Pertemuan11;

// Deklarasi Class
class Mobil{
  // Deklarasi Atribut
  String merk;
  String warna;
  int tahun;

// Deklarasi Constructor tanpa parameter dan Menginisialisasi atributnya
public Mobil(){
  merk = "Unknown";
  warna = "Unknown";
  tahun = 0;
}

// Deklarasi Constructor dengan 1 parameter dan Menginisialisasi atributnya berdasarkan parameter
public Mobil(String merk){
  this.merk = merk;
  warna = "Unknown";
  tahun = 0;
}

// Deklarasi Constructor dengan semua parameter dan menginisialisasi atributnya berdasarkan parameter
public Mobil(String merk, String warna, int tahun){
  this.merk = merk;
  this.warna = warna;
  this.tahun = tahun;
}

// Membuat Method untuk menampilkan keseluruhan spesifikasi mobil
public void tampilkanSpesifikasi(){
  System.out.println("=== SPESIFIKASI MOBIL ===");
  System.out.println("Merk : " + merk);
  System.out.println("Warna : " + warna);
  System.out.println("Tahun : " + tahun);
  System.out.println("");
}
}

public class LatihanMobilOverloading {
  public static void main(String[] args) {
    // Mendeklarasi objek dan memanggil method untuk menampilkan objeknya 
    Mobil mobil1 = new Mobil();
    mobil1.tampilkanSpesifikasi();

    // Mendeklarasi objek, menginisialisasi atributnya dengan 1 parameter (merk) dan memanggil method untuk menampilkan objeknya
    Mobil mobil2 = new Mobil("Toyota");
    mobil2.tampilkanSpesifikasi();

    // Mendeklarasi objek, menginisialisasi atributnya dengan semua paramater dan memanggil method untuk menampilkan objeknya
    Mobil mobil3 = new Mobil("Honda Civic","Merah",2023);
    mobil3.tampilkanSpesifikasi();
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Jumat/13-03-2026