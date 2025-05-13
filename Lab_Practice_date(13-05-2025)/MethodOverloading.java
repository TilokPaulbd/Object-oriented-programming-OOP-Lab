public class MethodOverloading {
    static void myMethod(){
        System.out.println("Tilok paul");
    }
    static void myMethod(String arg){
        System.out.println("Name :"+arg);

    }
    static void myMethod(String arg1,String arg2){
        System.out.println("First Name :"+arg1 +" "+"last name :"+ arg2);

    }

    static void myMethod(String arg,int a){
        System.out.println("my name is :"+arg +"my id is :"+ a);

    }
    static void myMethod(int a,int b){
        System.out.println("Integer 1 :"+a+"Integer 2 :"+ b);
        int sum=a+b;
        System.out.println("sum :"+sum);

    }
    public static void main(String[] args) {
        myMethod();
        myMethod("Tilok Paul");
        myMethod("Tilok","paul");
        myMethod("Tilok paul ",690);
        myMethod(5,6);
    }
}
