// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,  
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".  
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  


// Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
//Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em:
// latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00. 

//Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 2 situações:

// Comprar apenas latas de 18 litros;
// comprar apenas galões de 3,6 litros;
 
import java.util.Scanner;

public class LojaDeTintas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double areaCoberta = scanner.nextDouble();

    double litros = areaCoberta/6;
    int quantidadeGaloes;

    if(litros<=18)
    {
      quantidadeGaloes = 1;
    }
    else
    {
      quantidadeGaloes = (int) Math.ceil(litros/18);
    }
     
    int quantidadeLatas ;
    if(litros<=3.6)
    {
       quantidadeLatas = 1;
    }
    else
    {
      quantidadeLatas = (int) Math.ceil(litros/3.6);
    }

       


// TODO: Utilize a função Math.ceil() para arredondamento


    System.out.println("Quantidade(s) de lata(s) de tinta necessaria(s): " + (int) quantidadeLatas + " no valor R$ "  + quantidadeLatas * 25.0 );
    System.out.println("Quantidade(s) de galao(oes) de tinta necessaria(s): " + (int) quantidadeGaloes + " no valor R$ "  + quantidadeGaloes * 80.0);
  }
}