package sistem.informasi.rental.mobil;

public class Sewa {
    private Pelanggan plg;
    private Mobil mobil;
    private int tglPinjam;
    private int tglPengembalian;
    private int lamaPeminjaman;
    
    Sewa(Pelanggan plg, Mobil mobil, int tglPinjam, int tglPengembalian) {
        this.plg = plg;
        this.mobil = mobil;
        this.tglPinjam = tglPinjam;
        this.tglPengembalian = tglPengembalian;
        this.lamaPeminjaman = tglPengembalian - tglPinjam;
    }
    
    Sewa(Pelanggan plg, Mobil mobil, int tglPinjam) {
        this(plg, mobil, tglPinjam, tglPinjam + 1);
    }
    
    public void printStruk() {
        System.out.println("---Struk Rental---" +
                            "\nNama Peminjam :" + this.plg.getNama() +
                            "\nJenis Mobil :" + this.mobil.printMobil() +
                            "\nTanggal Pinjam :" + this.tglPinjam +
                            "\nTanggal Pengembalian :" + this.tglPengembalian +
                            "\nTotal Biaya: " + this.mobil.getHargaSewa()*this.lamaPeminjaman);
    }

    public Pelanggan getPlg() {
        return plg;
    }

    public void setPlg(Pelanggan plg) {
        this.plg = plg;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public int getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(int tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public int getTglPengembalian() {
        return tglPengembalian;
    }

    public void setTglPengembalian(int tglPengembalian) {
        this.tglPengembalian = tglPengembalian;
    }
    
}
