package com.example.SpringDataJPAPractice.service;

import com.example.SpringDataJPAPractice.entity.ChuyenBay;

import java.util.List;

public interface ChuyenBayService {
    List<ChuyenBay> getChuyenBaysByGaDen(String gaDen);

    List<ChuyenBay> getChuyenBaysByDoDai();

    List<ChuyenBay> getChuyenBaysByGaDiAndGaDen();

    Long countChuyenBayByGaDi();

    List<ChuyenBay> getChuyenBaysByMayBay();

    List<Object[]> countSoChuyenBayByGaDi();

    List<Object[]> tongChiPhiTraChoNhanVien();

    List<ChuyenBay> khoiHanhTruoc12h();

    List<Object[]> countChuyenBayTruoc12h();


}
