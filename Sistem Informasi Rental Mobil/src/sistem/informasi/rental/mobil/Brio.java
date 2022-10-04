package sistem.informasi.rental.mobil;

public class Brio extends Mobil{
    Brio() {
        setHargaSewa(300000);
    }
    
    @Override
    public String printMobil() {
        return "Honda Brio";
    }
}
