  class Mobil {
    String merk;
    String warna;
    int tahun;
    int kecepatan;

  public void tampilkanInfo () {
    System.out.println("merk : " + merk);
    System.out.println("warna : " + warna);
    System.out.println("tahun : " + tahun);
    System.out.println("kecepatan  : " + kecepatan);
  }

  public void menghitungPercepat (){
    kecepatan += 100;
    System.out.println("Setelah di Percepat : " + kecepatan + " Km/H");
  }
  }
public class ObjekDanKelas {
  public static void main(String[] args) {
    Mobil obj;
    obj = new Mobil();

    obj.merk = "Mercy";
    obj.warna = "Merah";
    obj.tahun = 1999;
    obj.kecepatan = 200;

    obj.tampilkanInfo();
    obj.menghitungPercepat();
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Kelas : Pemograman Berbasis Objek
// Hari/Tanggal : Jumat/20-02-2026
