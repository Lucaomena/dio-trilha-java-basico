import javax.swing.plaf.synth.SynthSplitPaneUI;

public class OperadorRelacional {
    public static void main(String[] args) {
        String nomeUm = "GLEYSON";
        String nomeDois = new String("GLEYSON");

        System.out.println("1 " + nomeUm.equals(nomeDois));

        int numero1 = 1, numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 > numero2){
            System.out.println("a nossa condição é verdadeira");
        }   System.out.println("A nossa condição é falsa");

        System.out.println("Numero 1 é igual a numero 2 ? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero 1 é diferente de numero 2 ? " + simNao);

        simNao = numero1 >= numero2;

        System.out.println("Numero 1 é maior ou igual ao numero 2 ? " + simNao);

        simNao = numero1 <= numero2;

        System.out.println("Numero 1 é menor ou igual a numero 2 ? " + simNao);
    }
    
}
