package lambdaExpression;

public class Sintaxis {
    public  void calcular(){

        Operacion operacion1=(double x,double y) -> {return (x+y)/2;};
        System.out.println(operacion1.calcularPromedio(2,3));
    }
    public static void main(String[] args) {
        Sintaxis e=new Sintaxis();
        e.calcular();
    }
}
