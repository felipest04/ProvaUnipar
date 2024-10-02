import java.util.Scanner;

public class listaAlimentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alimentos: ");
        int quantidade = scanner.nextInt();

        double[] notas = new double[quantidade];
        int boas = 0;
        int ruins = 0;
        double soma = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a nota para o alimento " + (i + 1) + " (entre 0 e 10): ");
            double nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Por favor, insira uma nota entre 0 e 10.");
                i--;
                continue;
            }

            notas[i] = nota;
            soma += nota;

            if (nota >= 6) {
                boas++;
            } else {
                ruins++;
            }
        }

        double media = soma / quantidade;

        System.out.println("Média das avaliações: " + media);
        System.out.println("Quantidade de alinhamentos avaliados como bons: " + boas);
        System.out.println("Quantidade de alinhamentos avaliados como ruins: " + ruins);

        scanner.close();
    }
}
