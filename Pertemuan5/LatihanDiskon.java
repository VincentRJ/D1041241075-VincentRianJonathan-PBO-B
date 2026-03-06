public class LatihanDiskon {
  public static void main(String[] args) {
    double totalBelanja = 750000.0; //Inisialisasi awal
    System.out.println("=== Kalkulator Diskon ===");
    System.out.println("Total Belanja : Rp  " + totalBelanja);

    // Pengkondisian jika kondisinya benar akan menampilkan output berdasarkan kondisinya dan menampilkan berapa diskon yang didapat,harga akhir,dan jumlah yang dapat dihemat.
    if (totalBelanja < 100000){
      System.out.println("Tidak ada diskon");
      System.out.println("Harga Akhir : Rp " + totalBelanja);
      System.out.println("Anda Hemat : Rp 0");
    }
    else if (totalBelanja >= 100000 && totalBelanja <= 499999){
      System.out.println("Diskon (5%) : Rp " + totalBelanja * 0.05);
      System.out.println("Harga Akhir : Rp " + (totalBelanja - (totalBelanja * 0.05)));
      System.out.println("Anda Hemat : Rp " + totalBelanja * 0.05);
    }
    else if(totalBelanja >= 500000 && totalBelanja <= 999999){
      System.out.println("Diskon (10%) : Rp " + totalBelanja * 0.10);
      System.out.println("Harga Akhir : Rp " + (totalBelanja - (totalBelanja * 0.10)));
      System.out.println("Anda Hemat : Rp " + totalBelanja * 0.10);
    }
    else {
      System.out.println("Diskon (15%) : Rp " + totalBelanja * 0.15);
      System.out.println("Harga Akhir : Rp " + (totalBelanja - (totalBelanja * 0.15)));
      System.out.println("Anda Hemat : Rp " + totalBelanja * 0.15);
    }
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Jumat/6 Maret 2026