// Inisialisasi class
class Mobil{  
  // Deklarasi atribut 
  String merk;
  String warna;
  int tahun;

  // Membuat Constructor tanpa paramater untuk menginisialisasi informasi default 
  public Mobil(){
  merk = "Belum diisi";
  warna = "Belum diisi";
  tahun = 0;
  }

  // Membuat constructor dengan 1 paramater yaitu merk untuk menginsialisasi informasi terkait merk mobil
  public Mobil(String merk){
    this.merk = merk;
    warna = "Belum diisi";
    tahun = 0;
  }

  // Membuat constructor dengan 3 paramater yaitu merk,string, dan warna untuk(semua atribut)
  public Mobil(String merk, String warna, int tahun){
    this.merk = merk;
    this.warna = warna;
    this.tahun = tahun;
  }

  // Method Untuk menampilkan spesifikasi mobil
  public void tampilkanSpesifikasi(){
    System.out.println("=== SPESIFIKASI MOBIL ===");
    System.out.println("Merk  : " + merk);
    System.out.println("Warna : " + warna);
    System.out.println("Tahun : " + tahun);
    System.out.println("");
  }
}

public class LatihanMobilConstructor {
  public static void main(String[] args) {
  //Deklarasi Objek, inisialisasi atribut dan menampilkan spesifikasinya.
  Mobil mobil1 = new Mobil(); 
  mobil1.tampilkanSpesifikasi();

  Mobil mobil2 = new Mobil("Toyota");
  mobil2.tampilkanSpesifikasi();

  Mobil mobil3 = new Mobil("Honda Civic","Merah",2023);
  mobil3.tampilkanSpesifikasi();

}
}
// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Jumat/6 Maret 2026