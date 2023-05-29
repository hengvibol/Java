package HashTable;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        //Creating a hash table
        Hashtable<String,String> obj = new Hashtable<String,String>();
        Hashtable<String,String> obj1 = new Hashtable<String,String>();
        obj.put("ETEC1001","HENG VIBOL");
        obj.put("ETEC1002","MENG");
        obj.put("ETEC1003","ORY");
        //Create a clone or shallow copy of hash table obj
        obj1 = (Hashtable<String, String>)obj.clone();
        //checking clone obj1
        System.out.println("Value in clone : "+obj1);
        //clear hash table obj
        obj.clear();
        //checking hash table obj
        System.out.println("After clearing : "+obj);
    }
}
