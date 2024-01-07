/*******************************************************************************
 * 17) Escreva um programa que leia um número inteiro. Verificar por meio de condição se o
 * valor fornecido está na faixa entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da
 * faixa, apresentar a mensagem “valor válido”. Caso contrário, apresentar a mensagem “valor
 *  inválido”.
 *******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Digite um numero");
        n1 = sc.nextInt();

        if(n1>=0 && n1 <= 9){
            System.out.println("Valor válido!");
        }else{
            System.out.println("Valor inválido!");
        }
    }
}