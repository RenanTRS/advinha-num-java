import java.util.Random;
import java.util.Scanner;

public class Advinha{

    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        
        int numero = random.nextInt(10);
        int num;
        
        System.out.println("Eu pensei em um número, tente advinhar:");
        num = scan.nextInt();
        if(num == numero){
            System.out.println("Parabéns você acertou!");
        }else{
            while(true){
                System.out.println("Você errou, tente novamente:");
                num = scan.nextInt();
                if(num == numero){
                    System.out.println("Você acertou!");
                    break;
                }
            }
            scan.close();
        }
    }
}