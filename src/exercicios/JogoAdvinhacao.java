package exercicios;

import java.lang.Math;
import java.util.Scanner;

public class JogoAdvinhacao {

    public static void main(String[] args) {

        int numAleatorio = (int) (Math.random() * 100) + 1;
        Scanner entrada = new Scanner(System.in);

        int valor = 0;
        int tentativas = 1;
        System.out.println("JOGO DA ADVINHAÇÃO!");

//        for (int i = 0; i < 10; i++) {
//            System.out.print("Informe um número: ");
//            valor = entrada.nextInt();
//            if (valor == numAleatorio) {
//                System.out.printf("Parbéns, você acertou! \nO número correto é: %d",
//                        numAleatorio);
//            } else if (valor > numAleatorio) {
//                
//            }
//        }
        do {
            System.out.printf("Você está na dua %dº tentativa!\nInforme um número: ", tentativas);
            valor = entrada.nextInt();
            tentativas++;
        } while (valor != numAleatorio && tentativas <= 10);
        
        if (valor == numAleatorio) {
            System.out.printf("Parabén, você acertou!\n"
                    + "O número gerado aleatoriamente foi: %d",
                    numAleatorio);
        } else if (tentativas == 11 && valor == numAleatorio) {
            System.out.printf("Parabén, você acertou!\n"
                    + "O número gerado aleatoriamente foi: %d",
                    numAleatorio);
        } else if (tentativas == 11 && valor != numAleatorio) {
            System.out.printf("Infelizmente, não foi dessa vez!\n"
                    + "O número aleatório foi: %d.\n", numAleatorio);
        } else {
            System.out.println("ERRO!");
        }

        entrada.close();
    }

}
