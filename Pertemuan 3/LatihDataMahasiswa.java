public class LatihDataMahasiswa {
  public static void main(String[] args) {

    // Tipe data long digunakan untuk bilangan bulat yang cukup besar dengan range -9,223,372,036,854,775,808 sampai9,223,372,036,854,775,807
    long nim = 2301010001L;

    // Tipe data String digunakan untuk kalimat ataupun kata
    String nama = "Budi Santoso";

    // Tipe data char digunakan untuk karakter
    char kelas = 'A';

    // Tipe data boolean digunakan untuk menunjukan kodisi true atau false
    boolean status_aktif = true;

    // double digunakan untuk bilangan desimal
    double ipk = 3.75;

    // Tipe data byte digunakan untuk bilangan bulat yang relatif kecil dengan range 128 sampai 127 
    byte sks = 72;

System.out.println("=== DATA MAHASISWA ===");
System.out.println("NIM           : " + nim);
System.out.println("Nama          : " + nama);
System.out.println("Kelas         : " + kelas);
System.out.println("Status Aktif  : " + status_aktif);
System.out.println("IPK Semester  : " + ipk);
System.out.println("Total SKS     : " + sks);
  }
}