package com.example.SpringDataJPAPractice.repository;

import com.example.SpringDataJPAPractice.entity.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Integer> {
    @Query(value = "select * from maybay where tam_bay >10000", nativeQuery = true)
    List<MayBay> getChuyenBaysByTamBay();

    @Query(value = "select count(*) from maybay where loai like '%Boeing%'", nativeQuery = true)
    Long countByLoai();

    @Query(value = "SELECT MAYBAY.MAMB\n" +
            "FROM CHUNGNHAN\n" +
            "INNER JOIN MAYBAY ON CHUNGNHAN.MAMB = MAYBAY.MAMB\n" +
            "INNER JOIN NHANVIEN ON CHUNGNHAN.MANV = NHANVIEN.MANV\n" +
            "WHERE NHANVIEN.ten like '%Nguyen%'\n" +
            "GROUP BY MAYBAY.MAMB", nativeQuery = true)
    List<Integer> getMayBayByTenNhanVien();

    @Query(value = "select Loai from maybay where tam_bay < (select do_dai from chuyenbay where MaCB = 'VN280')\n", nativeQuery = true)
    List<String> getLoaiMayBayByChuyenBay();
}
