package HashTable;
import java.util.Hashtable;
import java.util.Map;
public class DemoHashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> obj = new Hashtable<Integer,String>();
        Hashtable<Integer,String> obj1 = new Hashtable<Integer,String>();
        obj.put(102,"RUPP");
        obj.put(103,"SETEC");
        obj.put(104,"ETEC");
        obj.put(105,"NIPTEC");
        
        //Update Method
        //obj.put(102,"RULE");
        
        //Delete all 
        //obj.clear();
        
       
        //get value RUPP
        //System.out.println(obj.get(102));
        
        //Remove value for key 103
        //obj.remove(103);
        
         
        //Search Contian method
       //boolean b=obj.contains("RUPP");// with value
//        boolean b=obj.containsKey(102);// with key
//        if(b){
//            System.out.println("Search found.");
//        }else{
//          System.out.println("Search not found.");  
//        }

        //Size method
        //System.out.println("Size of list : "+obj.size());
        
        
        
        //clone 
        obj1 = (Hashtable<Integer, String>)obj.clone();
         System.out.println("Key\tValue");
        for(Map.Entry<Integer,String> m : obj1.entrySet()){
            System.out.println(m.getKey()+"\t"+m.getValue());
        }
       
        
        
        System.out.println("Key\tValue");
        for(Map.Entry<Integer,String> m : obj.entrySet()){
            System.out.println(m.getKey()+"\t"+m.getValue());
        }
        
         
    }
}
