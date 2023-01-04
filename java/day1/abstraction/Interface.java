interface Testinterface{
    public abstract void insertData();
    void setData();
}
 class Child implements Testinterface{
    public void insertData(){
        System.out.println("successfully inserting Data");
    }
    public void setData(){
        System.out.println("successfully setting the Data");
    }
}
public class Interface{
    public static void main(String[] args){
        Child c=new Child();
        c.insertData();
        c.setData();
    }

}