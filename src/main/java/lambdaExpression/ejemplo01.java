package lambdaExpression;
import java.util.*;

public class ejemplo01 {

    public void ordenar(){
        List<String> lista=new ArrayList<String>();
        lista.add("MItasf");
        lista.add("asfds");
        lista.add("asdfsvfsdf");
        Collections.sort(lista, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (String elemento:lista){
            System.out.println(elemento);
        }
        Collections.sort(lista,(String p1,String p2) -> p1.compareTo(p2) );
    }

    public  void calcular(){
        Operacion operacion=new Operacion() {
            @Override
            public double calcularPromedio(double n1, double n2) {
                return (n1+n2)/2;
            }
        };

        Operacion operacion1=(double x,double y) -> {
           int z=3;
           return  (x+y+z)/2;
        };
      System.out.println(operacion1.calcularPromedio(2,3));
    System.out.println(operacion.calcularPromedio(2,3));
    }
    public static void main(String[] args) {
        ejemplo01 e=new ejemplo01();
        e.ordenar();
        e.calcular();
    }

}

