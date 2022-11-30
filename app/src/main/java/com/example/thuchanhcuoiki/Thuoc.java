package com.example.thuchanhcuoiki;

public class Thuoc {
    private String tentacgia;
    private String namsinh;
    private String quequan;
    private int hinh;

    public Thuoc(String tentacgia, String namsinh, String quequan, int hinh) {
        this.tentacgia = tentacgia;
        this.namsinh = namsinh;
        this.quequan = quequan;
        this.hinh = hinh;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void getTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void getNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void getQuequan(String quequan) {
        this.quequan = quequan;
    }


    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
