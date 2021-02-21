
package projeto_final_pi;
import java.util.Scanner;// implementação da biblioteca
public class Projeto_final_pi {
    static int codigo;
    static int RG;
    static int cont;  // defini como o contador apenas para a execução do programa - também vai ser a RANGE do programa
    static int M[][]; // declarei a variável sala[M] como global pois é nela que vamos armazenar todos os dados, e ela estará ativa durante toda a execução  
    public static void main(String[] args)  {
    }
        public static void estatistica(int estat) { // vamos tentar associar o turno à alguma linha/coluna da coluna, assim as colunas/linhas serão as salas
        Scanner scan = new Scanner(System.in);//implementação do Scanner
        int codigo;// seria o caso de declarar como uma variável global??? caso precisemos dela fora deste escopo
        
        int linha = M.length; // número de linhas da matriz
        int coluna = M[0].length; // número de colunas da matriz // vamos colocar como o número de informações associadas à linha(código da sala)
        
        System.out.print("Digite o número(código da sala[m]: "); // vamos limitar as salas : 01,02 e 03(?)
        codigo = scan.nextInt();
        turnoporsala(M,codigo); // o melhor jeito seria colocar a linha como o código da sala, mas temos c[que limitar a qtd de linhas, ou algum modo de fazer com que ela pare de pedir informações
        
        
    }
        public static void turnoporsala(int M[][], int codigo) { // alguém sabe como declarar sala[m] como GLOBAL? caso precisemos
            Scanner scan = new Scanner(System.in);
            int turno,a,b,c; //turno a-manhã ; turno b-tarde ; turno c-noite // depois mudar para caracter
            int t1=0,t2=0,t3=0,i=0,j=0;
            for (c=0;c<=cont; c++){ // definida pelo escopo principal ou não hehe
            System.out.print("Por favor, digite o turno da visita (A - manhã; B - Tarde; C - noite"); // depois precisamos mudar para uma variável caracter
            turno = scan.nextInt();
            
            M[i][j] = scan.nextInt();
            i=cont;
           
            for (i=0;i<=cont;i++) { // soma dos bagulhos
            if (M[i][3]  == 'a') {
                t1++;
            }
            if (M[i][3] == 'b') {   // implementação do contador de turnos para fazer a estatística(?)
                t2++;
            }
            if (M[i][3] == 'c') {
                t3++;
            }
                     
        }
        
    }
    }       
            public static void naosaiu(int sala[][],int codigo,int RG){ 
            Scanner scan = new Scanner(System.in);
            char s,n,resposta;
            //for() {
            System.out.println("O visitante saiu da sala?(Digite S para Sim ou N para não: ");
            resposta = scan.next().charAt(0);
            while (resposta != 'n' || resposta !='s') {
                System.out.println("Por favor digite uma resposta válida");
                resposta = scan.next().charAt(0); // explicado pelo monitor de como armazenar o caracter dentro de um vetor
            }
            
            //}
        }
    
}
