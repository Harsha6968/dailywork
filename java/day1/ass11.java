class Test{
    public static void main(String[] args){
        int a=45,b=42,c=35;
        if((a>b)&&(a>c)){
            if(b>c){
            System.out.println("ascending order:" + a + " "  + b + " "  + c);
            }
            else{
            System.out.println("ascending order:"+ a + " "  + c + " "  + b);
            } 
        }
        else if((b>c)&&(b>a)){
            if(c>a){
            System.out.println("ascending order:"+ b + " "  + c + " "  + a);
            }
            else{
            System.out.println("ascending order:"+ b + " "  + a + " "  + c);
            }
        }
        else{
            if(a>b){
            System.out.println("ascending order:"+ c + " "  + a + " "  + b);
            }
            else{
            System.out.println("ascending order:"+ c + " "  + b + " "  + a);
            }
        }

    }
}