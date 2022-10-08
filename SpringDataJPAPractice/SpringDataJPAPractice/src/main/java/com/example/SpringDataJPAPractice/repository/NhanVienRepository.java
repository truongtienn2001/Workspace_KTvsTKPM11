package com.example.SpringDataJPAPractice.repository;

import com.example.SpringDataJPAPractice.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
    @Query(value = "select * from nhanvien where Luong <10000", nativeQuery = true)
    List<NhanVien> getNhanViensByLuong();

    @Query(value = "select * from NhanVien where luong < :luong", nativeQuery = true)
    List<NhanVien> findNhanVienByLuong(@Param("luong") int luong);

    @Query(value = "select SUM(Luong) from nhanvien", nativeQuery = true)
    Long getAllLuong();

    @Query(value = "SELECT NHANVIEN.MANV\n" +
            "FROM CHUNGNHAN\n" +
            "INNER JOIN MAYBAY ON CHUNGNHAN.MAMB = MAYBAY.MAMB\n" +
            "INNER JOIN NHANVIEN ON CHUNGNHAN.MANV = NHANVIEN.MANV\n" +
            "WHERE LOAI like '%Boeing%'\n" +
            "GROUP BY NHANVIEN.MANV", nativeQuery = true)
    List<String> getMaNhanVienLaiMayBay();

    @Query(value = "SELECT NHANVIEN.MANV,\n" +
            "\tNHANVIEN.TEN,\n" +
            "\tNHANVIEN.LUONG\n" +
            "FROM CHUNGNHAN\n" +
            "INNER JOIN MAYBAY ON CHUNGNHAN.MAMB = MAYBAY.MAMB\n" +
            "INNER JOIN NHANVIEN ON CHUNGNHAN.MANV = NHANVIEN.MANV\n" +
            "WHERE CHUNGNHAN.MAMB = 747", nativeQuery = true)
    List<NhanVien> getNhanViensByChungNhan();

    @Query(value = "SELECT NHANVIEN.MANV\n" +
            "FROM CHUNGNHAN\n" +
            "INNER JOIN MAYBAY ON CHUNGNHAN.MAMB = MAYBAY.MAMB\n" +
            "INNER JOIN NHANVIEN ON CHUNGNHAN.MANV = NHANVIEN.MANV\n" +
            "WHERE (LOAI like '%Boeing%' OR LOAI like '%Airbus%')\n" +
            "GROUP BY NHANVIEN.MANV", nativeQuery = true)
    List<String> getMaNhanVienByLoaiMayBay();

    @Query(value = "SELECT NHANVIEN.TEN\n" +
            "FROM CHUNGNHAN\n" +
            "INNER JOIN MAYBAY ON CHUNGNHAN.MAMB = MAYBAY.MAMB\n" +
            "INNER JOIN NHANVIEN ON CHUNGNHAN.MANV = NHANVIEN.MANV\n" +
            "WHERE LOAI like '%Boeing%'\n" +
            "GROUP BY NHANVIEN.TEN", nativeQuery = true)
    List<String> getTenPhiCongLaiMayBayBoeing();

    @Query(value = "select * from nhanvien where manv not in (select manv from chungnhan)", nativeQuery = true)
    List<NhanVien> findNhanVienKhongPhaiPhiCong();

    @Query(value = "select manv from nhanvien where luong=(select max(luong) from nhanvien)", nativeQuery = true)
    List<String> getMaNhanVienCoMucLuongCaoNhat();

}
