package sistem.informasi.rental.mobil;

public class Mobil {
    private double hargaSewa = 250000;
    
    public String printMobil() {
        return "Mobil Generic";
    }

    public double getHargaSewa() {
        return hargaSewa;
    }
    
    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
 
}
