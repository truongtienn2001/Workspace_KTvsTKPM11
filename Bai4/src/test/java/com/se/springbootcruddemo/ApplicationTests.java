package com.se.springbootcruddemo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.se.springbootcruddemo.entity.ChungNhan;
import com.se.springbootcruddemo.entity.ChuyenBay;
import com.se.springbootcruddemo.entity.MayBay;
import com.se.springbootcruddemo.entity.NhanVien;
import com.se.springbootcruddemo.service.ChungNhanService;
import com.se.springbootcruddemo.service.ChuyenBayService;
import com.se.springbootcruddemo.service.MayBayService;
import com.se.springbootcruddemo.service.NhanVienService;

@SpringBootTest
class ApplicationTests {
	@Autowired
	ChuyenBayService chuyenBayService;
	@Autowired
	MayBayService mayBayService;
	@Autowired
	NhanVienService nhanVienService;
	@Autowired
	ChungNhanService chungNhanService;

//	1. Cho biết các chuyến bay đi Đà Lạt (DAD).
	@Test
	void testCau1() {
		List<ChuyenBay> chuyenBays = chuyenBayService.findByGaDen("DAD");
		System.out.println("các chuyến bay đi Đà Lạt (DAD) là: ");
		for (ChuyenBay chuyenBay : chuyenBays) {
			System.out.println(chuyenBay);
		}
	}

//  2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.
	@Test
	void testCau2() {
		List<String> mayBays = mayBayService.findByTamBayLonHon10000();
		System.out.println("các loại máy bay có tầm bay lớn hơn 10,000km: ");
		for (String mayBay : mayBays) {
			System.out.println(mayBay);
		}
	}

//	3. Tìm các nhân viên có lương nhỏ hơn 10,000.
	@Test
	void testCau3() {
		List<NhanVien> nhanViens = nhanVienService.findByLuongNhoHon10000();
		System.out.println("các nhân viên có lương nhỏ hơn 10,000. ");
		for (NhanVien nhanVien : nhanViens) {
			System.out.println(nhanVien);
		}
	}
//	4. Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km
	@Test
	void testCau4() {
		List<ChuyenBay> chuyenBays = chuyenBayService.findByDoDaiDBNhoHon10000VaLoHon8000();
		System.out.println("các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km: ");
		for (ChuyenBay chuyenBay : chuyenBays) {
			System.out.println(chuyenBay);
		}
	}
//	5. Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
	@Test
	void testCau5() {
		List<ChuyenBay> chuyenBays = chuyenBayService.findBySGtoBMT();
		System.out.println("các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV). ");
		for (ChuyenBay chuyenBay : chuyenBays) {
			System.out.println(chuyenBay);
		}
	}
//	6. Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).
	@Test
	void testCau6() {
		int tongChuyenBay = chuyenBayService.sumCBFromSG();
		System.out.println("các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV): "+tongChuyenBay);
	}
//	7. Có bao nhiêu loại máy báy Boeing.
	@Test
	void testCau7() {
		int sumMayBayBoeing =mayBayService.sumMayBayBoeing();
		System.out.println("Tong loại máy báy Boeing: "+sumMayBayBoeing);
	}
//	8. Cho biết tổng số lương phải trả cho các nhân viên.
	@Test
	void testCau8() {
		int sumLuong =nhanVienService.sumLuong();
		System.out.println("tổng số lương phải trả cho các nhân viên.: "+sumLuong);
	}
//	9. Cho biết mã số của các phi công lái máy báy Boeing
	@Test
	void testCau9() {
		List<String> listMaNV = chungNhanService.findByBoeing();
		System.out.println("mã số của các phi công lái máy báy Boeing. ");
		for (String maNV : listMaNV) {
			System.out.println(maNV);
			
		}
	}
//	10. Cho biết các nhân viên có thể lái máy bay có mã số 747.
	@Test
	void testCau10() {
		List<NhanVien> nhanViens = nhanVienService.findBymaMB747();
		System.out.println("các nhân viên có thể lái máy bay có mã số 747. ");
		for (NhanVien nhanVien : nhanViens) {
			System.out.println(nhanVien);
		}
	}
//	11. Cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái.
	@Test
	void testCau11() {
		List<String> listMaMB = mayBayService.findMaByNameNguyen();
		System.out.println("mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái. ");
		for (String maMB : listMaMB) {
			System.out.println(maMB);
			
		}
	}
//	12. Cho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus.
	@Test
	void testCau12() {
		List<String> listMaNV = nhanVienService.findMaByNVLaiBoeingVaAirbus();
		System.out.println("mã số của các phi công vừa lái được Boeing vừa lái được Airbus. ");
		for (String maNV : listMaNV) {
			System.out.println(maNV);
			
		}
	}
//	13. Cho biết các loại máy bay có thể thực hiện chuyến bay VN280
	@Test
	void testCau13() {
		List<String> listLoaiMB = mayBayService.findLoaiByCBVN280();
		System.out.println("các loại máy bay có thể thực hiện chuyến bay VN280 ");
		for (String loaiMB : listLoaiMB) {
			System.out.println(loaiMB);
			
		}
	}
//	14. Cho biết các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320
	@Test
	void testCau14() {
		List<ChuyenBay> chuyenBays = chuyenBayService.findCBByMBAirbusA320();
		System.out.println("các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320 ");
		for (ChuyenBay chuyenBay : chuyenBays) {
			System.out.println(chuyenBay);
		}
	}
//	15. Cho biết tên của các phi công lái máy bay Boein
	@Test
	void testCau15() {
		List<String> listTenNV = nhanVienService.findTenByNVLaiBoeing();
		System.out.println("tên của các phi công lái máy bay Boein ");
		for (String tenNV : listTenNV) {
			System.out.println(tenNV);
			
		}
	}
//	16. Với mỗi loại máy bay có phi công lái cho biết mã số, loại máy báy và tổng số phi công có thể lái loại máy bay đó.
	@Test
	void testCau16() {
		List<Object[]> objects =  mayBayService.findMaLoaiVaTongPhiCong();
		System.out.println("Với mỗi loại máy bay có phi công lái cho biết mã số, loại máy báy và tổng số phi công có thể lái loại máy bay đó: ");
		for (Object[] objects2 : objects) {
			System.out.println("MaMB: " + objects2[0] + ", Loai: " + objects2[1] + ", So luong phi cong: " + objects2[2]);
		}
	}
//	17. Giả sử một hành khách muốn đi thẳng từ ga A đến ga B rồi quay trở về ga A. Cho biết các
//	đường bay nào có thể đáp ứng yêu cầu này.
	@Test
	void testCau17() {
		List<ChuyenBay> chuyenBays = chuyenBayService.findDBFromAtoBAndToA();
		System.out.println("các đường bay bay từ ga A đến ga B rồi quay trở về ga A: ");
		for (ChuyenBay chuyenBay : chuyenBays) {
			System.out.println(chuyenBay);
		}
	}
//	18. Với mỗi ga có chuyến bay xuất phát từ đó cho biết có bao nhiêu chuyến bay khởi hành từ ga 
//	đó.
	@Test
	void testCau18() {
		List<Object[]> objects =  chuyenBayService.countChuyenBayKhoiHanh();
		System.out.println("Với mỗi ga có chuyến bay xuất phát từ đó cho biết có bao nhiêu chuyến bay khởi hành từ ga \n"
				+ "	đó.");
		for (Object[] objects2 : objects) {
			System.out.println("Ga di: " + objects2[0] + ", So luong chuyen bay: " + objects2[1]);
		}
	}

//	22. Cho biết mã số của các phi công chỉ lái được 3 loại máy bay
	@Test
	void testCau22() {
		List<String> listMaNV = nhanVienService.findMaNVChiLaiDuoc3LoaiMayBay();
		System.out.println("mã số của các phi công chỉ lái được 3 loại máy bay ");
		for (String maNV : listMaNV) {
			System.out.println(maNV);
			
		}
	}
//	23. Với mỗi phi công có thể lái nhiều hơn 3 loại máy bay, cho biết mã số phi công và tầm bay lớn 
//	nhất của các loại máy bay mà phi công đó có thể lái.
	@Test
	void testCau23() {
		List<Object[]> objects =  nhanVienService.findMaNVLaiDuocHon3LoaiMayBayVaMaxTamBay();
		System.out.println("Với mỗi phi công có thể lái nhiều hơn 3 loại máy bay, cho biết mã số phi công và tầm bay lớn \n"
				+ "nhất của các loại máy bay mà phi công đó có thể lái.");
		for (Object[] objects2 : objects) {
			System.out.println("Ma NV: " + objects2[0] + ", Tam bay lon nhat: " + objects2[1]);
		}
	}
//	24. Với mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi công đó có thể lái.
	@Test
	void testCau24() {
		List<Object[]> objects =  nhanVienService.findMaNVAndCountLoaiMayBayCoTheLai();
		System.out.println("Với mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi công đó có thể lái.");
		for (Object[] objects2 : objects) {
			System.out.println("Ma NV: " + objects2[0] + ", tổng số loại máy bay: " + objects2[1]);
		}
	}
//	25. Tìm các nhân viên không phải là phi công.
	@Test
	void testCau25() {
		List<NhanVien> nhanViens = nhanVienService.findNVKhongPhaiPhiCong();
		System.out.println("các nhân viên không phải là phi công. ");
		for (NhanVien nhanVien : nhanViens) {
			System.out.println(nhanVien);
		}
	}
//	26. Cho biết mã số của các nhân viên có lương cao nhất.
	@Test
	void testCau26() {
		List<String> listMaNV = nhanVienService.findNVMaxLuong();
		System.out.println("mã số của các nhân viên có lương cao nhất. ");
		for (String maNV : listMaNV) {
			System.out.println(maNV);
			
		}
	}
//	27. Cho biết tổng số lương phải trả cho các phi công
	@Test
	void testCau27() {
		int tongSoLuong=nhanVienService.tongSoLuongPhaiTra();
		System.out.println("tổng số lương phải trả cho các phi công: "+tongSoLuong);
		
	}
//	28. Tìm các chuyến bay có thể được thực hiện bởi tất cả các loại máy bay Boeing
	@Test
	void testCau28() {
		List<ChuyenBay> chuyenBays = chuyenBayService.findCBDuocLaiBoiBoeing();
		System.out.println("các chuyến bay có thể được thực hiện bởi tất cả các loại máy bay Boeing ");
		for (ChuyenBay chuyenBay : chuyenBays) {
			System.out.println(chuyenBay);
		}
	}
}
