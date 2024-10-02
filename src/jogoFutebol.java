import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class jogoFutebol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a quantidade de pessoas que irão votar: ");
        int quantidadeVotantes = scanner.nextInt();


        Map<Integer, String> times = new HashMap<>();
        times.put(1, "Taffismo club");
        times.put(2, "Patinho Branquinho");
        times.put(3, "Lucas FC");
        times.put(4, "Sport Redes");


        int[] votos = new int[4];


        for (int i = 0; i < quantidadeVotantes; i++) {
            System.out.println("\nEscolha um time para votar:");
            for (Map.Entry<Integer, String> entry : times.entrySet()) {
                System.out.println("Número: " + entry.getKey() + " - Time: " + entry.getValue());
            }

            int voto;
            while (true) {
                System.out.print("Digite o número do time: ");
                voto = scanner.nextInt();

                if (times.containsKey(voto)) {

                    switch (voto) {
                        case 80 -> votos[0]++;
                        case 70 -> votos[1]++;
                        case 60 -> votos[2]++;
                        case 50 -> votos[3]++;
                    }
                    break;
                } else {
                    System.out.println("Voto inválido! Por favor, escolha um número válido.");
                }
            }
        }


        System.out.println("\nResultados da votação:");
        String vencedor = "";
        int maxVotos = -1;

        for (Map.Entry<Integer, String> entry : times.entrySet()) {
            int indice = switch (entry.getKey()) {
                case 80 -> 0;
                case 70 -> 1;
                case 60 -> 2;
                case 50 -> 3;
                default -> -1;
            };

            System.out.println(entry.getValue() + ": " + votos[indice] + " voto(s)");

            if (votos[indice] > maxVotos) {
                maxVotos = votos[indice];
                vencedor = entry.getValue();
            }
        }

        System.out.println("O time vencedor é: " + vencedor);

        scanner.close();
    }
}
