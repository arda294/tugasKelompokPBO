package sistem.informasi.rental.mobil;

public class Innova extends Mobil{
    Innova() {
        setHargaSewa(400000);
    }
    
    @Override
    public String printMobil() {
        return "Toyota Kijang Innova";
    }
}
