package Source;

import Interface.soucer;

import java.io.Serializable;
import java.util.Scanner;

public class Employee extends  Persion implements soucer, Serializable {
    private String sdt, caLam;
    private double hsl, luongCoBan;
    private double luongNhan;
    public Employee(String id, String name, String sdt, String caLam, double hsl, double luongCoBan) {
        super(id, name);
        this.caLam = caLam;
        this.hsl = hsl;
        this.luongCoBan = luongCoBan;
        this.sdt = sdt;
    }
    public Employee(){}
    public Employee(Employee another){
        super(another.getId(), another.getName());
        this.sdt = another.sdt;
        this.caLam = another.caLam;
        this.hsl = another.hsl;
        this.luongCoBan = another.luongCoBan;
    }


    @Override
    public void setWae(){
        this.luongNhan = this.hsl * this.luongCoBan;
    }

    public String getSdt() {
        return sdt;
    }

    public String getCaLam() {
        return caLam;
    }

    public double getHsl() {
        return hsl;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public double getLuongNhan() {
        return luongNhan;
    }

    public void setLuongNhan(double luongNhan) {
        this.setWae();
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    public void setCaLam(String caLam) {
        this.caLam = caLam;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public void out(){
        System.out.printf("%10s%10s\n", id, caLam);
    }
    public void output(){
//        super(id, name);
//        this.caLam = caLam;
//        this.hsl = hsl;
//        this.luongCoBan = luongCoBan;
//        this.sdt = sdt;
        System.out.printf("%10s%20s%5s%5f%10f\n", id, name, caLam, hsl, luongCoBan);
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id: ");
        this.id = sc.nextLine();
        System.out.print("Nhap ten: ");
        this.name = sc.nextLine();
        System.out.print("Nhap sdt: ");
        this.sdt = sc.nextLine();
        System.out.print("Nhap ca lam: ");
        this.caLam = sc.nextLine();
        System.out.print("Nhap hsl: ");
        this.hsl = sc.nextInt();
        System.out.print("Nhap luong co ban: ");
        this.luongCoBan = sc.nextDouble();

    }
}
