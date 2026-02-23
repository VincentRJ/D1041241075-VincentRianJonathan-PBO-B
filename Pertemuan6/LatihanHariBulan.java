package Pertemuan6;

public class LatihanHariBulan {
  public static void main(String[] args) {
     // Simulasi inputan untuk variabel bulan.
    int month = 4;
    // Mendeklarasikan string yang digunakan untuk menyimpan nama bulan yang dikonversikan
    String monthName;

    // Switch statement yang mengecek konversi angka inputan bulan dan merubahnya dari angka ke kata(nama-nama bulan dalam bahasa indonesia)
        switch (month){
      case 1:
        monthName = "Januari (bulan ke-1)";
        break;
      case 2:
        monthName = "Februari (bulan ke-2)";       
        break;
      case 3:
        monthName = "Maret (bulan ke-3)";        
        break;
      case 4:
        monthName = "April (bulan ke-4)";        
        break;
      case 5:
        monthName = "Mei (bulan ke-5)";       
        break;
      case 6:
        monthName = "Juni (bulan ke-6)";        
        break;
      case 7:
        monthName = "Juli (bulan ke-7)";        
        break;
      case 8:
        monthName = "Agustus (bulan ke-8)";        
        break;
      case 9:
        monthName = "September (bulan ke-9)";       
        break;
      case 10:
        monthName = "Oktober (bulan ke-10)";       
        break;
      case 11:
        monthName = "November (bulan ke-11)";       
        break;
      case 12:
        monthName = "Desember (bulan ke-12)";       
        break;
      // Mendeklarasikan nilai default jika data bulan yang diinputkan diluar range 1-12
      default:
        monthName = "Error: Angka bulan tidak valid (1-12)";
        break;
    }

// Mencetak konversi jumlah hari dalam sebulan yang diinputkan
    System.out.println("=== JUMLAH HARI DALAM BULAN ===");
    System.out.println("Bulan : " + monthName);

  // Switch statement yang mengecek konversi angka inputan bulan dan merubahnya dari angka ke jumlah hari dalam bulan tersebut sekaligus mencetaknya ke output
    switch (month) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
      System.out.println("Jumlah hari : 31 hari");
      break;

      case 4:
      case 6:
      case 9:
      case 11:
      System.out.println("Jumlah hari : 30 hari");
      break;

      case 2:
      System.out.println("Jumlah hari : 28 hari");
      break;
    }
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Senin/23-02-2026