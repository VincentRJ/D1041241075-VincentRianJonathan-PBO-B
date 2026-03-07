// Inisialisasi class
class Buku{  
  // Deklarasi atribut 
  String judul;
  String pengarang;
  int harga;

  // Membuat constructor tanpa paramater untuk menginisialisasi informasi default 
  public Buku(){
    judul  = "Belum diisi";
    pengarang = "Belum diisi";
    harga = 0;
    
  }

  // Membuat constructor dengan 3 paramater yaitu judul, pengarang, dan harga untuk(semua atribut)
  public Buku(String judul, String pengarang, int harga){
    this.judul = judul;
    this.pengarang = pengarang;
    this.harga = harga;
  }

  // Method Untuk menampilkan informasi buku
  public void tampilkanInfo(){
    System.out.println("=== INFORMASI BUKU ===");
    System.out.println("Judul     : " + judul);
    System.out.println("Pengarang : " + pengarang);
    System.out.println("Harga     : Rp " + harga);
    System.out.println("");
  }
}

public class LatihanBukuConstructor {
  public static void main(String[] args) {
 //Deklarasi Objek, inisialisasi atribut dan menampilkan informasinya.
  Buku buku1 = new Buku();
  buku1.tampilkanInfo();

  Buku buku2 = new Buku(" Pemrograman Java"," Budi Raharjo",125000);
  buku2.tampilkanInfo();

  Buku buku3 = new Buku("Algoritma dan Struktur Data","Rinaldi Munir",150000);
  buku3.tampilkanInfo();

}
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Jumat/6 Maret 2026