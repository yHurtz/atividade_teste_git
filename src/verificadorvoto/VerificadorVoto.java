package verificadorvoto;

public class VerificadorVoto {

    public static String podeVotar(int idade) {
        if (idade >= 16) {
            return "Pode votar!";
        } else {
            return "Não pode votar";
        }
    }

    
    
    public static void main(String[] args) {
        // Teste com idade limite (16)
        int idade1 = 16;
        System.out.println("Idade: " + idade1 + " -> " + VerificadorVoto.podeVotar(idade1)); // Deve retornar "Pode votar."

        // Teste com idade acima de 16
        int idade2 = 25;
        System.out.println("Idade: " + idade2 + " -> " + VerificadorVoto.podeVotar(idade2)); // Deve retornar "Pode votar."

        // Teste com idade abaixo de 16
        int idade3 = 15;
        System.out.println("Idade: " + idade3 + " -> " + VerificadorVoto.podeVotar(idade3)); // Deve retornar "Não pode votar."

        // Teste com outra idade abaixo de 16
        int idade4 = 10;
        System.out.println("Idade: " + idade4 + " -> " + VerificadorVoto.podeVotar(idade4)); // Deve retornar "Não pode votar."
    }
}