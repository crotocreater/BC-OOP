package Control;

import java.io.Serializable;

import Enum.stack;

public class control implements Serializable {
    public static ShopManage controlMange = new ShopManage();
    public static void set(stack a) throws  Exception{
        switch (a){
            case xoaHoaDon ->  controlMange.xoaHoaDon();
            case themHoaDon -> controlMange.themHoaDon();
            case theSanPham -> controlMange.theSanPham();
            case xoaSanPham -> controlMange.xoaSanPham();
            case xoaNhanVien -> controlMange.xoaNhanVien();
            case themKhacHang -> controlMange.themKhacHang();
            case themNhanVien -> controlMange.themNhanVien();
            case xoaKhachHang -> controlMange.xoaKhachHang();
            case xuatDanhSachKH -> controlMange.xuatDanhSachKH();
            case XuatDanhSachHoaDon -> controlMange.XuatDanhSachHoaDon();
            case CapNhatThongTinShop -> controlMange.CapNhatThongTinShop();
            case xuatDanhSachSanPham -> controlMange.xuatDanhSachSanPham();
            case xuatDangSachNhanVien -> controlMange.xuatDangSachNhanVien();
            case capNhatCacSanPhamDaBanHet -> controlMange.capNhatCacSanPhamDaBanHet();
            case xuatHoaDon -> controlMange.xuatHD();
        };
    }
}
