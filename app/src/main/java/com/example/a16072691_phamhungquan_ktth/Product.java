package com.example.a16072691_phamhungquan_ktth;

public class Product { private int ma;
    private String ten;
    private String  donvi;
    private int gia;

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }



    public Product() {
        this.ma = 0;
        this.ten = null;
        this.donvi = null;
        this.gia = 0;
    }



    public Product(int ma, String ten, String donvi, int gia) {
        this.ma = ma;
        this.ten = ten;
        this.donvi = donvi;
        this.gia = gia;
    }


}
