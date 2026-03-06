  // Inisialisasi class
  class Buku{
    // Deklarasi atribut sesuai UML
    String judul;
    String pengarang;
    int harga;

      // Method Untuk menampilkan informasi data informasi buku 
      public void tampilkanInfo() {
      System.out.println("");
      System.out.println("=== INFORMASI BUKU ===");
      System.out.println("");
      System.out.println("Judul     : " + judul);
      System.out.println("");
      System.out.println("Pengarang : " + pengarang);
      System.out.println("");
      System.out.println("Harga     : Rp " + harga);
      System.out.println("");
      System.out.println("");
  }
  }

  public class LatihanClassBuku {
  public static void main(String[] args) {
      Buku buku1 = new Buku(); //Deklarasi dan inisialisasi Objek
      // Mengisi atribut objek untuk informasi data buku 
      buku1.judul =   "Pemrograman Java";
      buku1.pengarang = "Budi Raharjo";
      buku1.harga = 125000;

      Buku buku2 = new Buku();//Deklarasi dan inisialisasi Objek
      // Mengisi atribut objek untuk informasi data buku 
      buku2.judul = "Algoritma dan Struktur Data";
      buku2.pengarang = "Rinaldi Munir";
      buku2.harga = 150000;

    // Menampilkan informasi buku1 dan buku2
    buku1.tampilkanInfo();
    buku2.tampilkanInfo();
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Jumat/6 Maret 2026