package Pertemuan11;

// Deklarasi Class
class PersegiPanjang{
  // Deklarasi Atribut
  int panjang;
  int lebar;
  int luas;
  int keliling;

  // Membuat constructor dengan 1 parameter (sisi) dan menginisialisasi atributnya
  public PersegiPanjang(int sisi){
    this.panjang = sisi;
    this.lebar = sisi;
    this.luas = panjang * lebar;
    this.keliling = 2 * (panjang + lebar) ;
  }

  // Membuat constructor dengan 2 parameter (panjang dan lebar) dan menginisialisasi atributnya
  public PersegiPanjang(int panjang,int lebar){
    this.panjang = panjang;
    this.lebar = lebar;
    this.luas = panjang * lebar;
    this.keliling = 2 * (panjang + lebar); 
  }

  // Membuat Method untuk menampilkan informasi tentang persegi/persegi panjang
  public void tampilkanInfo(){
    // Membuat pengkondisian apabila nilai panjang sama dengan lebar maka akan menampilkan persegi jika bukan maka akan menampilkan persegi panjang
  if (panjang == lebar){
    System.out.println("=== PERSEGI ===");
  }
  else{
    System.out.println("=== PERSEGI PANJANG ===");
  }
    System.out.println("Panjang : " + panjang + " cm");
    System.out.println("Lebar : " + lebar + " cm");
    System.out.println("Luas : " + luas + " cm²");
    System.out.println("Keliling : " + keliling + " cm");
    System.out.println("");
    }
  }


public class  LatihanPersegiOverloading {
  public static void main(String[] args) {
    // Mendeklarasi objek, menginisialisasi atributnya dengan 1 parameter (sisi) dan memanggil method untuk menampilkan objeknya
    PersegiPanjang persegi = new PersegiPanjang(5);
    persegi.tampilkanInfo();

    // Mendeklarasi objek, menginisialisasi atributnya dengan 2 parameter (panjang dan lebar) dan memanggil method untuk menampilkan objeknya
    PersegiPanjang persegipanjang = new PersegiPanjang(8,4);
    persegipanjang.tampilkanInfo();
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Jumat/13-03-2026