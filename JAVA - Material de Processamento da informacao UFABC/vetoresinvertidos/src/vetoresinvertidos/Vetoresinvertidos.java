
package vetoresinvertidos;
import java.util.Scanner;
public class Vetoresinvertidos {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String elemento[] = new String[10];
        String memoria;
        int i,j=9;
        
        for(i=0;i<=9;i++) {
            System.out.println("Digite o valor "+(i+1)+" :");
            elemento[i] = scan.nextLine(); 
        }
        for(i=0;i<=9/2;i++) {
            memoria = elemento[i];
            elemento[i]=elemento[j];
            elemento[j]=memoria;
            j--;
        }
            for(i=0;i<=9;i++) {
            System.out.print("\n"+elemento[i]);
        }
    }
    
}
