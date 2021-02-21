
package teste3projeto;
import java.util.Scanner;
public class Teste3projeto {

    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
        
        int c=0, s=1, M[][]= new int [50][4], MM[][]= new int[50][2],d=0;  // s � a vari�vel de escolha no menu principal ; c � o contador de linhas da matriz(para cada vez q se seleciona a op��o de cadastrar uma pessoa ele aumenta em 1) ; O M[][] � a matriz principal aonde est�o cadastrados os dados ; 
        
        while(s==1 || s==2 || s==3){           // esse la�o de repeti��o serve para que sempre ap�s a execu��o de alguma op��o o programa volte no menu principal
            System.out.println("\nDigite o n�mero da op��o desejada                            1 - Cadastramento de visitas\n"   // inser��o da op��o desejada
                + "                                                             2 - Registro de sa�da\n"
                + "                                                             3 - Estat�stica");   
            s=entrada.nextInt();
            while(s<1 || s>3){                 // la�o de repeti��o para valida��o da op��o do menu
            
                System.out.println("\nDigite novamente o n�mero da op��o desejada                  1 - Cadastramento de visitas\n"
                + "                                                             2 - Registro de sa�da\n"
                + "                                                             3 - Estat�stica");
            s=entrada.nextInt();
            }
            if(s==1){                          // chamada dos m�dulos em fun��o da op��o escolhida no menu principal ( apenas a op��o 1 est� funcionando pois os outros m�dulos ainda n�o est�o inseridos)
                cadastramento(c,M);      
                c=c+1;                                
            }
            else{
                 if(s==2){
                 saida(M,c,MM,d);
                 d=d+1;
                 }
                 else{
                     if(s==3){
                     estatistica(M,c,d,MM);
                     }
                }
            }
        }
        
    }
    public static void cadastramento(int c,int M[][]){    // m�dulo de cadastro de pessoas ( o n�mero 1 do menu principal )
        
        Scanner entrada = new Scanner(System.in);
        
        
        
        System.out.print("\nDigite o RG do visitante:  ");
        M[c][0]=entrada.nextInt();
        System.out.print("\nInsira os quatro digitos da sala a ser visitada (nnnn / andar+sala):  "); 
        M[c][1]=entrada.nextInt();
        System.out.print("\nDigite o hor�rio de entrada do visitante (hhmm / 0-24h):  ");
        M[c][2]=entrada.nextInt();
        System.out.print("\nDigite o c�digo de motivo da visita                     - c�digo 1: Visita pessoal\n"
                + "                                                        - c�digo 2: Entrega de documentos\n"
                + "                                                        - c�digo 3: Retirada de documentos\n"
                + "                                                        - c�digo 4: Festividade na �rea comum\n");
        M[c][3]=entrada.nextInt();                         // valida��o do c�digo de motivo da visita
        while(M[c][3]>4 || M[c][3]<1){
            System.out.print("\nDigite o c�digo de visita novamente, inserindo um n�mero entre 1 e 4: ");
            M[c][3]=entrada.nextInt();
        }
        
    }
    public static void estatistica (int M[][], int c, int d, int MM[][]){
        Scanner entrada = new Scanner(System.in);
        
        int i,sala,cc1=0,cc2=0,cc3=0,ccc1=0,ccc2=0,ccc3=0,ccc4=0,p,pp=0,j=0,cccc,ccccc,A[]=new int [50],B[]=new int [50],C[]= new int [50],D[]=new int [50]; // cc1 = contador �ra moite ; cc2= contador para manh� ; cc3= contador para tarde ; ccc1=contador para visita pesoal; ccc2=contador para entrega de documentos; ccc3= contador para retirada de documentos; ccc4= contador para Festividade na �rea comum;A[]= Vetor para armazenar os andares visitados; p=contador de andares repetidos;pp=somat�rio do selecionamento do andar com mais repeti��o;ppp=contador do selecionamento do andar com mais repeti��o; cccc=contador da parte 2.
        
        //PARTE 1 do m�dulo
        System.out.print("\nDigite a sala que deseja saber as informa��es de visita por turno: ");
        sala=entrada.nextInt();
        
        for(i=0;i<c;i++){
            if(M[i][1]==sala){
                if(M[i][2]>1800 && M[i][2]>2359 || M[i][2]>0000 && M[i][2]<0600){
                    cc1=cc1+1;
                }
                else{
                    if(M[i][2]>=0600 && M[i][2]<=1200){
                        cc2=cc2+1;
                    }
                    else{
                        cc3=cc3+1;
                    }
                }
            }
        }
        System.out.println("\nO n�mero de visitas na sala "+sala+" no turno da noite foi de "+cc1);
        System.out.println("O n�mero de visitas na sala "+sala+" no turno da manh� foi de "+cc2);
        System.out.println("O n�mero de visitas na sala "+sala+" no turno da tarde foi de "+cc3);
        
        //PARTE 3 do m�dulo
        
        for(i=0;i<c;i++){
            if(M[i][3]==1){
                ccc1=ccc1+1;
            }
            else{
                if(M[i][3]==2){
                    ccc2=ccc2+1;
                }
                else{
                    if(M[i][3]==3){
                        ccc3=ccc3+1;
                    }
                    else{
                        ccc4=ccc4+1;
                    }
                }
            }
        }
        System.out.println("Houve "+ccc1+" solicita��o(�es) de visita pessoal\n");
        System.out.print("Houve "+ccc2+" solicita��o(�es) de entrega de documentos\n");
        System.out.print("Houve "+ccc3+" solicita��o(�es) de retirada de documentos\n");
        System.out.print("Houve "+ccc4+" solicita��o(�es) de entrada para festividades na �rea comum\n");
        
        for(i=0;i<c;i++){
            A[i]=M[i][1]/100;
        }
        for(j=0;j<c;j++){
            p=0;
            for(i=0;i<c;i++){
                if(A[j]==A[i]){
                    p=p+1;
                }
            }
            B[j]=p-1;
        }
        for(i=0;i<c;i++){
            if(B[i]>pp){
                pp=i;
            }
        }
        System.out.print("\nO andar mais visitado foi o "+A[pp]+"\n");
        
        //PARTE 2 do m�dulo
        
        for(i=0;i<c;i++){
            cccc=0;
            for(j=0;j<d;j++){
                if(M[i][0]==MM[j][0]){
                    cccc=cccc+1;
                }   
            }
            C[i]=cccc;
        }
        System.out.print("\nN�o houve saida(as) no(s) seguinte(es) RG(s)\n");
        for(i=0;i<c;i++){
            if(C[i]==0){
                System.out.println(M[i][0]);
            }
        }
        System.out.println("N�o houve saida(s) na(s) seguinte(s) sala(s)");
        for(i=0;i<c;i++){
            if(C[i]==0){
                System.out.println(M[i][1]);
            }
        }
    }
    public static void saida (int M[][], int c,int MM[][],int d){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o RG da pessoa a sair");
        MM[d][0]=entrada.nextInt();
        System.out.println("Digite o hor�rio de sa�da (hhmm)");
        MM[d][1]=entrada.nextInt();
    }
} 