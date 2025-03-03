package com.example.demo34.service;

import com.example.demo34.entity.SinhVien;

import java.util.HashMap;
import java.util.Map;

public class SinhVienService {
    private Map<String, SinhVien> danhSachSinhVien = new HashMap<>();
    public  boolean suaSinhVien(String maSV, String tenMoi){
        SinhVien sinhVien = danhSachSinhVien.get(maSV);
        if(sinhVien == null) return false;
        sinhVien.setTen(tenMoi);
        return true;

    }

    public void themSinhVien(SinhVien sinhVien){
        danhSachSinhVien.put(sinhVien.getTen(), sinhVien);
    }
}
