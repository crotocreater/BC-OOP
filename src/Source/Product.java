package Source;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {
    private String id, name, type, size;
    private double quantiny, gianhap, giaBan, chietKhau, thanhtien;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public double getQuantiny() {
        return quantiny;
    }

    public double getGianhap() {
        return gianhap;
    }

    public double getChietKhau() {
        return chietKhau;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", quantiny='" + quantiny + '\'' +
                ", gianhap='" + gianhap + '\'' +
                ", giaBan='" + giaBan + '\'' +
                ", chietKhau='" + chietKhau + '\'' +
                '}';
    }

    public void setChietKhau(double chietKhau) {
        this.chietKhau = chietKhau;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = this.giaBan*thanhtien + this.giaBan*this.chietKhau*thanhtien;
    }

    public void setGianhap(double gianhap) {
        this.gianhap = gianhap;
    }

    public void setQuantiny(double quantiny) {
        this.quantiny = quantiny;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product() {
    }
    public Product(String id, String name, String type, String size, double quantiny, double gianhap, double giaBan,double chietKhau){
        this.id = id;
        this.name = name;
        this.type = type;
        this.giaBan = giaBan;
        this.size = size;
        this.quantiny = quantiny;
        this.gianhap = gianhap;
        this.chietKhau = chietKhau;
    }
    public Product(Product another){
        this.chietKhau = another.chietKhau;
        this.gianhap = another.gianhap;
        this.quantiny = another.quantiny;
        this.size = another.size;
        this.giaBan = another.giaBan;
        this.type = another.type;
        this.name = another.name;
        this.id = another.id;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id MH: ");
        this.id = sc.nextLine();
        System.out.print("Nhap Ten MH: ");
        this.name = sc.nextLine();
        System.out.print("Nhap loai MH: ");
        this.type = sc.nextLine();
        System.out.print("Nhap kich thuoc: ");
        this.size = sc.nextLine();
        System.out.print("Nhap gia ban ra: ");
        this.giaBan = sc.nextDouble();
        System.out.print("Nhap so luong hang co: ");
        this.quantiny = sc.nextDouble();
        System.out.print("Nhap gia nhap ve: ");
        this.gianhap = sc.nextDouble();
        System.out.print("Nhap chiet khuat: ");
        this.chietKhau = sc.nextDouble();
    }
    public void out(){
        System.out.printf("%10s%20s%5s\n", this.id, this.name, this.quantiny);
    }
    public void out(int a){
//        private String id, name, type, size;
//        private double quantiny, gianhap, giaBan, chietKhau;
        this.setThanhtien(a);
        System.out.printf("%10s%20s%10s%5s%5d%5.1f%10f%10f\n", id, name, type, size, a, chietKhau, giaBan, thanhtien);
    }

}
