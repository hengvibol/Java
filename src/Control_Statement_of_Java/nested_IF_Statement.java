package Control_Statement_of_Java;
public class nested_IF_Statement {
    public static void main(String[] args) {
        String uname,pass,cpass;
        uname="Vibol";
        pass="123";
        cpass="123";
        if(uname.equals("Vibol"))
            if(pass.equals("123"))
                if(cpass.equals("123"))
                    System.out.println("Welcome to user login..!");
                
    }
}
