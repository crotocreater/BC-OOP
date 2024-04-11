package Source;

import Interface.soucer;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class BillSall implements Serializable {
    private String id, name;
    private double dongia;
    private String ngayLap;
    private Map<String, Integer> listProduct;

    public BillSall() {
        listProduct = new HashMap<>();
    }
    public BillSall(BillSall another) {
        this.id = another.id;
        this.name = another.name;
        this.dongia = another.dongia;
        this.ngayLap = another.ngayLap;
        this.listProduct = another.listProduct;
    }
    public BillSall(String id, String name, String ngayLap,double dongia, Map<String, Integer> listProduct) {
        this.id = id;
        this.name = name;
        this.ngayLap = ngayLap;
        this.dongia = dongia;
        this.listProduct = listProduct;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getDongia() {
        return dongia;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public Map<String, Integer> getListProduct() {
        return listProduct;
    }

    public void setListProduct(Map<String, Integer> listProduct) {
        this.listProduct = listProduct;
    }

    public void setNgayLap() {
        LocalDate currentDate = LocalDate.now();
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();
        this.ngayLap = day + "/" + month +"/"+year;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void out() {
        System.out.printf("%10s%20s%10s\n", this.id, this.name, this.ngayLap);
    }
    public void output(Shop a){
        a.output();
        this.out();
        System.out.println("Danh sach Hang duoc mua: ");
        for(Map.Entry<String,Integer> entry:this.listProduct.entrySet()){
            for(Product b:a.getProductList()){
                if (b.getId().equals(entry.getKey())){
                    b.out(entry.getValue());
                    this.dongia += b.getThanhtien();
                }
            }
        }
        System.out.println("Tong hoa don: "+ this.dongia);
        System.out.println("NV so: ");
        int index = new Random().nextInt(0, a.getEmployeeList().size());
        a.getEmployeeList().get(index);
    }
    public void inputA(){
        System.out.print("Nhap id HD: ");
        this.id = new Scanner(System.in).nextLine();
        System.out.print("Ten HD: ");
        this.name = new Scanner(System.in).nextLine();
        this.setNgayLap();
    }
    public void inputB(){
        System.out.print("Nhap so luong: ");
        int member = new Scanner(System.in).nextInt();
        for (int i =0;i<member;i++){
            System.out.print("Nhap id: ");
            String key = new Scanner(System.in).nextLine();
            System.out.print("Nhap so luong mua: ");
            int number = new Scanner(System.in).nextInt();
            this.listProduct.put(key, number);
        }
    }
}
