package Array_Two_D;
public class example_01 {
    public static void main(String[] args) {
        //String name[][] = new String[10][5];//dec array two d
        //get value to array two d
        String name[][]={
        {"MENG","ORY","Sabath"},
        {"Piseth","Panha","Seyha"},
    };
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(name[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }
}
