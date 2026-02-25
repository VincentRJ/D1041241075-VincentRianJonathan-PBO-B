package Pertemuan7;

public class LatihanValidasi {
    public static void main(String[] args) {
        int nilai; // Mendeklarasi variabel yang digunakan untuk menyimpan nilai
        int percobaan = 1; // Menginisialisasi nilai percobaan menjadi 1 kemudian bertambah seiring dengan perulangan do while

        // Mengecek jumlah percobaan dan menyesuaikannya dengan nilai percobaannya
        do {
            if (percobaan == 1) {
                nilai = -10;
            } else if (percobaan == 2) {
                nilai = 150;
            } else {
                nilai = 85;
            }
            System.out.println("Percobaan input: " + nilai); 

            // memeriksa inputan nilai jika didalam range 0-100 maka akan mencetak nilai yang dinputkan valid jika tidak akan mencetak bahwa inputannya diluar range yang telah ditetapkan
            if (nilai >= 0 && nilai <= 100) {
                System.out.println("Nilai Valid : " + nilai);
            } else {
                System.out.println("Error : Nilai harus antara 0-100!");
            }

            percobaan++; //Jumlah percobaan ditambah 1
        } while (percobaan <= 3); //Kondisi akan tetap dijalankan apabila jumlah percobaan <= 3
    }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Rabu/25-02-2026