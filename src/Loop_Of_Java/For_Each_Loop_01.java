package Loop_Of_Java;
public class For_Each_Loop_01 {
    public static void main(String[] args) {
        int [] number ={10,20,30,40,50};
        for(int x : number){
            System.out.print(x);
            System.out.print(",");
        }
        System.out.println("");
        String [] names = {"Vibol","Meng","Ory","Boy"};
        for(String name : names){
            System.out.print(name);
            System.out.print(",");
        }
    }
}
