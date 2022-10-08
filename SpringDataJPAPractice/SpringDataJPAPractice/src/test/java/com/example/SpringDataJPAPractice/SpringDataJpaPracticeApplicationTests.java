package com.example.SpringDataJPAPractice;

import com.example.SpringDataJPAPractice.entity.ChuyenBay;
import com.example.SpringDataJPAPractice.entity.MayBay;
import com.example.SpringDataJPAPractice.entity.NhanVien;
import com.example.SpringDataJPAPractice.service.ChuyenBayService;
import com.example.SpringDataJPAPractice.service.MayBayService;
import com.example.SpringDataJPAPractice.service.NhanVienService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringDataJpaPracticeApplicationTests {

    @Autowired
    ChuyenBayService chuyenBayService;
    @Autowired
    MayBayService mayBayService;

    @Autowired
    NhanVienService nhanVienService;

    @Test
    public void cau1() {
        List<ChuyenBay> chuyenBays = chuyenBayService.getChuyenBaysByGaDen("DAD");
        chuyenBays.forEach(chuyenBay -> {
            System.out.println(chuyenBay);
        });
    }

    @Test
    public void cau2() {
        List<MayBay> mayBays = mayBayService.getChuyenBaysByTamBay();
        mayBays.forEach(mayBay -> {
            System.out.println(mayBay);
        });
    }

    @Test
    public void cau3() {
        List<NhanVien> nhanViens = nhanVienService.getNhanViensByLuong();
        nhanViens.forEach(nhanVien -> {
            System.out.println(nhanVien);
        });
    }

    @Test
    public void cau4() {
        List<ChuyenBay> chuyenBays = chuyenBayService.getChuyenBaysByDoDai();
        chuyenBays.forEach(chuyenBay -> {
            System.out.println(chuyenBay);
        });
    }

    @Test
    public void cau5() {
        List<ChuyenBay> chuyenBays = chuyenBayService.getChuyenBaysByGaDiAndGaDen();
        chuyenBays.forEach(chuyenBay -> {
            System.out.println(chuyenBay);
        });
    }

    @Test
    public void cau6() {
        Long sochuyenbay = chuyenBayService.countChuyenBayByGaDi();
        System.out.println(sochuyenbay);
    }

    @Test
    public void cau7() {
        Long sochuyenbay = mayBayService.countByLoai();
        System.out.println(sochuyenbay);
    }

    @Test
    public void cau8() {
        Long luong = nhanVienService.getAllLuong();
        System.out.println(luong);
    }

    @Test
    public void cau9() {
        List<String> manv = nhanVienService.getMaNhanVienLaiMayBay();
        System.out.println(manv);
    }

    @Test
    public void cau10() {
        List<NhanVien> nhanViens = nhanVienService.getNhanViensByChungNhan();
        nhanViens.forEach(nhanVien -> {
            System.out.println(nhanVien);
        });
    }

    @Test
    public void cau11() {
        List<Integer> mayBays = mayBayService.getMayBayByTenNhanVien();
        mayBays.forEach(mayBay -> {
            System.out.println(mayBay);
        });
    }

    @Test
    public void cau12() {
        List<String> nhanViens = nhanVienService.getMaNhanVienByLoaiMayBay();
        nhanViens.forEach(nhanVien -> {
            System.out.println(nhanVien);
        });
    }

    @Test
    public void cau13() {
        List<String> mayBays = mayBayService.getLoaiMayBayByChuyenBay();
        mayBays.forEach(mayBay -> {
            System.out.println(mayBay);
        });
    }

    @Test
    public void cau14() {
        List<ChuyenBay> chuyenBays = chuyenBayService.getChuyenBaysByMayBay();
        chuyenBays.forEach(chuyenBay -> {
            System.out.println(chuyenBay);
        });
    }

    @Test
    public void cau15() {
        List<String> tens = nhanVienService.getTenPhiCongLaiMayBayBoeing();
        tens.forEach(ten -> {
            System.out.println(ten);
        });
    }

    @Test
    public void cau18() {
        List<Object[]> chuyenBays = chuyenBayService.countSoChuyenBayByGaDi();
        chuyenBays.forEach(chuyenBay -> {
            System.out.println("Ga di: " + chuyenBay[0] + "\t" + "So chuyen bay: " + chuyenBay[1]);
        });
    }

    @Test
    public void cau19() {
        List<Object[]> chuyenBays = chuyenBayService.tongChiPhiTraChoNhanVien();
        chuyenBays.forEach(chuyenBay -> {
            System.out.println("Ga di: " + chuyenBay[0] + "\t" + "Tong chi phi: " + chuyenBay[1]);
        });
    }

    @Test
    public void cau20() {
        List<ChuyenBay> chuyenBays = chuyenBayService.khoiHanhTruoc12h();
        chuyenBays.forEach(chuyenBay -> {
            System.out.println(chuyenBay);
        });
    }

    @Test
    public void cau21() {
        List<Object[]> chuyenBays = chuyenBayService.countChuyenBayTruoc12h();
        chuyenBays.forEach(chuyenBay -> {
            System.out.println("Ga di: " + chuyenBay[0] + "\t" + "So luong chuyen bay truoc 12h: " + chuyenBay[1]);
        });
    }

    @Test
    public void cau25() {
        List<NhanVien> nhanViens = nhanVienService.findNhanVienKhongPhaiPhiCong();
        nhanViens.forEach(nhanVien -> {
            System.out.println(nhanVien);
        });
    }

    @Test
    public void cau26() {
        List<String> nhanViens = nhanVienService.getMaNhanVienCoMucLuongCaoNhat();
        nhanViens.forEach(nhanVien -> {
            System.out.println(nhanVien);
        });
    }


}
