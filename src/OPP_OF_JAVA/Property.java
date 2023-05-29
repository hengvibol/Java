package OPP_OF_JAVA;
public class Property {
    private int id;
    private String Name;
    //Create Property Set 
    public void setID(int id){
        this.id=id;
    }
    public void setName(String name){
        this.Name=name;
    }
    
    //Create Property get
    public int getID(){
        return id;
    }
    public String getName(){
        return Name;
    }
}
class propertyDatial{
    public static void main(String[] args) {
        Property pt = new Property();
        pt.setID(1000);
        pt.setName("HENG VIBOL");
        
        System.out.println("ID   = "+pt.getID());
        System.out.println("Name = "+pt.getName());
    }
}
