package com.example.SpringDataJPAPractice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalTime;

@Entity
@Table(name = "chuyenbay")
public class ChuyenBay {
    @Id
    @Column(columnDefinition = "varchar(5)")
    private String MaCB;
    @Column(columnDefinition = "varchar(50) default null")
    private String GaDi;
    @Column(columnDefinition = "varchar(50) default null")
    private String GaDen;
    private Integer DoDai;
    @Column
    private LocalTime GioDi;
    @Column
    private LocalTime GioDen;
    @Column
    private Integer ChiPhi;

    public ChuyenBay() {

    }

    public String getMaCB() {
        return MaCB;
    }

    public void setMaCB(String maCB) {
        MaCB = maCB;
    }

    public String getGaDi() {
        return GaDi;
    }

    public void setGaDi(String gaDi) {
        GaDi = gaDi;
    }

    public String getGaDen() {
        return GaDen;
    }

    public void setGaDen(String gaDen) {
        GaDen = gaDen;
    }

    public Integer getDoDai() {
        return DoDai;
    }

    public void setDoDai(Integer doDai) {
        DoDai = doDai;
    }

    public LocalTime getGioDi() {
        return GioDi;
    }

    public void setGioDi(LocalTime gioDi) {
        GioDi = gioDi;
    }

    public LocalTime getGioDen() {
        return GioDen;
    }

    public void setGioDen(LocalTime gioDen) {
        GioDen = gioDen;
    }

    public Integer getChiPhi() {
        return ChiPhi;
    }

    public void setChiPhi(Integer chiPhi) {
        ChiPhi = chiPhi;
    }

    public ChuyenBay(String maCB, String gaDi, String gaDen, Integer doDai, LocalTime gioDi, LocalTime gioDen, Integer chiPhi) {
        MaCB = maCB;
        GaDi = gaDi;
        GaDen = gaDen;
        DoDai = doDai;
        GioDi = gioDi;
        GioDen = gioDen;
        ChiPhi = chiPhi;
    }

    @Override
    public String toString() {
        return "ChuyenBay{" +
                "MaCB='" + MaCB + '\'' +
                ", GaDi='" + GaDi + '\'' +
                ", GaDen='" + GaDen + '\'' +
                ", DoDai=" + DoDai +
                ", GioDi=" + GioDi +
                ", GioDen=" + GioDen +
                ", ChiPhi=" + ChiPhi +
                '}';
    }
}
