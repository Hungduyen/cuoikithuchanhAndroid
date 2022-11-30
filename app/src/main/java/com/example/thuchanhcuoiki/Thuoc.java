package com.example.thuchanhcuoiki;

public class Thuoc {
    private String tenkhoahoc;
    private String tenthuonggoi;
    private String dactinh;
    private String congdung;
    private String lieudung;
    private String luuysudung;
    private int hinh;

    public Thuoc(String tenkhoahoc, String tenthuonggoi, String dactinh, String congdung, String lieudung,String luuysudung, int hinh) {
        this.tenkhoahoc = tenkhoahoc;
        this.tenthuonggoi = tenthuonggoi;
        this.dactinh = dactinh;
        this.congdung = congdung;
        this.lieudung = lieudung;
        this.luuysudung = luuysudung;
        this.hinh = hinh;
    }

    public String getTenkhoahoc() {
        return tenkhoahoc;
    }

    public void getTenkhoahoc(String tenkhoahoc) {
        this.tenkhoahoc = tenkhoahoc;
    }

    public String getTenthuonggoi() {
        return tenthuonggoi;
    }

    public void getTenthuonggoi(String tenthuonggoi) {
        this.tenthuonggoi = tenthuonggoi;
    }

    public String getDactinh() {
        return dactinh;
    }

    public void getDactinh(String dactinh) {
        this.dactinh = dactinh;
    }

    public String getCongdung() {
        return congdung;
    }

    public void setCongdung(String congdung) {
        this.congdung = congdung;
    }

    public String getLieudung() {
        return lieudung;
    }

    public void setLieudung(String lieudung) {
        this.lieudung = lieudung;
    }

    public String getLuuysudung() {
        return luuysudung;
    }

    public void setLuuysudung(String luuysudung) {
        this.luuysudung = luuysudung;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
