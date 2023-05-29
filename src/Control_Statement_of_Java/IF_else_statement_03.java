package Control_Statement_of_Java;
public class IF_else_statement_03 {
    public static void main(String[] args) {
        String uname,pass,cpass;
        uname="Vibol";
        pass="1234";
        cpass="1234";
        if(uname.equals("Vibol"))
            if(pass.equals("1234"))
                if(cpass.equals("1234"))
                    System.out.println("Welcome to user login..!");
                else
                    System.out.println("Invalid comfirm Password!");
            else 
                System.out.println("Invad Password!");
        else 
            System.out.println("Invalid User name!");
    }
}
