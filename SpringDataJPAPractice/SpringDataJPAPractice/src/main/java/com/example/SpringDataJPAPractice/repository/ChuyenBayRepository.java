package com.example.SpringDataJPAPractice.repository;

import com.example.SpringDataJPAPractice.entity.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
    @Query(value = "select * from chuyenbay where ?1=ga_den", nativeQuery = true)
    List<ChuyenBay> getChuyenBaysByGaDen(String gaDen);

    @Query(value = "select * from chuyenbay where do_dai < 10000 and do_dai > 8000", nativeQuery = true)
    List<ChuyenBay> getChuyenBaysByDoDai();

    @Query(value = "select * from chuyenbay where ga_di = 'SGN' and ga_den = 'BMV'", nativeQuery = true)
    List<ChuyenBay> getChuyenBaysByGaDiAndGaDen();

    @Query(value = "select count(*) from chuyenbay where ga_di = 'SGN'", nativeQuery = true)
    Long countChuyenBayByGaDi();

    @Query(value = "SELECT * from chuyenbay where do_dai < ( select tam_bay from maybay where Loai =N'Airbus A320')", nativeQuery = true)
    List<ChuyenBay> getChuyenBaysByMayBay();

    @Query(value = "select ga_di, count(*) as SoChuyenBay from chuyenbay\n" +
            "group by ga_di", nativeQuery = true)
    List<Object[]> countSoChuyenBayByGaDi();

    @Query(value = "select ga_di, sum(chi_Phi) as Tongchiphi from chuyenbay\n" +
            "group by ga_di", nativeQuery = true)
    List<Object[]> tongChiPhiTraChoNhanVien();

    @Query(value = "select * from chuyenbay where gio_di <'12:00:00'", nativeQuery = true)
    List<ChuyenBay> khoiHanhTruoc12h();

    @Query(value = "select ga_di, count(*) as soluong from chuyenbay where gio_di<'12:00:00'\n" +
            "group by ga_di", nativeQuery = true)
    List<Object[]> countChuyenBayTruoc12h();
}


