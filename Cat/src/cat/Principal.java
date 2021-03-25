package cat;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Cat gato = new Cat();
        gato.nome = "Sasha";
        gato.idade = 3;
        gato.raca = "Siberiano";
        gato.comprimento = 0.75;
        System.out.println("Olá, esse é o programa gato. Digite o número indicando o que deseja fazer");
        System.out.println("1 - conhecer o gato");
        System.out.println("2 - dar comida");
        System.out.println("3 - fazer carinho");
        System.out.println("4 - dar banho");
        System.out.println("5 - ouvir som");
        System.out.println("6 - Quantos anos terei");
        Scanner entrada = new Scanner(System.in);
        String answer = entrada.nextLine();

        switch (answer) {
            case "1":
                gato.whoIam();
                break;
            case "2":
                gato.comer();
                break;
            case "3":
                gato.fazerCarinho();
                break;
            case "4":
                gato.banho();
                break;
            case "5":
                gato.falar();
                break;
            case "6":
                System.out.println("Digite um número para somar com a idade atual:");
                Scanner numero = new Scanner(System.in);
                String numcaptado = numero.nextLine();
                double numsoma = Integer.parseInt(numcaptado);
                double newIdade = gato.quantosAnosTerei(numsoma);
                System.out.println(gato.nome +" terá "+ newIdade + " anos.");
                break;
            default:
                break;
        }

    }
}
