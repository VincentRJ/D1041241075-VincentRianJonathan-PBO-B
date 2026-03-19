package Pertemuan14;

public class LatihanJaggedArray {
  public static void main(String[] args) {
    //mendeklarasi jagged array dan menginisialisasi atributnya dengan panjang baris yang berbeda
      int [][] jaggedArray = {
        {10,20},
        {30,40,50,60},
        {70,80,90}
      };

      // Membuat iterasi untuk menampilkan baris dan jumlah elemen berdasarkan baris jagged array
      for (int iterasi1 = 0; iterasi1 < jaggedArray.length; iterasi1++) {
        System.out.print("Baris " + iterasi1 + " (" + jaggedArray[iterasi1].length + " elemen) : ");
        
        // Membuat iterasi untuk menampilkan nilai berdasarkan baris pada jagged array
          for (int iterasi2 = 0; iterasi2 < jaggedArray[iterasi1].length; iterasi2++) {
            System.out.print(jaggedArray[iterasi1][iterasi2] + "  ");
          }
        System.out.println();
      }
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Rabu/18 Maret 2026