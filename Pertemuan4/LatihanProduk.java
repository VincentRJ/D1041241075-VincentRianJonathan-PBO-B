package Pertemuan4;

public class LatihanProduk {
  public static void main(String[] args) {
  String namaProduk = "Laptop Asus";
  int hargaSatuan = 7000000;
  int jumlahStok = 15;
  boolean isStatusTersedia = true;
  final double PAJAK = 0.11;

  System.out.println("=== INFORMASI PRODUK ===");
  System.out.println("Nama Produk : " + namaProduk);
  System.out.println("Harga Satuan : Rp " + hargaSatuan);
  System.out.println("Jumlah Stok : " + jumlahStok);
  System.out.println("Status Tersedia : " + isStatusTersedia);
  System.out.println("---");
  System.out.println("Total Nilai Stok : Rp " + (hargaSatuan * jumlahStok));
  System.out.println("Pajak (11%) : Rp " + (int)((hargaSatuan * jumlahStok) * PAJAK));
  }
}
