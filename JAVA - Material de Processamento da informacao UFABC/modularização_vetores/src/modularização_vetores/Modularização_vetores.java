package modularização_vetores;
import java.util.Scanner;
public class Modularização_vetores {
    static int v[] = new int [4];
    static int e[] = new int [4];
    static int b[] = new int [4];
    public static void main(String[] args) 
        {
        Scanner scan = new Scanner(System.in);
        int i;
        int a[] = new int [4];
        for(i=0;i<=3;i++) {
            System.out.print("Digite a ordem dos elementos do vetor: ");
            v[i]=scan.nextInt();
        }
        
        b= gerainverso(v);          
        System.out.println("O vetor invertido: "+b[i]);
    }
    public static int [] gerainverso(int v[]){
        int i,j=4;

        for (i=0;i<4;i++)
        for (j=4;j>0;j--){
            e[j] = v[i];
            j--;
        }
        return e;
        }    
}
