package Pertemuan6;

public class LatihanBulan {
  public static void main(String[] args) {
    // Simulasi inputan untuk variabel bulan.
    int month = 5;
    // Mendeklarasikan string yang digunakan untuk menyimpan nama bulan yang dikonversikan
    String monthName;

    // Switch statement yang mengecek konversi angka inputan bulan dan merubahnya dari angka ke kata(nama-nama bulan dalam bahasa indonesia)
    switch (month){
      case 1:
        monthName = "Januari";
        break;
      case 2:
        monthName = "Februari";       
        break;
      case 3:
        monthName = "Maret";        
        break;
      case 4:
        monthName = "April";        
        break;
      case 5:
        monthName = "Mei";       
        break;
      case 6:
        monthName = "Juni";        
        break;
      case 7:
        monthName = "July";        
        break;
      case 8:
        monthName = "Agustus";        
        break;
      case 9:
        monthName = "September";       
        break;
      case 10:
        monthName = "Oktober";       
        break;
      case 11:
        monthName = "November";       
        break;
      case 12:
        monthName = "Desember";       
        break;
      // Mendeklarasikan nilai default jika data bulan yang diinputkan diluar range 1-12
      default:
        monthName = "Error: Angka bulan tidak valid (1-12)";
        break;
    }
    
    // Mencetak hasil konversinya
    System.out.println("=== KONVERSI BULAN ===");
    System.out.println("Angka Bulan : " + month);
    System.out.println("Nama Bulan : " + monthName);
  }
}


// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Senin/23-02-2026