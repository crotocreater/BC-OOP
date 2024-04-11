package Control;

import Source.*;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ShopManage implements Serializable {
    private Shop shop;

    public ShopManage(Shop shop) {
        this.shop = shop;
    }

    public ShopManage() {
        this.shop = new Shop();
    }
    public ShopManage(ShopManage shopManage) {
        this.shop = shopManage.shop;
    }
    public void xoaHoaDon(){
        for(BillSall a:shop.getBillSallList()){
            a.out();
        }
        System.out.println("Nhap id hoa don");
        String id = new Scanner(System.in).nextLine();
        List<BillSall> k = shop.getBillSallList();
        for (int i=0;i<k.size();i++){
            if(k.get(i).getId().equals(id)){
                k.remove(i);
                break;
            }
        }
        shop.setBillSallList(k);
    }

    public void themHoaDon() {
        System.out.println("Nhap thong tin hoa don");
        BillSall a = new BillSall();
        Customer customer = new Customer();
        a.inputA();
        customer.input();
        this.shop.inputCustommer(customer);
        for(Product s: this.shop.getProductList()){
            s.out();
        }
        a.inputB();
        this.shop.inputBillSall(a);
        Map<String, Integer> d = a.getListProduct();
        List<Product> f = shop.getProductList();
        for(Map.Entry<String,Integer> entry:d.entrySet()){
            for(Product b:f){
                if (b.getId().equals(entry.getKey())){
                    b.setQuantiny(b.getQuantiny() - entry.getValue());
                }
            }
        }
        this.shop.setProductList(f);
    }
    public void theSanPham() {
        Product a = new Product();
        a.input();
        shop.inputProduct(a);
    }
    public void xoaSanPham() {
        for(Product a:shop.getProductList()){
            a.out();
        }
        System.out.println("Nhap id SP");
        String id = new Scanner(System.in).nextLine();
        List<Product> k = shop.getProductList();
        for (int i=0;i<k.size();i++){
            if(k.get(i).getId().equals(id)){
                k.remove(i);
                break;
            }
        }
        shop.setProductList(k);
    }
    public void xoaNhanVien() {
        for(Employee a:shop.getEmployeeList()){
            a.out();
        }
        System.out.println("Nhap id NV");
        String id = new Scanner(System.in).nextLine();
        List<Employee> k = shop.getEmployeeList();
        for (int i=0;i<k.size();i++){
            if(k.get(i).getId().equals(id)){
                k.remove(i);
                break;
            }
        }
        shop.setEmployeeList(k);
    }
    public void themKhacHang() {
        Customer customer = new Customer();
        customer.input();
        this.shop.inputCustommer(customer);
    }
    public void themNhanVien() {
        Employee customer = new Employee();
        customer.input();
        this.shop.inputEmployeeList(customer);
    }
    public void xoaKhachHang() {
        for(Customer a:shop.getCustomerList()){
            a.output();
        }
        System.out.println("Nhap id KH");
        String id = new Scanner(System.in).nextLine();
        List<Customer> k = shop.getCustomerList();
        for (int i=0;i<k.size();i++){
            if(k.get(i).getId().equals(id)){
                k.remove(i);
                break;
            }
        }
        shop.setCustomerList(k);
    }
    public void xuatDanhSachKH() {
        for(Customer a:shop.getCustomerList()){
            a.output();
        }
    }
    public void XuatDanhSachHoaDon() {
        for(BillSall a:shop.getBillSallList()){
            a.output(shop);
        }
    }
    public void CapNhatThongTinShop() {
        this.shop.input();
    }
    public void xuatDanhSachSanPham() {
        for(Product a:shop.getProductList()){
            System.out.println(a);
        }
    }
    public void xuatDangSachNhanVien(){
        for(Employee a:shop.getEmployeeList()){
            a.output();
        }
    }
    public void capNhatCacSanPhamDaBanHet(){
        for(Product a:shop.getProductList()){
            if (a.getQuantiny() == 0){
                System.out.println(a);
            }
        }
    }

    public void xuatHD() {
        this.shop.getBillSallList().getLast().output(shop);
    }
}
