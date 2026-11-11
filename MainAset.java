import java.util.ArrayList;

public class MainAset {
    public static void main(String[] args) {
        // 1. Membuat ArrayList<AsetDigital> berisi minimal 1 objek dari masing-masing subclass
        ArrayList<AsetDigital> daftarAset = new ArrayList<>();
        daftarAset.add(new Gambar("G001", "banner_promo.png", 2.5, "1920x1080"));
        daftarAset.add(new Video("V001", "tutorial_java.mp4", 45.0, 300));
        daftarAset.add(new Dokumen("D001", "laporan_proyek.pdf", 1.8, 25));
        daftarAset.add(new VideoPromosi("VP001", "teaser_launching.mp4", 15.0, 60));

        // 2. Iterasi dan panggil tampilkanPreview() — polimorfisme via abstract class
        System.out.println("===== DAFTAR SELURUH ASET DIGITAL =====");
        for (AsetDigital aset : daftarAset) {
            aset.getInfo();
            aset.tampilkanPreview();

            // 3. Gunakan instanceof untuk mengecek objek yang mengimplementasi DapatDipromosikan
            if (aset instanceof DapatDipromosikan) {
                System.out.println(">> Aset ini memiliki fitur promosi!");
                DapatDipromosikan dp = (DapatDipromosikan) aset;
                dp.promosikan();
                dp.infoPromosi();
            }
            System.out.println("----------------------------------------");
        }

        // 4. Buat ArrayList<DapatDipromosikan> terpisah dan tambahkan VideoPromosi ke dalamnya
        System.out.println("\n===== KELOMPOK ASET YANG DAPAT DIPROMOSIKAN =====");
        ArrayList<DapatDipromosikan> daftarPromosi = new ArrayList<>();
        daftarPromosi.add(new VideoPromosi("VP002", "kampanye_akbar.mp4", 30.0, 90));

        for (DapatDipromosikan promo : daftarPromosi) {
            promo.promosikan();
            promo.infoPromosi();
        }
    }
}