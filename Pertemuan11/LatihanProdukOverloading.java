package Pertemuan11;

// Mendeklarasi class 
class Produk{
  // Mendeklarasi atribut
  String namaProduk;
  int harga;
  int stok;

  // Membuat constructor dengan 2 parameter (nama produk dan harga) dan menginisialisasi atributnya
  public Produk(String namaProduk, int harga){
    this.namaProduk = namaProduk;
    this.harga = harga;
    stok = 0;
  }

  // Membuat constructor dengan semua parameter dan menginisialisasi atributnya
  public Produk(String namaProduk, int harga, int stok){
    this.namaProduk = namaProduk;
    this.harga = harga;
    this.stok = stok;
  }

  // Membuat method untuk menampilkan informasi produk
  public void tampilkanInfo(){
    System.out.println("=== INFORMASI PRODUK ===");
    System.out.println("Nama Produk : " + namaProduk);
    System.out.println("Harga : Rp " + harga);
    System.out.println("Stok : "+  stok);
    System.out.println("");
  }
}

public class LatihanProdukOverloading {
  public static void main(String[] args) {
  // Mendeklarasi objek, menginisialisasi atributnya dengan 2 parameter (nama produk dan harga) dan memanggil method untuk menampilkan objeknya
  Produk produk1 = new Produk("Laptop ASUS",8500000);
  produk1.tampilkanInfo();

  // Mendeklarasi objek, menginisialisasi atributnya dengan semua parameter dan memanggil method untuk menampilkan objeknya
  Produk produk2 = new Produk("Mouse Logitech",250000,50);
  produk2.tampilkanInfo();
}
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Jumat/13-03-2026