/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.informasi.rental.mobil;

/**
 *
 * @author ardap
 */
public class Pelanggan {
    private String nama;
    private String alamat;
    private String NIK;
    private Sewa sw;
    
    Pelanggan(String nama, String alamat, String NIK) {
        this.nama = nama;
        this.alamat = alamat;
        this.NIK = NIK;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public Sewa getSw() {
        return sw;
    }
    
    public void sewa(String mobil, double tPin, double tPen) {
        Mobil m;
        switch (mobil) {
            case "Innova":
                m = new Innova();
                break;
            case "Brio":
                m = new Brio();
                break;
            case "Avanza":
                m = new Avanza();
                break;
            default:
                m = new Mobil();
                break;
        }
        if((int)tPen - (int)tPin > 1) this.sw = new Sewa(this, m, (int)tPin, (int)tPen); 
        else this.sw = new Sewa(this, m, (int)tPin);
    }
    
    public void kembali(int tgl) {
        if(tgl > sw.getTglPengembalian()) System.out.println("Denda 1 juta!");
        else System.out.println("Mobil dikembalikan tepat waktu!");
        sw = null;
    }
    
    public void printNota() {
        if(sw != null) sw.printStruk();
        else System.out.println("Pelanggan tidak menyewa!");
    }
    

}
