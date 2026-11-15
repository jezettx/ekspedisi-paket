/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ekspedisipaket.layanan;

/**
 *
 * @author YodhaAce
 */
public class LayananReguler implements LayananPengiriman, BisaDiasuransikan {

    private final static double TARIF_PER_KG = 10000;
    private final static double BIAYA_ASURANSI = 3000;
    @Override
    public String getNama() {
        return "Reguler";
    }

    @Override
    public double hitungOngkir(double berat) {
        return berat * TARIF_PER_KG;
    }

    @Override
    public double getBiayaAsuransi() {
        return BIAYA_ASURANSI;
    }
    
}
