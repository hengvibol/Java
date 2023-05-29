package HashTable;

import java.util.Hashtable;
import java.util.Map;

public class BOOK {
    int id;
    String name,aithor,publisher;
    int qty;
    public BOOK(int id,String name,String author,String publisher,int qty){
        this.id=id;
        this.name=name;
        this.aithor=author;
        this.publisher=publisher;
        this.qty=qty;
    }
}
class HashtableBOOK{
    public static void main(String[] args) {
        //Creating map of Books
        Map<Integer,BOOK> map = new Hashtable<Integer,BOOK>();
        //Creating Books
        BOOK bk = new BOOK(100,"C/C++","VIBOL","ETEC1",8);
        BOOK bk1 = new BOOK(102,"JAVA,DART","MENG","ETEC2",9);
        BOOK bk2 = new BOOK(103,"FLUTTER","ORY","ETEC3",10);
        map.put(1, bk);
        map.put(2, bk1);
        map.put(3, bk2);
        //Traversing map
        for(Map.Entry<Integer,BOOK> entry:map.entrySet()){
            int key=entry.getKey();
            BOOK b=entry.getValue();
            System.out.println(key+" Details : ");
            System.out.println(b.id+" "+b.name+" "+b.aithor+" "+b.publisher+" "+b.qty);
        }
    }
}
