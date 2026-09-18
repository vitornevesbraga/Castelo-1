import java.util.Scanner;

public class Castelo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho: ");
        int tamanho = scanner.nextInt();

        // Recebendo
        System.out.println("--- DIMENSAO " + tamanho + " x " + tamanho + " ---");


        // Altura da torre //
        for (int linha = 1; linha <= tamanho; linha++){

            //Largura da torre//
            for (int caractere = 1; caractere <= tamanho; caractere++){


                // "Cantos" da torre //
                if ((linha == 1 || linha == tamanho) && (caractere == 1 || caractere == tamanho)){
                    System.out.print("+");

                    // Interior da torre //
                }else if ((linha > 1 && linha < tamanho) && (caractere > 1 && caractere < tamanho)){
                    System.out.print(".");

                    // Parede e teto da torre //
                }else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}