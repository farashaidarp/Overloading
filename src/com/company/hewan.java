package com.company;

public class hewan extends overload{

    private String macan;
    private String burung;
    private int banyak;

            public hewan()
            {

                System.out.println("adalah hewan yang tergolong dalam, keluarga felidae (kucing), genus panthera, dan tergolong dalam spesies tigris.");
            }

            public hewan(String macan,String burung)
            {
                this.setMacan(macan);
                this.setBurung(burung);
            }
    public hewan(String macan,int banyak)
    {
        this.setMacan(macan);
        this.setBanyak(banyak);
    }
    public String getMacan() {
        return macan;
    }

    public void setMacan(String macan) {
        this.macan = macan;
    }

    public String getBurung() {
        return burung;
    }

    public void setBurung(String burung) {
        this.burung = burung;
    }


    public int getBanyak() {
        return banyak;
    }

    public void setBanyak(int banyak) {
        this.banyak = banyak;
    }
}


