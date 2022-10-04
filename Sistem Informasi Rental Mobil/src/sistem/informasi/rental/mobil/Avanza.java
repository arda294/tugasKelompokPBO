/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.informasi.rental.mobil;

/**
 *
 * @author ardap
 */
public class Avanza extends Mobil {
    Avanza() {
        setHargaSewa(400000);
    }
    
    @Override
    public String printMobil() {
        return "Toyota Avanza";
    }
}
