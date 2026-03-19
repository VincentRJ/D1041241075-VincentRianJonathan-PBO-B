package Pertemuan13;

public class LatihanArrayNilai {
    public static void main(String[] args) {
        // Deklarasi Array dan inisialisasi atributnya berupa sekumpulan nilai 
        int [] nilai = {85,90,78,92,88}; 
        System.out.println("=== DAFTAR NILAI ===");

        //   For loop untuk mencetak nilai dalam array dan membuat penomorannya.
        for (int iterasi = 0; iterasi < nilai.length; iterasi++) {
            System.out.println("Nilai " + (iterasi + 1) + ": " + nilai[iterasi]);
        }
        System.out.println("");
        
        // Mencetak jumlah panjang array
        System.out.println("Total nilai : " + nilai.length);
    }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Rabu/18 Maret 2026