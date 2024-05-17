public class Operadores {
    public static void main (String[] args) {

        // Concatenação

        // String nomeCompleto = "LINGUAGEM" + "JAVA";

        // System.out.println(nomeCompleto);

        // String concatenacao = "?";

        // concatenacao = 1+1+1+"1";

        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+1;

        // System.out.println(concatenacao);

        // concatenacao = "1"+1+1+1;

        // System.out.println(concatenacao);

        // concatenacao = "1"+(1+1+1);

        // System.out.println(concatenacao);
        //fim
         
        // unarios

        // int numero = 5;

        // System.out.println(- numero);
        // System.out.println(numero);

        // numero = - numero;
        // System.out.println(numero);

        // numero = numero * -1;
        // System.out.println(numero);

        // numero++;
        // System.out.println(numero);

        // numero--;
        // System.out.println(numero);

        // boolean variavel = true;

        // System.out.println(!variavel);

        //ternario

        int a, b;

        a = 5;
        b = 6;
        String resultado = a == b ? "verdadeiro" : "falso";
        // if(a == b)
        //     resultado = "verdadeiro";
        // else
        //     resultado = "falso";

        System.out.println(resultado);

        //Relacionais

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao );

        // Logicos
        boolean condicao1 = true;

        boolean condicao2 = true;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições sao verdadeiras");
        }
        
        if (condicao1 || condicao2) {
            System.out.println("uma das condições é verdadeira condições sao verdadeiras");
        }
        System.out.println("fim");
    }
}
