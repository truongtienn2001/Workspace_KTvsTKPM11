package com.example.SpringDataJPAPractice.service.impl;

import com.example.SpringDataJPAPractice.entity.ChuyenBay;
import com.example.SpringDataJPAPractice.repository.ChuyenBayRepository;
import com.example.SpringDataJPAPractice.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuyenBayImpl implements ChuyenBayService {

    @Autowired
    private ChuyenBayRepository chuyenBayRepository;


    @Override
    public List<ChuyenBay> getChuyenBaysByGaDen(String gaDen) {
        return chuyenBayRepository.getChuyenBaysByGaDen(gaDen);
    }

    @Override
    public List<ChuyenBay> getChuyenBaysByDoDai() {
        return chuyenBayRepository.getChuyenBaysByDoDai();
    }

    @Override
    public List<ChuyenBay> getChuyenBaysByGaDiAndGaDen() {
        return chuyenBayRepository.getChuyenBaysByGaDiAndGaDen();
    }

    @Override
    public Long countChuyenBayByGaDi() {
        return chuyenBayRepository.countChuyenBayByGaDi();
    }

    @Override
    public List<ChuyenBay> getChuyenBaysByMayBay() {
        return chuyenBayRepository.getChuyenBaysByMayBay();
    }

    @Override
    public List<Object[]> countSoChuyenBayByGaDi() {
        return chuyenBayRepository.countSoChuyenBayByGaDi();
    }

    @Override
    public List<Object[]> tongChiPhiTraChoNhanVien() {
        return chuyenBayRepository.tongChiPhiTraChoNhanVien();
    }

    @Override
    public List<ChuyenBay> khoiHanhTruoc12h() {
        return chuyenBayRepository.khoiHanhTruoc12h();
    }

    @Override
    public List<Object[]> countChuyenBayTruoc12h() {
        return chuyenBayRepository.countChuyenBayTruoc12h();
    }


}
