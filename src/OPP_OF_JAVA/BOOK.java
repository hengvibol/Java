package OPP_OF_JAVA;
import java.util.Scanner;

public class BOOK {
    private int code;
    private String title,author,publish;
    private float price;
    
    //Property
    public int getCode(){
        return code;
    }
    
    public String getTitle(){
        return title;
    }
    public float getPreic(){
        return price;
    }
    public void setCode(int code){
        this.code=code;
    }
     public void setTitle(String title){
         this.title=title;
     } 
     public void setAuthor(String author){
         this.author=author;

     }
     public void setPublish(String publish){
         this.publish=publish;
     }
     public void setPrice(float price){
         this.price=price;
     }
      public BOOK(){
         code=1007;
         title="SACHAPHAP";
         author="PHAJAVIKEY";
         publish="10/02/1009";
         price= 12.9f;
     }
      public BOOK(int code,String title,String author,String publish,float price){
          this.code=code;
          this.title=title;
          this.author=author;
          this.publish=publish;
          this.price=price;
      }
        
    public void Input(){
        Scanner cin= new Scanner(System.in);
        System.out.print("Enter Code    : ");code=cin.nextInt();
        System.out.print("Enter Title   : ");cin.nextLine();title= cin.nextLine();
        System.out.print("Enter Author  : ");author=cin.nextLine();
        System.out.print("Enter Publish : ");publish=cin.nextLine();
        System.out.print("Enter Price   : ");price=cin.nextFloat();
    }
    public static void header(){
        System.out.printf("%14s%15s%16s%17s%15s\n","CODE","TITLE","AUTHOR","PUBLISh","PRICE");
        System.out.printf("\t%10s\n","----------------------------------------------------------------------");
    }
    public void Output(){
        System.out.printf("%14d%15s%16s%17s%15.2f$\n",code,title,author,publish,price);
    }
}
class BookDetail{
    public static void main(String[] args) {
        int op,i = 0,n = 0,j;
        Scanner cin = new Scanner(System.in);
        BOOK bk[] = new BOOK[100];
        do{
            System.out.println("============= M E N N ==============");
            System.out.println("  1.Input  Information Books");
            System.out.println("  2.Output Information Books");
            System.out.println("  3.Search Information Books");
            System.out.println("  4.Update Information Books");
            System.out.println("  5.Delate Information Books");
            System.out.println("  6.Insert Information Books");
            System.out.println("  7.Sort   Information Books");
            System.out.println("  8.Add    Information Books");
            System.out.println("  9.Find the maximum price of books");
            System.out.println("  10.Find the minimum price of books");
            System.out.println("  11.Find same price of books");
            System.out.println("  12.Defaul costructor ");
            System.out.println("  13.Costructor With Parameter ");
            System.out.println("  0.Exit Program ");
            System.out.println("------------------------------------");
            System.out.print("Please one option : ");
            op=cin.nextInt();
            switch(op){
                case 1:{
                    System.out.print("Input number of Book : ");
                    n=cin.nextInt();
                    for(i=0;i<n;i++){
                        bk[i] = new BOOK();
                        bk[i].Input();
                    }
                }break;
                case 2:{
                    BOOK.header();
                    for(i=0;i<n;i++){
                        bk[i].Output();
                    }
                }break;
                case 3:{
                    int sid;
                    boolean b=false;
                    System.out.print("Input book's code for search : ");
                    sid=cin.nextInt();
                    for(i=0;i<n;i++){
                        if(sid==bk[i].getCode()){
                            BOOK.header();
                            bk[i].Output();
                            b=true;
                        }
                    }
                    if(b==false){
                        System.out.println("Search code not found...!");
                    }
                }break;
                case 4:{
                    String Stitle,Utitle;
                    int op1,op2 = 0;
                    boolean b=false;
                    System.out.print("Input book's title of search to update : ");
                    cin.nextLine();Stitle=cin.nextLine();
                    for(i=0;i<n;i++){
                      if(Stitle.equalsIgnoreCase(bk[i].getTitle())){
                          do{
                              System.out.println("========M E N U =========");
                              System.out.println("1.Update all information");
                              System.out.println("2.Update Some information");
                              System.out.println("-------------------------");
                              System.out.print("Please one option : ");
                              op1=cin.nextInt();
                              switch(op1){
                                  case 1:{
                                      for(i=0;i<n;i++){
                                          bk[i].Input();
                                          System.out.println("Update successful."); 
                                          break;
                                      }
                                  }break;
                                  case 2:{
                                     do{
                                        System.out.println("=== Update Book ===");
                                        System.out.println("  1.Update Code"); 
                                        System.out.println("  2.Update Title");
                                        System.out.println("  3.Update Author");
                                        System.out.println("  4.Update Publish");
                                        System.out.println("  5.Update Price");
                                        System.out.println("  0.exit Program");
                                        System.out.println("------------------");
                                        System.out.print("Please one option :");
                                        op2=cin.nextInt();
                                        switch(op2){
                                            case 1:{
                                                int ucode = 0;
                                                System.out.print("Input new code : ");
                                                ucode=cin.nextInt();
                                                bk[i].setCode(ucode);
                                                System.out.println("Update code success.");
                                            }break;
                                            case 2:{
                                                String utitle;
                                                System.out.print("Input new title : ");
                                                cin.nextLine();utitle=cin.nextLine();
                                                bk[i].setTitle(utitle);
                                                System.out.println("Update title success.");
                                            }break;
                                            case 3:{
                                                String uauthor;
                                                System.out.print("Input new author : ");
                                                cin.nextLine();uauthor=cin.nextLine();
                                                bk[i].setAuthor(uauthor);
                                                System.out.println("Update success.");
                                            }break;
                                            case 4:{
                                                String upublish;
                                                System.out.print("Input new publish : ");
                                                cin.nextLine();upublish=cin.nextLine();
                                                bk[i].setPublish(upublish);
                                                System.out.println("Update success.");
                                            }break;
                                            case 5:{
                                                float uprice;
                                                System.out.print("Input new price : ");
                                                uprice=cin.nextFloat();
                                                bk[i].setPrice(uprice);
                                                System.out.println("Update success.");
                                            } break;  
                                        }   //Switch2
                                        }while(op2!=0); 
                                  }break;
                                }//End switch 1
                          }while(op1!=0);
                          b=true;
                      }//end if condition
                    }//end for loop
                    if(b==false){
                        System.out.println("Search not found...!");
                    }
                }break;
                case 5:{
                    boolean b=false;
                    int scode;
                    System.out.print("Input code for search to dalete : ");
                    scode=cin.nextInt();
                   for(i=0;i<n;i++){
                       if(scode==bk[i].getCode()){
                           for(j=i;j<n;j++){
                               bk[j]=bk[j+1];           
                           }
                           n--;
                       }
                       b=true; 
                       System.out.println("Delet successful.");
                       break;
                   }
                   if(b==false){
                       System.out.println("search code for delete not found...!");
                   }
                }break;
                case 6:{
                   boolean b=false;
                   int scode;
                   System.out.print("Input code for search to inseart : ");
                   scode=cin.nextInt();  
                   for(i=0;i<n;i++){
                       if(scode==bk[i].getCode()){
                           for(j=n;j>i;j--){
                               bk[j]=bk[j-1];                              
                           }
                           n++;
                           bk[i]=new BOOK();
                           bk[i].Input();
                           System.out.println("Insert successful.\n");
                           b=true;
                           break;
                       }
                   }
                   if(b==false){
                       System.out.println("Search code for inseart not found...!");
                   }
                }break;
                case 7:{
                    BOOK temp =new BOOK();
                    boolean b=false;
                    BOOK.header();
                    for(i=0;i<n;i++){
                        for(j=i+1;j<n;j++){
                            if(bk[i].getCode()>bk[j].getCode()){
                                temp=bk[i];
                                bk[i]=bk[j];
                                bk[j]=temp;   
                            }   
                        }
                        
                        bk[i].Output();
                        b=true;
                    }
                    if(b==false){
                        System.out.println("Search code for sort not found...!");
                    }
                }break;
                case 8:{
                    int add;
                    System.out.print("How many do you want to add Books : ");
                    add=cin.nextInt();
                    for(i=n;i<n+add;i++){
                        bk[i]=new BOOK();
                        bk[i].Input();
                    }
                    n+=add;
                    System.out.println("Add successful.");
                }break;
                case 9:{
                    System.out.println("Find the maximum of books.");
                    BOOK.header();
                    float max=bk[0].getPreic();
                         for(i=0;i<n;i++){
                             if(bk[i].getPreic()>max){
                                max=bk[i].getPreic();   
                             }         
                         }
                         for(i=0;i<n;i++){
                             if(max==bk[i].getPreic()){
                                   bk[i].Output();
                                   break;
                                }
                         }
                }break;
                case 10:{
                    System.out.println("Find the maximum of books.");
                    BOOK.header();
                    float min=bk[0].getPreic();
                         for(i=0;i<n;i++){
                             if(bk[i].getPreic()<min){
                                min=bk[i].getPreic();   
                             }         
                         }
                         for(i=0;i<n;i++){
                             if(min==bk[i].getPreic()){
                                   bk[i].Output();
                                   break;
                                }
                         }
                }break;
                case 11:{
                    BOOK.header();
                        for(i=0;i<n;i++){
                          for(j=i+1;j<n;j++){
                              if(bk[i].getPreic()==bk[j].getPreic()){
                              bk[i].Output();
                              bk[j].Output();
                              }
                          }  
                        }
                }break;
                case 12:{
                    BOOK bok = new BOOK();
                    System.out.println("  12.Defaul costructor ");
                    BOOK.header();
                    bok.Output();
                }break;
                case 13:{
                   System.out.println("  13.Costructor With Parameter "); 
                   BOOK book = new BOOK(100,"SOTAMAK","MOKLEAN","12/12/102",15);
                   BOOK.header();
                   book.Output();
                }break;

            }
        }while(op!=0);
    }
}
