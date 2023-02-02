// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.Scanner;

public class TempoDownload {

  public static void main(String[] Args) {

   Scanner sc = new Scanner(System.in);
   double tmhMB = sc.nextFloat();
   double tmhMbps = sc.nextFloat();


   //TODO: Calcule o tempo aproximado de download:
    

    double segundos = tmhMB/tmhMbps;

    double minutos = segundos/60;
    String resultado = String.format("%.2f", minutos);

    System.out.println(resultado);

   //TODO: Imprima o calculo do tempo, leve em consideração que a saída é um numero com duas casas decimais:       
    
    }
}