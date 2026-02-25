package Pertemuan7;

public class LatihanDeretGanjil {
  public static void main(String[] args) {
    //Menginisialisasi nilai inputan awal dengan mendeklarasikan variabel integer bernilai 1
    int angka = 1; 
    System.out.println("=== Bilangan Ganjil 1-15 ===");

    // Kondisi perulangan while dengan syarat nilai angka dibawah atau sama dengan 15 bernilai true jika false maka perluangannya tidak akan dijalankan
    //mencetak hasilnya agar sebaris dengan dipisahkan spasi
    //karena kita telah menginisialisasi angka dengan 1 maka tinggal ditambahkan didalam perulangan bernilai 2 agar tetap ganjil
    while(angka <= 15){
      System.out.print(angka + " "); 
      angka+= 2; 
    }
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Rabu/25-02-2026