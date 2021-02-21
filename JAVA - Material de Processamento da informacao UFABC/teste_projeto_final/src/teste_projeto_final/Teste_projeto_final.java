
package teste_projeto_final;
import java.util.Scanner;

public class Teste_projeto_final {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        
        int c=0, s;
        
        System.out.println("Digite um número");   // função principal provisória para teste da função. Iremos posteriormente colocar o 2 para registro de saida e 3 para estatÃ­stica
        s=entrada.nextInt();
        if(s==1){
            cadastramento(c);      
            c=c+1;                // contador das linhas da matriz de entrada
        }
    }
    static void cadastramento(int c){
        
        Scanner entrada1 = new Scanner(System.in);
        
        int j, M[][]= new int [c][4];
        
        System.out.println("Digite o RG do visitante");
        M[c][0]=entrada1.nextInt();
        System.out.println("Digite o número da sala a ser visitada");
        M[c][1]=entrada1.nextInt();
        System.out.println("Digite o horário de entrada do visitante (hhmm)");
        M[c][2]=entrada1.nextInt();
        System.out.println("Digite o código de motivo da visita            - código 1: Visita pessoal"
                + "                                                        - código 2: Entrega de documentos"
                + "                                                        - código 3: Retirada de documentos"
                + "                                                        - código 4: Festividade na área comum");
        M[c][3]=entrada1.nextInt();
        validamotivo(M,c);
    }
    static void validamotivo(int M[][], int c){
        
        
        Scanner entrada = new Scanner(System.in);
        
        while(M[c][3]!=1 || M[c][3]!=2 || M[c][3]!=3 || M[c][3]!=4){
            System.out.println("Digite novamente o código de visita, sendo eles de 1 á 4.  - código 1: Visita pessoal"
                + "                                                                        - código 2: Entrega de documentos"
                + "                                                                        - código 3: Retirada de documentos"
                + "                                                                        - código 4: Festividade na área comum");
        M[c][3]=entrada.nextInt();
        }
    }
}    
