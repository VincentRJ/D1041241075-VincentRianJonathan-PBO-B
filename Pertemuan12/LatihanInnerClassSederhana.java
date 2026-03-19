package Pertemuan12;

// Membuat outer class
class Sekolah{
  // Mendeklarasi atributnya
  String namaSekolah;
  // Membuat inner class
  class Kelas{
    // Mendeklarasi atributnya
    String kelas;
    // Method untuk menampilkan nama sekolah dan kelas
    void info(){
      System.out.println("Nama Sekolah : " + namaSekolah);
      System.out.println("Kelas : " + kelas);  
    }
  }
}
public class LatihanInnerClassSederhana {
  public static void main(String[] args) {
    // Membuat Object dan menginisialisasi atributnya
    Sekolah sekolah1 = new Sekolah();
    sekolah1.namaSekolah = "SMA Negeri 1";

    // Membuat Object dan menginisialisasi atributnya
    Sekolah.Kelas kelas1 = sekolah1.new Kelas();
    kelas1.kelas = "X-A";

    // Memanggil method untuk menampilkan nama sekolah dan kelas
    kelas1.info();
  }
}


// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Rabu/18 Maret 2026