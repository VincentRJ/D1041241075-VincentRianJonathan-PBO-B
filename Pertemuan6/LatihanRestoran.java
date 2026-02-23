package Pertemuan6;

public class LatihanRestoran {
  public static void main(String[] args) {
    // Simulasi inputan untuk kode menu dan jumlah orderan yang dipesan.
    int menuCode = 1;
    int quantity = 2;

    // Mendeklarasikan variabel yang digunakan untuk menyimpan harga satuan,total harga dan nama menu
    int hargaSatuan;
    int totalHarga;
    String namaMenu;

  // Switch statement yang mengecek konversi angka inputan kode menu mendefiniskan nama menu dan harga satuan dari kode menu yang diinputkan
    switch (menuCode) {
      case 1:
      namaMenu = "Nasi Goreng";
      hargaSatuan = 15000;
      break;

      case 2:
      namaMenu = "Mie Ayam";
      hargaSatuan = 12000;
      break;

      case 3:
      namaMenu = "Bakso";
      hargaSatuan = 10000;
      break;

      case 4:
      namaMenu = "Soto Ayam";
      hargaSatuan = 13000;
      break;

      case 5:
      namaMenu = "Es Teh";
      hargaSatuan = 3000;
      break;

      // Mendeklarasikan nilai default jika kode menu yang diinputkan diluar range 1-5
      default:
      namaMenu = "Error: Angka kode menu tidak valid (1-5)";
      hargaSatuan = 0;
      break;
    }

    // Rumus menghitung total harga
    totalHarga = hargaSatuan * quantity;

    // Mencetak hasil dari kode menu, jumlah pesanan,nama menu,harga satuan dan total yang dibayarkan
      System.out.println("=== Menu Restoran ====");
      System.out.println("Kode Menu : " + menuCode);
      System.out.println("Jumlah : " + quantity);
      System.out.println(" ");
      System.out.println("Pesanan Anda :");
      System.out.println("Nama Menu : " + namaMenu);
      System.out.println("Harga Satuan : Rp " + hargaSatuan);
      System.out.println("Jumlah : " + quantity);
      System.out.println("---");
      System.out.println("Total Bayar : Rp " + totalHarga);
    }
  }

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Senin/23-02-2026