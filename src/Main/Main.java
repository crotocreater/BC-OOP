package Main;


import Control.ShopManage;
import Control.control;
import Utils.FileIO;
import Enum.stack;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String []a){
        ShopManage shopManage = new ShopManage();
        shopManage = FileIO.fileO();
        while (true){
            System.out.println("1. themKhacHang \n" +
                    "2. themNhanVien\n" +
                    "3. theSanPham\n" +
                    "4. themHoaDon\n" +
                    "5. xoaNhanVien\n" +
                    "6. xoaSanPham\n" +
                    "7. xoaHoaDon\n" +
                    "8. xoaKhachHang,\n" +
                    "9. capNhatCacSanPhamDaBanHet\n" +
                    "10. xuatDanhSachSanPham\n" +
                    "11. xuatDangSachNhanVien\n" +
                    "12. xuatDanhSachKH\n" +
                    "13. XuatDanhSachHoaDon\n" +
                    "14. CapNhatThongTinShop\n" +
                    "15. xuatHoaDon\n" +
                    "0. thoat");
            int key = new Scanner(System.in).nextInt();
            stack e = null;
            switch  (key){
                case 1: e = stack.themKhacHang; break;
                case 2: e = stack.themNhanVien; break;
                case 3: e = stack.theSanPham; break;
                case 4: e = stack.themHoaDon; break;
                case 5: e = stack.xoaNhanVien; break;
                case 6: e = stack.xoaSanPham; break;
                case 7: e = stack.xoaHoaDon; break;
                case 8: e = stack.xoaKhachHang; break;
                case 9: e = stack.capNhatCacSanPhamDaBanHet; break;
                case 10: e = stack.xuatDanhSachSanPham; break;
                case 11: e = stack.xuatDangSachNhanVien; break;
                case 12: e = stack.xuatDanhSachKH; break;
                case 13: e = stack.XuatDanhSachHoaDon; break;
                case 14: e = stack.CapNhatThongTinShop; break;
                case 15: e = stack.xuatHoaDon; break;
                case 0: FileIO.fileI(shopManage); return;
                default:  continue;
            }
            try {
                control.set(e);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}