package com.example.SpringDataJPAPractice.service.impl;

import com.example.SpringDataJPAPractice.entity.MayBay;
import com.example.SpringDataJPAPractice.repository.MayBayRepository;
import com.example.SpringDataJPAPractice.service.MayBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MayBayImpl implements MayBayService {
    @Autowired
    private MayBayRepository mayBayRepository;


    @Override
    public List<MayBay> getChuyenBaysByTamBay() {
        return mayBayRepository.getChuyenBaysByTamBay();
    }

    @Override
    public Long countByLoai() {
        return mayBayRepository.countByLoai();
    }

    @Override
    public List<Integer> getMayBayByTenNhanVien() {
        return mayBayRepository.getMayBayByTenNhanVien();
    }

    @Override
    public List<String> getLoaiMayBayByChuyenBay() {
        return mayBayRepository.getLoaiMayBayByChuyenBay();
    }
}
