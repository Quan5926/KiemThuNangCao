package com.example.demo34.service;

import com.example.demo34.entity.SinhVien;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {
private SinhVienService service;
    @BeforeEach
    void setUp() {
        service = new SinhVienService();
        service.themSinhVien(new SinhVien("SV01", "Nguyen Van A",20,7.5f,3,"CNTT"));
    }

    @Test
    void suaSinhVien_ThanhCong() {
        assertTrue(service.suaSinhVien("SV01", "Nguyen Van B"));
    }

    @Test
    void suaSinhVien_KhongTonTai() {
        assertFalse(service.suaSinhVien("SV02", "Nguyen Van C"));
    }


    @Test
    void testValidate_KhongDeTrong(){
        assertThrows(IllegalArgumentException.class, () -> new SinhVien("SV02", "", 21, 8.0f,4,"KT"));
    }

    @Test
    void themSinhVien() {
    }
}