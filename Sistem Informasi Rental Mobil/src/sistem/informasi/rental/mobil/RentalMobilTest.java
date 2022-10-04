package sistem.informasi.rental.mobil;

/**
 *
 * @author ardap
 */
public class RentalMobilTest {
    public static void main(String[] args) {
        int tglNow = 2;
        Pelanggan pl = new Pelanggan("Arda Putra", "Jl. Bendul Merisi No.141", "517101060806003");
        pl.sewa("Innova", 2, 4);
        pl.printNota();
        tglNow += 3;
        pl.kembali(tglNow);
        
    }
    
}
