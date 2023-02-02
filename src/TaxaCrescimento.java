// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class TaxaCrescimento {
    public static void main(String[] args) {
        double A, B;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();
        
        int anos = 0;

        while(A <= B)
        {
            //  A - 100 pop
            //  x - 3
            anos++;
            A += A*0.03;
            B += B*0.015;
        }

        //TODO: retornar o número de anos necessários para que a população do país A ultrapasse ou iguale a população B
        
        System.out.println(anos + " anos");

        //país A : N habitantes com crescimento 3% ao ano
        //país B : M habitantes com crescimento 1.5% ao ano
        // Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
    }
}