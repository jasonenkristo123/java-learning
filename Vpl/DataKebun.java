class DataKebun {
    private int stokSayur;
    private int danaKotor;
    private int danaBersih;
    private int tingkatLelah;
    private boolean sedangMogok;

    public DataKebun() {
       this.stokSayur = 0;
       this.danaKotor = 0;
       this.danaBersih = 0;
       this.tingkatLelah = 0;
       this.sedangMogok = false;
    }

    // Getter
    public boolean getStatusMogok() { 
        return sedangMogok;
    }
    
    public int getStokSayur() { 
        return stokSayur;
    }
    
    public int getDanaKotor() { 
        return danaKotor;
    }
    
    public int getDanaBersih() { 
        return danaBersih;
    }
    
    public int getTingkatLelah() { 
        return tingkatLelah;
    }

    // Setter
    public void setStokSayur(int s) { 
        this.stokSayur = s;
    }
    
    public void setDanaKotor(int dk) { 
        this.danaKotor = dk;
    }
    
    public void setDanaBersih(int db) { 
        this.danaBersih = db;
    }
    
    public void setTingkatLelah(int tl) { 
        this.tingkatLelah = tl;
    }

    public void prosesTanam(int jumlah) {
        // Cek status mogok
        if (sedangMogok == true) {
            System.out.println("[AKSES DITOLAK] Tim sedang mogok! Tidak bisa menanam.");
            return;
        }

        // Tambah stok sayur
        this.stokSayur += jumlah;
        
        // Hitung kenaikan lelah (setiap 500 kg = 1 poin)
        int lelahNaik = jumlah / 500;
        this.tingkatLelah += lelahNaik;

        System.out.printf("Berhasil menanam! Stok bertambah: %,d kg\n", jumlah);
        System.out.println("Peringatan! Tingkat Lelah naik +" + lelahNaik + " (Total: " + tingkatLelah + ")");

        cekMogok();
    }

    public void prosesJual(int jumlah) {
        // Cek status mogok
        if (sedangMogok == true) {
            System.out.println("[AKSES DITOLAK] Tim sedang mogok! Tidak bisa menjual.");
            return;
        }

        // Cek stok cukup
        if (stokSayur >= jumlah) {
            this.stokSayur -= jumlah;
            
            // Hitung dana dapat (1 kg = Rp 10.000)
            int danaDapat = jumlah * 10000;
            this.danaKotor += danaDapat;
            
            // Lelah naik 3 poin
            this.tingkatLelah += 3;

            System.out.printf("Berhasil menjual %,d kg seharga Rp %,d\n", jumlah, danaDapat);
            System.out.println("Tingkat Lelah naik +3 (Total: " + tingkatLelah + ")");

            cekMogok();
        } else {
            System.out.println("Gagal! Stok sayuran tidak cukup.");
        }
    }

    public void prosesKembangkan(int jumlah) {
        // Cek status mogok
        if (sedangMogok == true) {
            System.out.println("[AKSES DITOLAK] Tim sedang mogok! Tidak bisa mengembangkan.");
            return;
        }

        // Cek dana bersih cukup
        if (danaBersih >= jumlah) {
            this.danaBersih -= jumlah;
            System.out.printf("Berhasil mengembangkan lahan! Sisa dana bersih: Rp %,d\n", this.danaBersih);
        } else {
            System.out.println("Gagal! Dana bersih tidak cukup.");
        }
    }

    public void prosesIstirahat(int poinTurun) {
        if (sedangMogok) return;

        // Hitung biaya (1 poin = Rp 2.000.000)
        int biaya = poinTurun * 2000000;

        // Cek dana bersih cukup
        if (danaBersih >= biaya) {
            this.danaBersih -= biaya;
            this.tingkatLelah -= poinTurun;
            
            // Pastikan tidak negatif
            if (this.tingkatLelah < 0) this.tingkatLelah = 0;
            
            System.out.printf("Berhasil istirahat. Biaya: Rp %,d\n", biaya);
            System.out.println("Tingkat Lelah turun -" + poinTurun);
        } else {
            System.out.println("Gagal! Dana bersih tidak cukup.");
        }
    }

    public void cekMogok() {
        // Cek apakah tingkatLelah >= 100
        if (tingkatLelah >= 100) {
            // Set sedangMogok jadi true
            this.sedangMogok = true;
            
            System.out.println("\n!!! PERINGATAN !!! TINGKAT LELAH 100% !!!");
            System.out.println("!!! TIM MOGOK KERJA !!!");
            System.out.println("!!! OPERASI DIHENTIKAN !!!\n");
        }
    }

    public void tampilkanInfo() {
        System.out.println("\n=== DASHBOARD KEBUN ===");
        System.out.println("Status          : " + (sedangMogok ? "MOGOK" : "AKTIF"));
        System.out.printf("Stok Sayuran    : %,d kg\n", stokSayur);
        System.out.printf("Dana Kotor      : Rp %,d\n", danaKotor);
        System.out.printf("Dana Bersih     : Rp %,d\n", danaBersih);
        System.out.println("Tingkat Lelah   : " + tingkatLelah + "/100");
        System.out.println("=======================\n");
    }
}
