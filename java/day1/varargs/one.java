class Test{
    public static void add(){
        System.out.println("zero argument");
    }
    public static void add(int a){
        System.out.println("one argument");
    }
    public static void add(int a,int b){
        System.out.println("two argument");
    } 
    public static void main(String[] args){
        add();
        add(10);
        add(10,20);
    }
}