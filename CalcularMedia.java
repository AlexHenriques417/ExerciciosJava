import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Digite a primeira nota: ");
            float nota1 = scanner.nextFloat();

            System.out.println("Digite a segunda nota: ");
            float nota2 = scanner.nextFloat();

            System.out.println("Digite a terceira nota: ");
            float nota3 = scanner.nextFloat();

            float media = ( nota1 + nota2 + nota3 ) / 3;

            System.out.printf("A média das 3 notas é: %.2f\n", media);

            if( media >= 7 ){
                System.out.println("Você está aprovado");
            } else {
                System.out.println("Você está reprovado");
            }
        }
    }
}
