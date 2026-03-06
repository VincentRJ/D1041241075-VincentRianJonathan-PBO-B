// Inisialisasi class
class Persegi{
  // Deklarasi atribut sesuai UML
  int sisi;
  int luas;
  int keliling;

  // Method untuk menghitung luas
  public void hitungLuas(){
    luas = sisi * sisi;
  }

  // Method untuk menghitung keliling
  public void hitungKeliling(){
    keliling = 4 * sisi;
  }

  // Method untuk menampilkan informasi terkait persegi sisi,luas, dan keliling
  public void hitungHasil(){
    System.out.println("=== PERSEGI ===");
    System.out.println("");
    System.out.println("Sisi     : " + sisi + " cm");
    System.out.println("");
    System.out.println("Luas     : " + luas + " cm²");
    System.out.println("");
    System.out.println("Keliling : " + keliling + " cm");
    System.out.println("");
  }
}

public class LatihanClassPersegi {
  public static void main(String[] args) {
    Persegi persegi1 = new Persegi(); //Deklarasi dan inisialisasi Objek
    persegi1.sisi = 5; //Menginisialisai nilai sisi

    // Memanggil method untuk menghitung luas dan persegi
    persegi1.hitungLuas();
    persegi1.hitungKeliling();
    // Menampilkan hasil informasi terkait persegi sisi,luas, dan keliling
    persegi1.hitungHasil();
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Jumat/6 Maret 2026