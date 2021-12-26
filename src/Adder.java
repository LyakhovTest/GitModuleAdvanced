public class Adder {
    public int add(int a, int b){
        return a+b;
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
