package com.example.SpringDataJPAPractice.controller;

import com.example.SpringDataJPAPractice.entity.NhanVien;
import com.example.SpringDataJPAPractice.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
public class NhanVienController {

    @Autowired
    private NhanVienService nhanVienService;

    @GetMapping("/nhanvien/{luong}")
    public List<NhanVien> findNhanVienByLuong(@PathVariable int luong) {
        return nhanVienService.findNhanVienByLuong(luong);
    }

    @PostMapping("/nhanvien")
    public NhanVien saveNhanVien(@RequestBody NhanVien nhanVien) {
        nhanVien.setMaNV("" + new Random().nextInt(1000));
        nhanVienService.insertEmployee(nhanVien);
        return nhanVien;
    }

}
