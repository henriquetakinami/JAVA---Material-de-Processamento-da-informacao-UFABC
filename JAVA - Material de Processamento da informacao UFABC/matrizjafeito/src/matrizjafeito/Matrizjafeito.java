
package matrizjafeito;
import java.util.Scanner;
public class Matrizjafeito {

    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);

    int n;
    System.out.print("Informe a ordem N da matriz quadrada: ");
    n = scan.nextInt();
    
    int i, j, k, soma;
    int a[][] = new int[n][n];
    int b[][] = new int[n][n];
    int ab[][] = new int[n][n];

    System.out.printf("1ª. Matriz A  \n");
    for (i=0; i<n; i++) {
      System.out.printf("Informe os elementos da %da. linha:\n", (i+1));
      for (j=0; j<n; j++) {
        System.out.printf("a[%d][%d] = ", i, j);
        a[i][j] = scan.nextInt();
      }
      System.out.printf("\n");
    }

    System.out.printf("\n Matriz B  \n");
    for (i=0; i<n; i++) {
      System.out.printf("Informe os elementos da %da. linha:\n", (i+1));
      for (j=0; j<n; j++) {
        System.out.printf("b[%d][%d] = ", i, j);
        b[i][j] = scan.nextInt();
      }
      System.out.printf("\n");
    }
    for (i=0; i<n; i++) {
      for (j=0; j<n; j++) {
        soma = 0;
        for (k=0; k<n; k++) {
          soma = soma + (a[i][k] * b[k][j]);
        }
        ab[i][j] = soma;
      }
    }
    System.out.printf("\n1a. Matriz________\n");
    for (i=0; i<n; i++) {
      System.out.printf("%da. linha: ", (i+1));
      for (j=0; j<n; j++) {
        System.out.printf("%d ", a[i][j]);
      }
      System.out.printf("\n");
    }

    System.out.printf("\n2a. Matriz________\n");
    for (i=0; i<n; i++) {
      System.out.printf("%da. linha: ", (i+1));
      for (j=0; j<n; j++) {
        System.out.printf("%d ", b[i][j]);
      }
      System.out.printf("\n");
    }

    System.out.printf("\nA matriz produto AxB é: \n");
    for (i=0; i<n; i++) {
      System.out.printf("%da. linha: ", (i+1));
      for (j=0; j<n; j++) {
        System.out.printf("%d ", ab[i][j]);
      }
      System.out.printf("\n");
    } 
   }
}
   
