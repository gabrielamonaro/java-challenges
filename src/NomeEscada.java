// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,  
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".  
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 


import java.util.*;

public class NomeEscada {
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.next();
        int i =0 ;
        String texto = "";
        for(i=0; i<palavra.length();i++)
        {
            texto += palavra.charAt(i);
            System.out.println(texto);
        }
        
        // TODO: Faça um programa que solicite o nome do usuário e imprima-o de forma a mostrar o nome em formato de escada
        
    }
}