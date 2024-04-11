package Utils;

import Control.ShopManage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileIO {
    public static void fileI(ShopManage a){
        try(ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream("data.dat"))){
            obs.writeObject(a);
            System.out.println("Thanh cong!!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static ShopManage fileO(){
        ShopManage a = new ShopManage();
        try  (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.dat"))){
            a = (ShopManage) ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return  a;
    }
}
