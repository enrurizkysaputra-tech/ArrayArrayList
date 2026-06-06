
package bagian3.perpustakaan;


public class MainPerpustakaan {
    public static void main(String[] args) {
        
        Perpustakaan perpus = new Perpustakaan();
        
        // update new Buku tambah tahun
        perpus.tambahBuku(new Buku("Laskar Pelangi",  "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia",    "Pramoedya",     1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi",   2009));

        // uji kembalikanBuku (No. 1)
        perpus.pinjamBuku("Bumi Manusia");
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println("\n");
        // uji cariPenulis (No. 3)
        perpus.cariPenulis("Andrea Hirata");
        perpus.cariPenulis("Tere Liye"); // penulis yang tidak ada
        perpus.tampilkanKoleksi();
        System.out.println();
        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia"); // coba pinjam kedua kali
        System.out.println();
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
    }
}
