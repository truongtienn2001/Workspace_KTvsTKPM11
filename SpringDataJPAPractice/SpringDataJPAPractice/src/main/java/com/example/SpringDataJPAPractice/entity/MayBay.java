package com.example.SpringDataJPAPractice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class MayBay {
    @Id
    private Integer MaMB;

    @Column(columnDefinition = "varchar(50) default null")
    private String Loai;

    @Column(columnDefinition = "integer default null")
    private Integer TamBay;


    public MayBay() {

    }

    public Integer getMaMB() {
        return MaMB;
    }

    public void setMaMB(Integer maMB) {
        MaMB = maMB;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String loai) {
        Loai = loai;
    }

    public Integer getTamBay() {
        return TamBay;
    }

    public void setTamBay(Integer tamBay) {
        TamBay = tamBay;
    }

    public MayBay(Integer maMB, String loai, Integer tamBay) {
        MaMB = maMB;
        Loai = loai;
        TamBay = tamBay;
    }

    @Override
    public String toString() {
        return "MayBay{" +
                "MaMB=" + MaMB +
                ", Loai='" + Loai + '\'' +
                ", TamBay=" + TamBay +
                '}';
    }
}
