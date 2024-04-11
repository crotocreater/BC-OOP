package Source;

import java.io.Serializable;
import java.util.Scanner;

public class Customer extends Persion implements Serializable {
    private String sdt;

    public Customer() {
    }

    public Customer(String id, String name, String sdt) {
        super(id, name);
        this.sdt = sdt;
    }

    public Customer(Customer another) {
        super(another.getId(), another.getName());
        this.sdt = another.sdt;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id KH: ");
        this.id = sc.nextLine();
        System.out.print("Nhap ten: ");
        this.name = sc.nextLine();
        System.out.print("Nhap sdt: ");
        this.sdt = sc.nextLine();
    }
    public void output(){
        System.out.printf("%10s%20s%15s\n", this.id, this.name, this.sdt);
    }
}
