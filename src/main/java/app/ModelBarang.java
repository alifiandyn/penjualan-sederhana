/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Alif
 */
public class ModelBarang {
    private String namaBarang;
    private String satuan;
    private Double harga;
    
    public ModelBarang(String namaBarang, String satuan,Double harga){
        this.namaBarang = namaBarang;
        this.satuan = satuan;
        this.harga = harga;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }
    
    @Override
    public String toString(){
        return namaBarang;
    }
}
