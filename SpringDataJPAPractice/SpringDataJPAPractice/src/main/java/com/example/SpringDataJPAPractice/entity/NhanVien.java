package com.example.SpringDataJPAPractice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    @Column(columnDefinition = "varchar(9)")
    private String MaNV;
    @Column
    private String Ten;
    @Column
    private Integer Luong;

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public Integer getLuong() {
        return Luong;
    }

    public void setLuong(Integer luong) {
        Luong = luong;
    }

    public NhanVien(String maNV, String ten, Integer luong) {
        MaNV = maNV;
        Ten = ten;
        Luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "MaNV='" + MaNV + '\'' +
                ", Ten='" + Ten + '\'' +
                ", Luong=" + Luong +
                '}';
    }

    public NhanVien() {

    }
}
