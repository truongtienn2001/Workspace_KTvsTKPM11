package com.example.SpringDataJPAPractice.service.impl;

import com.example.SpringDataJPAPractice.entity.NhanVien;
import com.example.SpringDataJPAPractice.repository.NhanVienRepository;
import com.example.SpringDataJPAPractice.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienImpl implements NhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepository;

    @Override
    public List<NhanVien> getNhanViensByLuong() {
        return nhanVienRepository.getNhanViensByLuong();
    }

    @Override
    public Long getAllLuong() {
        return nhanVienRepository.getAllLuong();
    }

    @Override
    public List<String> getMaNhanVienLaiMayBay() {
        return nhanVienRepository.getMaNhanVienLaiMayBay();
    }

    @Override
    public List<NhanVien> getNhanViensByChungNhan() {
        return nhanVienRepository.getNhanViensByChungNhan();
    }

    @Override
    public List<String> getMaNhanVienByLoaiMayBay() {
        return nhanVienRepository.getMaNhanVienByLoaiMayBay();
    }

    @Override
    public List<String> getTenPhiCongLaiMayBayBoeing() {
        return nhanVienRepository.getTenPhiCongLaiMayBayBoeing();
    }

    @Override
    public List<NhanVien> findNhanVienKhongPhaiPhiCong() {
        return nhanVienRepository.findNhanVienKhongPhaiPhiCong();
    }

    @Override
    public List<String> getMaNhanVienCoMucLuongCaoNhat() {
        return nhanVienRepository.getMaNhanVienCoMucLuongCaoNhat();
    }

    @Override
    public void insertEmployee(NhanVien employee) {
        nhanVienRepository.save(employee);
    }

    @Override
    public List<NhanVien> findNhanVienByLuong(int luong) {
        return nhanVienRepository.findNhanVienByLuong(luong);
    }
}
