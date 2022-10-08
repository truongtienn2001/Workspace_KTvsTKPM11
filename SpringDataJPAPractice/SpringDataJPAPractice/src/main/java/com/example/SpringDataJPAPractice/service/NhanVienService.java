package com.example.SpringDataJPAPractice.service;

import com.example.SpringDataJPAPractice.entity.NhanVien;

import java.util.List;

public interface NhanVienService {
    List<NhanVien> getNhanViensByLuong();

    Long getAllLuong();

    List<String> getMaNhanVienLaiMayBay();

    List<NhanVien> getNhanViensByChungNhan();

    List<String> getMaNhanVienByLoaiMayBay();

    List<String> getTenPhiCongLaiMayBayBoeing();

    List<NhanVien> findNhanVienKhongPhaiPhiCong();

    List<String> getMaNhanVienCoMucLuongCaoNhat();

    void insertEmployee(NhanVien employee);

    List<NhanVien> findNhanVienByLuong(int luong);

}
