package Collection;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        //ArrayList<Datatype> obj = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        // Methods input 
        list.add("ORY");//index 0
        list.add("Meng");//index 1
        list.add("BOl");//index 2
        
        //Methods uotput 
        System.out.println(list.get(0));//get index
        
        //uotput all for lool
        
        for(int i=0;i<list.size();i++){   //Method size count array list
            System.out.println(list.get(i));
        }
        
        
    }
}
