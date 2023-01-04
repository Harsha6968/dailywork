interface TestAbstract{
    public static final int x=449;
}
public class Abstract implements TestAbstract{
    public static void main(String[] args){
        Abstract a=new Abstract();
        System.out.println(a.x);
        System.out.println(x);
        System.out.println(Abstract.x);
    }
}