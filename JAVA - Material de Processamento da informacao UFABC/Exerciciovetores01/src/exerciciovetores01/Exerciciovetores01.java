
package exerciciovetores01;
import java.util.Scanner;
public class Exerciciovetores01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome[] = new String[10];
        String inverso[] = new String[10];
        int cont=0,i,j;
        
        for(i=0;i<=9;i++) {
            System.out.println("Digite o nome do fulano "+(i+1)+ " : ");
            nome[i] = scan.nextLine();
                
        }
        for (i=9;i>=0;i--) {
            System.out.print("\n"+nome[i]+"\n");
        }

    }
    
}
