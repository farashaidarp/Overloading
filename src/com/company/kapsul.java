package com.company;

public class kapsul  extends hewan {
protected String data;
private String kelamin;
public int loreng;

public void tampil()
{
    super.setNama("Harimau adalah jenis kucing terbesar dari spesiesnya, bahkan lebih besar dari singa");
    super.setAsal("Kucing besar ini mampu hidup di manapun, dari hutan dataran rendah sampai hutan pegunungan, dan tinggal di banyak tempat yang tak terlindungi");
    super.setJumlah(3900);
    super.setMacan("Harimau juga adalah kucing tercepat kedua dalam berlari, setelah citah ");
    super.setBurung("Dalam keseluruhan karnivora, harimau adalah kucing karnivora terbesar dan karnivora terbesar ketiga setelah beruang kutub dan beruang coklat.");
    super.setBanyak(320);
    this.setLoreng(600);
    System.out.println("Hewan "+getNama());
    System.out.println(getAsal());
    System.out.println("Populasi liar diperkirakan "+getJumlah()+  " ekor");
    System.out.println(getMacan());
    System.out.println("Pada umumnya harimau jantan memiliki berat " +getBanyak() +"kg");
    System.out.println(getBurung());
    System.out.println(getData());
    System.out.println("sebagian yang berburu adalah singa "+getKelamin());
    System.out.println("Sebaliknya jumlah harimau sumatera hanya " +getLoreng()+ " ekor  yang tersisa");

}
public kapsul(String data,String kelamin)
{
    this.setData(data);
    this.setKelamin(kelamin);
}

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    public int getLoreng() {
        return loreng;
    }

    public void setLoreng(int loreng) {
        this.loreng = loreng;
    }
}
