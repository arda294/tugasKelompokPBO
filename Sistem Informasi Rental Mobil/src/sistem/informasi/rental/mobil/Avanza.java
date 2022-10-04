package sistem.informasi.rental.mobil;

public class Avanza extends Mobil {
    Avanza() {
        setHargaSewa(400000);
    }
    
    @Override
    public String printMobil() {
        return "Toyota Avanza";
    }
}
