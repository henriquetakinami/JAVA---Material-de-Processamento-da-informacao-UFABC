package somacolk;
import java.util.Scanner;
public class SomaColK {

    public static void main(String[] args) {
       //declarando matrizes      
       Scanner scan = new Scanner(System.in); //implementação do Scanner 
        
       int A[][] = new int[3][3];
       int B[][] = new int[4][4];
       int k, soma1, soma2;
       //chama a função para ler uma matriz A   
       System.out.println("Digite os elementos da Matriz A:__________ \n");
       LeMatriz(A, 3);
       //chama a função para ler uma matriz B 
       System.out.println("Digite os elementos da Matriz B:__________ \n");
       LeMatriz(B, 4);
       // Solicite a digitação do valor de k
       System.out.print("Por favor, digite o valor de k: "); // k é o número da coluna que vai ser somada
       k = scan.nextInt();
       
       //"....." 
       soma1 = SomaElementosColuna(A,3, k);
       soma2 = SomaElementosColuna(B,4, k);
       System.out.println("\n A soma da coluna : " + k + " da matriz A = "+ soma1);
       System.out.println("\n A soma da coluna : " + k + " da matriz B = "+ soma1);
      
   }

    public static void LeMatriz(int m[][], int n){
//você deverá implementar
      // implementação da chamada do vetor
        Scanner scan = new Scanner(System.in);//implementação do scanner dentro do módulo
        int linha = m.length; // número de linhas da matriz
        int coluna = m[0].length; // número de colunas da matriz
               
        System.out.print("Valores da matriz: \n");
        for(linha=0;linha<n;linha++) {
            System.out.printf("Informe os elementos da  linha "+ (linha+1)+"\n");
            for(coluna=0;coluna<n;coluna++) {
                System.out.printf("coluna "+(coluna+1)+" :");
                m[linha][coluna]=scan.nextInt();
            }
            System.out.printf("\n");           
        }       
    }
    public static int  SomaElementosColuna (int m[][], int n, int k){  
      ///travar a coluna e ir variando o número da linha..
        int f=0;// f vai ser a soma/acumulador
        LeMatriz(m,n);
        int linha = m.length; // número de linhas da matriz
        int coluna = m[0].length; // número de colunas da matriz
        for(linha=0;linha<n;linha++) {
            f=m[linha][k]+f;
        }
        return f;                 
        }       
}


