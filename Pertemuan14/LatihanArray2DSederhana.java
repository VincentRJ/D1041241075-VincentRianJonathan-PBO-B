package Pertemuan14;

public class LatihanArray2DSederhana {
  public static void main(String[] args) {
    //mendeklarasi array 2 dimensi dan menginisialisasi atributnya 
      int [][] array = {
        {1,2,3},
        {4,5,6},
        {7,8,9}}; 

      System.out.println("=== TABEL 3x3 ===");
      // nested loop untuk menampilkan isi array 2 dimensi berdasarkan baris
      for (int iterasi1 = 0; iterasi1 < array.length; iterasi1++) {
        for (int iterasi2 = 0; iterasi2 < array[iterasi1].length; iterasi2++) {
            System.out.print(array[iterasi1][iterasi2] + " ");
        }
        System.err.println();
      }
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Rabu/18 Maret 2026