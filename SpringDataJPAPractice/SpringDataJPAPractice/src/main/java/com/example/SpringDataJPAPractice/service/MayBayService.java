package com.example.SpringDataJPAPractice.service;

import com.example.SpringDataJPAPractice.entity.MayBay;

import java.util.List;

public interface MayBayService {
    List<MayBay> getChuyenBaysByTamBay();

    Long countByLoai();

    List<Integer> getMayBayByTenNhanVien();

    List<String> getLoaiMayBayByChuyenBay();


}
