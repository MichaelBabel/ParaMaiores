import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Criando o formato de data
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua data de nascimento: ");
        // Recebe a data de nascimento em forma de String
        String data = scanner.nextLine();

        // Transformando a data em forma de String em LocalDate
        LocalDate dataLocalDate = LocalDate.parse(data, formato);

        // Data atual para comparação com a data de nascimento
        LocalDate hoje = LocalDate.now();

        // Data recebida - 18 anos
        if (dataLocalDate.isBefore(hoje.minusYears(18))) {
            System.out.println("Você está livre para acessar o conteúdo +18!");
        } else {
            System.out.println("O conteúdo +18 está bloqueado para você!");
        }
    }
}