// Inisialisasi class
class Persegi{
  // Deklarasi atribut
  int sisi;
  int luas;
  int keliling;
  boolean isError = false;

  // Membuat Constructor yang menerima 1 paramater yaitu sisi
  public Persegi(int sisi){
    // Pengambilan keputusan berdasarkan kondisi jika true maka akan menginisialisasi nilai sisi menjadi 1 dan menginisalisasi kondisi boolean menjadi true jika kondisi false maka nilai sisi tetap 
    if(sisi <= 0){
      isError = true;
      this.sisi = 1;
    } else {
      this.sisi = sisi;
    }
    // Menghitung nilai luas dan keliling dari persegi
    this.luas = this.sisi * this.sisi;
    this.keliling = 4 * this.sisi;
  }

  // Method untuk Menampilkan informasi terkait persegi
  public void tampilkanHasil(){
    // Jika kondisinya terpenuhi maka akan menampilkan teks error
    if (isError == true){
      System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
    }
    System.out.println("=== PERSEGI ===");
    System.out.println("Sisi     : " + sisi + " cm");
    System.out.println("Luas     : " + luas + " cm²");
    System.out.println("Keliling : " + keliling + " cm");
    System.out.println("");
  }

}
public class LatihanPersegiConstructor {
  public static void main(String[] args) {
    
 //Deklarasi Objek, inisialisasi atribut dan menampilkan hasilnya.
    Persegi persegi1 = new Persegi(5);
    persegi1.tampilkanHasil();

    Persegi persegi2 = new Persegi(-3);
    persegi2.tampilkanHasil();
    
    // Menampilkan hasil persegi berdasarkan objek
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Jumat/6 Maret 2026