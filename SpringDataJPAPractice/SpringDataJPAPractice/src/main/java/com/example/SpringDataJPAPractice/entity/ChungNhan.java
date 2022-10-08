package com.example.SpringDataJPAPractice.entity;

import javax.persistence.*;

@Table(name = "chungnhan")
@Entity
@IdClass(ChungNhanId.class)
public class ChungNhan {

    @Id
    private String MaNV;

    @Id
    private Integer MaMB;

    @ManyToOne
    @JoinColumn(name = "MaNV", insertable = false, updatable = false)
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "MaMB", insertable = false, updatable = false)
    private MayBay mayBay;

    public ChungNhan(String maNV, Integer maMB, NhanVien nhanVien, MayBay mayBay) {
        MaNV = maNV;
        MaMB = maMB;
        this.nhanVien = nhanVien;
        this.mayBay = mayBay;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public Integer getMaMB() {
        return MaMB;
    }

    public void setMaMB(Integer maMB) {
        MaMB = maMB;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public MayBay getMayBay() {
        return mayBay;
    }

    public void setMayBay(MayBay mayBay) {
        this.mayBay = mayBay;
    }

    public ChungNhan() {
    }
}
