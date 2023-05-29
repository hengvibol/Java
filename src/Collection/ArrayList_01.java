package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(200);
//        list.add(300);
//        list.add(400);
//        
//        // Method Clear() delete all array list
//        list.clear();
//        
//        //System.out.println(list);
//        System.out.println("------------------");
//        
//        list.add(200);
//        list.add(300);
//        list.add(400);
//        
//        // Method remove() delete only array list
//        list.remove(1);
//        //System.out.println(list);
//        System.out.println("------------------");
//        
//        list.add(200);
//        list.add(300);
//        list.add(400);
//        
//        //Method contains control in array list if have = true if not = false
//        System.out.println("Resutl = "+list.contains(200));
//        System.out.println("------------------");
        
        
        
//        list.add(200);
//        list.add(300);
//        list.add(400);
//        
//        //Methods Set for Update
//        list.set(2, 500);
//        System.out.println(list);
        
        //Method sort
        
        list.add(200);
        list.add(400);
        list.add(100);
        Collections.sort(list);// sort small to big
        Collections.sort(list,Collections.reverseOrder());//sort big to small
        System.out.println(list);
        
        
    }
}
