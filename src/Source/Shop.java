package Source;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Shop implements Serializable {
    private String name, address, phoneNumber;
    private List<Employee> employeeList;
    private List<Customer> customerList;
    private List<Product> productList;
    private List<BillSall> billSallList;
    public Shop(){
        this.customerList = new ArrayList<>();
        this.productList = new ArrayList<>();
        this.billSallList = new ArrayList<>();
        this.employeeList = new ArrayList<>();
    }
    public Shop(String name, String address, String phoneNumber, List<Employee> employeeList, List<Customer> customerList, List<Product> productList, List<BillSall> billSallList){
        this.address = address;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.billSallList = billSallList;
        this.employeeList = employeeList;
        this.customerList = customerList;
        this.productList = productList;
    }
    public Shop(Shop another){
        this.name = another.name;
        this.address = another.address;
        this.phoneNumber = another.phoneNumber;
        this.customerList = another.customerList;
        this.employeeList = another.employeeList;
        this.productList = another.productList;
        this.billSallList = another.billSallList;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public List<BillSall> getBillSallList() {
        return billSallList;
    }

    public void setBillSallList(List<BillSall> billSallList) {
        this.billSallList = billSallList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void inputEmployeeList(Employee e){
        this.employeeList.add(e);
        System.out.println("Suscess");
    }
    public void inputCustommer(Customer customer){
        this.customerList.add(customer);
        System.out.println("Suscess");
    }
    public void inputProduct(Product product){
        this.productList.add(product);
        System.out.println("Suscess");
    }
    public void inputBillSall(BillSall bill){
        this.billSallList.add(bill);
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten shop: ");
        this.name = sc.nextLine();
        System.out.print("Nhap sdt: ");
        this.phoneNumber = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        this.address = sc.nextLine();
    }
    public void output(){
        System.out.printf("%20s%20s%20s\n", this.name, this.address, this.phoneNumber);
    }
}
