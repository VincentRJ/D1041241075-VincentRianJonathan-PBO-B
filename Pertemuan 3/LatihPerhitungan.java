public class LatihPerhitungan {
  public static void main(String[] args) {
    // membuat variabel saldo dengan tipe data integer untuk bilangan bulat
    int saldo = 1000000;
    System.out.println("=== SIMULASI TRANSAKSI BANK ===");
    System.out.println("Saldo Awal : " + saldo);

    // membuat variabel setoran untuk menunjukan nilai setoran.Dengan tipe data integer untuk bilangan bulat
    int setoran = 500000;
    System.out.println("Setoran : " + setoran);

    // Perubahan nilai saldo setelah setoran dengan cara nilai saldo + setoran
    saldo += setoran;
    System.out.println("Saldo setelah setoran : " + saldo);

    // membuat variabel penarikan dengan tipe data integer untuk bilangan bulat untuk menunjukan jumlah saldo yang akan ditarik
    int penarikan = 250000;
    System.out.println("Penarikan : " + penarikan);

    // Perubah nilai saldo setelah terjadi penarikan dengan cara nilai saldo - penarikan
    saldo -= penarikan;
    System.out.println("Saldo Akhir : " + saldo);
  }
}
