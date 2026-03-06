public class LatihanLogin {
  public static void main(String[] args) {
    String inputUsername = "admin"; // Inisialisasi Awal
    String password = "admin123"; // Inisialisasi Awal

    // Menampilkan username dan password
    System.out.println("=== VALIDASI LOGIN ===");
    System.out.println("Username : " + inputUsername);
    System.out.println("Password : ****");
    System.out.println("---");
    
    // Pengkondisian jika kondisinya benar akan menampilkan output berdasarkan kondisinya terdapat if untuk mengecek jika usernamenya benar maka akan dilanjutkan ke nested if untuk mengecek apakah kondisi passwordnya benar atau salah.
    if (inputUsername.equals("admin")){
      System.out.println("Username valid");
        if (password.equals("admin123")) {
          System.out.println("Password benar");
          System.out.println("LOGIN BERHASIL!");
          System.out.println("Selamat datang, admin");
        }
        else {
          System.out.println("Password salah");
          System.out.println("Login Gagal!");
        }
    }
  }
}

// Nama : Vincent Rian Jonathan
// NIM : D1041241075
// Hari/Tanggal : Jumat/6 Maret 2026