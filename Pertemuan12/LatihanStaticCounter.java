package Pertemuan12;

// Membuat class
class Mahasiswa{
  // Mendeklarasikan  dan menginisialisasi atribut static
  static int jumlahMahasiswa = 0;
  // Mendeklarasikan atribut non static
  String nama;

  // Membuat Constructor yang menerima 1 parameter serta menginisilaisasi atributnya dan menambahkan jumlah total mahasiswa setiap objek ditambahkan  
  public Mahasiswa(String nama){
    this.nama = nama; 
    jumlahMahasiswa++;
  }

  // Membuat static method untuk mengembalikan jumlah total mahasiwa
    static int getJumlah(){
    return jumlahMahasiswa;
  }

  // Method untuk menampilkan nama mahasiwa yang dibuat
  public void tampilkanNamaMahasiswa(){
    System.out.println("Mahasiswa Dibuat : " + nama);
  }
}

public class LatihanStaticCounter {
  public static void main(String[] args) {
    // Membuat objek,menginisialisasi atributnya dan menampilkan objeknya
    Mahasiswa mahasiswa1 = new Mahasiswa("Andi");
    mahasiswa1.tampilkanNamaMahasiswa();

    // Membuat objek,menginisialisasi atributnya dan menampilkan objeknya
    Mahasiswa mahasiswa2 = new Mahasiswa("Budi");
    mahasiswa2.tampilkanNamaMahasiswa();

    // Membuat objek,menginisialisasi atributnya dan menampilkan objeknya
    Mahasiswa mahasiswa3 = new Mahasiswa("Citra");
    mahasiswa3.tampilkanNamaMahasiswa();

    System.out.println("");
    // Menampilkan total jumlah mahasiwa yang telah dibuat
    System.out.println("Jumlah Mahasiwa : " + Mahasiswa.getJumlah());
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Rabu/18 Maret 2026