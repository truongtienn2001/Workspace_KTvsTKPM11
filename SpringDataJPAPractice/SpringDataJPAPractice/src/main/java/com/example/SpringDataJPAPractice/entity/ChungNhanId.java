package com.example.SpringDataJPAPractice.entity;

import java.io.Serializable;
import java.util.Objects;

public class ChungNhanId implements Serializable {

    private String MaNV;

    private Integer MaMB;

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

    public ChungNhanId() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChungNhanId that = (ChungNhanId) o;
        return MaNV.equals(that.MaNV) && MaMB.equals(that.MaMB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MaNV, MaMB);
    }
}
