package matriz01;
import java.util.Scanner;
public class Matriz01 {

    public static void main(String[] args) {
        int c[][] = new int [14][2];
        int a[] = new int [14];
        int b[] = new int [14];
        
        Scanner scan = new Scanner(System.in);
        int i,j,k,l;
        
        for (i=0;i<14;i++) {
            System.out.print("Digite o valor a ser inserido em A: ");
            a[i] = scan.nextInt();
            c[i][0]=a[i]*5;       
        }
        for(j=0;j<14;j++) {
            System.out.print("Digite o valor a ser inserido em B: ");
            b[j] = scan.nextInt();
            c[j][1]=b[j]-2;
        }
        for(k=0;k<14;k++) {
            System.out.print("\n");
            for(l=0;l<2;l++) {
                System.out.print(c[k][l]+"   ");
            }
        } 
    }
    
}
