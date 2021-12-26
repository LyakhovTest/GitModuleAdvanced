public class Adder {
    public int add(int a, int b){
        System.out.println("This is add method. new changes from 15 point");
        return a+b;
    }
    public int add(int a, int b, int c){
        System.out.println("This is add method for 3 params");
        return a+b+c;
    }
    public int add(int a, int b, int c, int d){
        System.out.println("This is add method for 4 params");
        return a+b+c+d;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
       try {
           return a/b;
       }catch (ArithmeticException arithmeticException){
           System.out.println("division by zero");
           return 0;
       }
    }
    public int mult(int a, int b){
        return a*b;
    }
    public double sqrt(double a){
        return Math.sqrt(a);
    }
}
