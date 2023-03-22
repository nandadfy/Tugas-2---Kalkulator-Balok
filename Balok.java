/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Balok extends PersegiPanjang implements HitungRuang{
    private double t, Vol, LuasP;

    public Balok(double t, double p, double l) {
        super(p, l);
        this.t = t;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }
    
    

    @Override
    public double hitungVolume() {
        return super.hitungLuas() * t;
    }

    @Override
    public double hitungLuasP() {
        return 2 * (super.hitungLuas() + (super.getLebar() * t) + (super.getPanjang() * t));
    }
}

