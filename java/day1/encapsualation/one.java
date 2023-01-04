class Employee{
    private int eId;
    private String eName;
    public void seteId(int id){
        this.eId=id;
    }
    public int geteId(){
        return eId;
    }
    public void seteName(String Name){
        this.eName=Name;
    }
    public String geteName(){
        return eName;
    }
}
class Test{
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.seteId(101);
        e1.seteName("harsha");
        System.out.println(e1.geteId());
        System.out.println(e1.geteName());
        Employee e2=new Employee();
        e2.seteId(102);
        e2.seteName("Vardhan");
        System.out.println(e2.geteId());
        System.out.println(e2.geteName());
    }
}