package Operadores;
public class OperadorTernario {
    public static void main(String[] args) {
        int a,b;

        a = 5;
        b = 6;

        String resultado1 = a == b ? "verdadeiro" : "Falso";
        int resultado2 = a == b ? 1: 0;
         
               System.out.println("Resultado: " + resultado1);
               System.out.println("Resultado: " + resultado2);
    }
    
}
