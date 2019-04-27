package com.company;

public class overload {

    private String nama;
    private String asal;
    private int jumlah;

    public overload()
    {
        System.out.println("Harimau atau dikenal dengan nama Panthera tigris");
    }
    public overload(String nama, String asal) {
        this.setNama(nama);
        this.setAsal(asal);
    }
    public overload (String nama,int jumlah)
    {
    this.setNama(nama);
    this.setJumlah(jumlah);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }


    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}

