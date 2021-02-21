/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu peso : ");
        int peso = sc.nextInt();
        System.out.print("Digite a sua altura : ");
        float altura = sc.nextFloat();
        float imc;
        imc=peso/(altura*altura);
        
            System.out.println("Seu Imc é de:"+imc);
        
            if (imc < 18.5) {
            System.out.println("Você Está abaixo do seu peso ideal");
    }
        
        if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Parabéns! Você está no seu peso normal");
            
    }
        if (imc >=25.0 && imc <= 29.9){
            System.out.println("Você está acima do seu peso(sobrepeso)");
    }
        if (imc >= 30 && imc <= 34.9 ){
             System.out.println("Obesidade grau I");
    }
        if (imc >= 35 & imc < 39.9){
             System.out.println("Obesidade grau II");
    }
        if (imc > 39.9) {
        System.out.print("Obesidade grau III");
    }
        
    }
    
}
