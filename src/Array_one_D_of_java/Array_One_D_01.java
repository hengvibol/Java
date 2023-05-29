package Array_one_D_of_java;
public class Array_One_D_01 {
    public static void main(String[] args) {
        // Method 1
        // get value to array
        int array[] = new int [100];
        array[0]=100;
        array[1]=200;
        array[2]=300;
        System.out.println("Array = "+array[0]);
        // Method 2
        // get value to array
        int arr[]={10,20,30,40};
        for(int i=0;i<arr.length;i++){//length count value array
            System.out.println("Array["+i+"]="+arr[i]);
        }
    }
}
