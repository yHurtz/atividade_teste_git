package verificadorvoto;

import java.util.Scanner;

public class VerificadorVoto {
    
    public static void main(String[] args) {
        int op;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("1 - Verificador de Idade");
            System.out.println("2 - Calculadora de Área de Quadrado");
            System.out.println("3 - Conversor de Temperatura");
            System.out.println("4 - Concatenador de Nome Completo");
            System.out.println("5 - Sair");
            System.out.println("Digite uma opção");
            op = scanner.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Digite uma idade:");
                    int idades = scanner.nextInt();
                    ChamarMetodo.podeVotar(idades);
                    break;
                default:
                    System.err.println("Opção inválida!");
            }
            
        }while (op != 5);
    }
}